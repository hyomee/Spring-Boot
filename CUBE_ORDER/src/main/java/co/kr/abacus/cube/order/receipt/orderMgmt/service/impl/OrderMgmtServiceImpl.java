package co.kr.abacus.cube.order.receipt.orderMgmt.service.impl;

import co.kr.abacus.cube.order.common.dto.ControlFieldDTO;
import co.kr.abacus.cube.order.receipt.orderMgmt.dto.OrderDTO;
import co.kr.abacus.cube.order.receipt.orderMgmt.dto.OrderResponseDTO;
import co.kr.abacus.cube.order.receipt.orderMgmt.entity.OrderContractVO;
import co.kr.abacus.cube.order.receipt.orderMgmt.entity.OrderEntity;
import co.kr.abacus.cube.order.receipt.orderMgmt.entity.OrderEventVO;
import co.kr.abacus.cube.order.receipt.orderMgmt.repository.OrderMgmtRepository;
import co.kr.abacus.cube.order.receipt.orderMgmt.service.OrderMgmtCService;
import co.kr.abacus.cube.order.receipt.orderMgmt.service.OrderMgmtService;
import com.fasterxml.jackson.databind.ObjectMapper;
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
  private OrderMgmtCService orderMgmtCService;

  @Autowired
  private Gson gson;

  @Transactional
  @Override
  public void createOrder(OrderDTO orderDTO, ControlFieldDTO controlFieldDTO) {

    orderMgmtCService.createOrder(orderDTO, controlFieldDTO);


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
