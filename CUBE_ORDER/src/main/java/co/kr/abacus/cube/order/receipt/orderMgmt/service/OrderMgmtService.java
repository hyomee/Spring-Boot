package co.kr.abacus.cube.order.receipt.orderMgmt.service;

import co.kr.abacus.cube.order.common.dto.ControlFieldDTO;
import co.kr.abacus.cube.order.receipt.orderMgmt.dto.OrderDTO;
import co.kr.abacus.cube.order.receipt.orderMgmt.dto.OrderResponseDTO;

public interface OrderMgmtService {

  public void createOrder(OrderDTO orderDTO, ControlFieldDTO controlFieldDTO);

  public OrderResponseDTO findById(long oderNumber);

  // Name기반 조회
  public OrderResponseDTO findByProdNo(String prodNo);


}
