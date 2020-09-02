package co.kr.abacus.cube.order.receipt.orderMgmt.service.impl;

import co.kr.abacus.cube.order.common.dto.ControlFieldDTO;
import co.kr.abacus.cube.order.receipt.orderMgmt.dto.OrderDTO;
import co.kr.abacus.cube.order.receipt.orderMgmt.entity.OrderContractVO;
import co.kr.abacus.cube.order.receipt.orderMgmt.entity.OrderEntity;
import co.kr.abacus.cube.order.receipt.orderMgmt.entity.OrderEventVO;
import co.kr.abacus.cube.order.receipt.orderMgmt.repository.OrderMgmtRepository;
import co.kr.abacus.cube.order.receipt.orderMgmt.service.OrderMgmtCService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderMgmtCServiceImpl implements OrderMgmtCService {

  @Autowired
  private OrderMgmtRepository orderMgmtRepository;

  @Autowired
  private ModelMapper modelMapper;



  @Autowired
  private Gson gson;

  @Override
  public long createOrder(OrderDTO orderDTO, ControlFieldDTO controlFieldDTO) {
    log.debug("OrderMgmt ::" + orderDTO.toString());



    OrderEntity orderEntity = modelMapper.map(orderDTO, OrderEntity.class);

    // 제어 필드 설정
    orderEntity.setControlFieldVO(controlFieldDTO.getSysCreateDate().toLocalDate(),
            controlFieldDTO.getSysUpdateDate().toLocalDate(),
            controlFieldDTO.getOperatorId(),
            controlFieldDTO.getApplicationId(),
            controlFieldDTO.getDlServiceCode(),
            controlFieldDTO.getDlUpdateStamp());

    OrderEventVO orderEventVO = OrderEventVO.builder().build();
    boolean rn = orderEventVO.setEventAndEventDetail(orderDTO.getEventCode(), orderDTO.getEventDetailCode());
    log.debug("rn ====" + rn);
    OrderContractVO orderContractVO = OrderContractVO.builder()
            .entrNo(orderDTO.getEntrNo())
            .prodNo(orderDTO.getProdNo())
            .build();



    if (rn) {
      // 이벤트 구분 설정
      orderEntity.setOrderEventVO(orderEventVO);
      orderEntity.setOrderContractVO(orderContractVO);
      //String str = gson.toJson(orderDTO);
      //log.debug("str :: " + str);
      //orderEntity.setRequestObj( str );
      log.debug("orderEntity.getOderNumber :: " + orderEntity.getOderNumber());
      orderMgmtRepository.save(orderEntity);

    }

    return orderEntity.getOderNumber();

  }
}
