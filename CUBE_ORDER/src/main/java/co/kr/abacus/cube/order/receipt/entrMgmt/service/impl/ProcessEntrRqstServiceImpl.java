package co.kr.abacus.cube.order.receipt.entrMgmt.service.impl;

import co.kr.abacus.cube.order.common.dto.ControlFieldDTO;
import co.kr.abacus.cube.order.receipt.entrMgmt.dto.EntrRqstOrderDTO;
import co.kr.abacus.cube.order.receipt.entrMgmt.entity.*;
import co.kr.abacus.cube.order.receipt.entrMgmt.repository.EntrRqstRepository;
import co.kr.abacus.cube.order.receipt.entrMgmt.service.ProcessEntrRqstService;
import co.kr.abacus.cube.order.receipt.orderMgmt.dto.OrderDTO;
import co.kr.abacus.cube.order.receipt.orderMgmt.entity.OrderEntity;
import co.kr.abacus.cube.order.receipt.orderMgmt.service.OrderMgmtCService;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class ProcessEntrRqstServiceImpl implements ProcessEntrRqstService {

  @Autowired
  private OrderMgmtCService orderMgmtCService;

  @Autowired
  private EntrRqstRepository entrRqstRepository;

  @Autowired
  private ModelMapper modelMapper;



  @Override
  @Transactional
  public void processEntrRqst(EntrRqstOrderDTO entrRqstOrderDTO, ControlFieldDTO controlFieldDTO) {
    log.debug("entrRqstOrderDTO ::" + entrRqstOrderDTO.toString());
    log.debug("controlFieldDTO ::" + controlFieldDTO.toString());
    OrderDTO orderDTO = OrderDTO.builder()
            .oderNumber(entrRqstOrderDTO.getWorkOrdrNo())
            .eventCode(entrRqstOrderDTO.getEventCode())
            .eventDetailCode(entrRqstOrderDTO.getEventDetailCode())
            .entrNo(entrRqstOrderDTO.getEntrRqst().getEntrNo())
            .prodNo(entrRqstOrderDTO.getEntrRqst().getProdNo())
            .build();

    orderDTO.setRequestObj(entrRqstOrderDTO.getRequestObj());

    long orderNumber = orderMgmtCService.createOrder(orderDTO, controlFieldDTO);

    entrRqstOrderDTO.setWorkOrdrNo(orderNumber);
    log.debug("orderNumber :: " + orderNumber);

    // 외부에서 vo 객체 생성
    EntrRqstServiceValue entrRqstServiceValue = EntrRqstServiceValue.builder()
            .prodCd(entrRqstOrderDTO.getEntrRqst().getSvcgrpCd())
            .svcgrpCd(entrRqstOrderDTO.getEntrRqst().getProdCd())
            .build();




    SbEntrApcntValue sbEntrApcntValue = SbEntrApcntValue.builder()
            .apcntNm(entrRqstOrderDTO.getEntrApcnt().getApcntNm())
            .sysCreateDate(controlFieldDTO.getSysCreateDate().toLocalDate())
            .sysUpdateDate(controlFieldDTO.getSysUpdateDate().toLocalDate())
            .operatorId(controlFieldDTO.getOperatorId())
            .applicationId(controlFieldDTO.getApplicationId())
            .dlServiceCode(controlFieldDTO.getDlServiceCode())
            .dlUpdateStamp(controlFieldDTO.getDlUpdateStamp().toString())
            .build();

    SbEntrRqstAtrctInfoValue sbEntrRqstAtrctInfoValue = SbEntrRqstAtrctInfoValue.builder()
            .entrDlrCd(entrRqstOrderDTO.getEntrRqstAtrctInfo().getEntrDlrCd())
            .atrctIntgBizCd(entrRqstOrderDTO.getEntrRqstAtrctInfo().getAtrctIntgBizCd())
            .sysCreateDate(controlFieldDTO.getSysCreateDate().toLocalDate())
            .sysUpdateDate(controlFieldDTO.getSysUpdateDate().toLocalDate())
            .operatorId(controlFieldDTO.getOperatorId())
            .applicationId(controlFieldDTO.getApplicationId())
            .dlServiceCode(controlFieldDTO.getDlServiceCode())
            .dlUpdateStamp(controlFieldDTO.getDlUpdateStamp().toString())
            .build();

    SbEntrRqstEntity sbEntrRqstEntity = SbEntrRqstEntity.builder()
            .workOrdrNo(entrRqstOrderDTO.getWorkOrdrNo())
            .entrRqstServiceValue(entrRqstServiceValue)
            .sbEntrApcntValue(sbEntrApcntValue)
            .sbEntrRqstAtrctInfoValue(sbEntrRqstAtrctInfoValue)
            .build();

    // Entity 내부 에서 vo 생성
    sbEntrRqstEntity.setEntrRqstContractValue(entrRqstOrderDTO.getEntrRqst().getEntrNo(),
            entrRqstOrderDTO.getEntrRqst().getAceno(),
            entrRqstOrderDTO.getEntrRqst().getBillAcntNo());

    // 외부에서 로직
    EntrRqstPhoneNumerValue entrRqstPhoneNumerValue =  new EntrRqstPhoneNumerValue();
    entrRqstPhoneNumerValue.setEntrRqstPhoneNumerValue(entrRqstOrderDTO.getEntrRqst().getProdNo());
    sbEntrRqstEntity.setEntrRqstPhoneNumerValue(entrRqstPhoneNumerValue);

    // 외부에서 객체 생성 후 setter
    EntrRqstStatusChangeValue entrRqstStatusChangeValue = EntrRqstStatusChangeValue.builder()
            .prgrsSttsCd(entrRqstOrderDTO.getEntrRqst().getPrgrsSttsCd())
            .build();

    sbEntrRqstEntity.setEntrRqstStatusChangeValue(entrRqstStatusChangeValue);


    // 제어 필드 설정
    sbEntrRqstEntity.setControlFieldVO(controlFieldDTO.getSysCreateDate().toLocalDate(),
            controlFieldDTO.getSysUpdateDate().toLocalDate(),
            controlFieldDTO.getOperatorId(),
            controlFieldDTO.getApplicationId(),
            controlFieldDTO.getDlServiceCode(),
            controlFieldDTO.getDlUpdateStamp());


    //Seco
    entrRqstRepository.save(sbEntrRqstEntity);
  }
}
