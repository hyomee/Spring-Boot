package co.abacus.order.receipt.orderMgmt.service.impl;

import co.abacus.order.common.dto.ControlFieldDTO;
import co.abacus.order.receipt.orderMgmt.dto.OrderDTO;
import co.abacus.order.receipt.orderMgmt.dto.OrderResponseDTO;
import co.abacus.order.receipt.orderMgmt.entity.OrderContractVO;
import co.abacus.order.receipt.orderMgmt.entity.OrderEntity;
import co.abacus.order.receipt.orderMgmt.entity.OrderEventVO;
import co.abacus.order.receipt.orderMgmt.enums.EventCode;
import co.abacus.order.receipt.orderMgmt.enums.EventDetailCode;
import co.abacus.order.receipt.orderMgmt.repository.OrderMgmtRepository;
import co.abacus.order.receipt.orderMgmt.service.OrderMgmtService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Slf4j
@Service
public class OrderMgmtServiceImpl implements OrderMgmtService {

  @Autowired
  private OrderMgmtRepository orderMgmtRepository;

  @Autowired
  private ModelMapper modelMapper;

  @Autowired
  private ObjectMapper objectMapper;

  @Autowired
  private Gson gson;

  @Transactional
  @Override
  public void createOrder(OrderDTO orderDTO, ControlFieldDTO controlFieldDTO) {
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
      //JsonNode jsonNode = objectMapper.convertValue(orderDTO, JsonNode.class);
      String str = gson.toJson(orderDTO);
      log.debug("str :: " + str);
      orderEntity.setRequestObj( str );
      log.debug("orderEntity.getOderNumber :: " + orderEntity.getOderNumber());
      //String orderEntityStr = gson.toJson(orderEntity);
      //orderEntity.setRequestObj( orderEntityStr );
      //orderEntity.setRequestObj( jsonNode.toString() );


      orderMgmtRepository.save(orderEntity);
    }


  }

  @Override
  public OrderResponseDTO findById(long oderNumber) {
    Optional<OrderEntity> orderEntity = orderMgmtRepository.findById(oderNumber);

    String str = orderEntity.get().getRequestObj();
    //String str = orderEntity.get().TO\;
    log.debug("findById :: str :: " + str);
    OrderResponseDTO orderResponseDTO = gson.fromJson(str,  OrderResponseDTO.class);
    orderResponseDTO.setOderNumber(oderNumber);
    /*log.debug();
    //log.debug("orderDTO ::" + jsonNode.toString());
    OrderResponseDTO orderResponseDTO = OrderResponseDTO.builder()
            .request(jsonNode)
            .build();*/

    return orderResponseDTO;
  }
}
