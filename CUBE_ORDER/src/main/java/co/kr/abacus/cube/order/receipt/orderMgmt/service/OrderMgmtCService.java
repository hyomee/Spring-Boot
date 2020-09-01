package co.kr.abacus.cube.order.receipt.orderMgmt.service;

import co.kr.abacus.cube.order.common.dto.ControlFieldDTO;
import co.kr.abacus.cube.order.receipt.orderMgmt.dto.OrderDTO;

public interface OrderMgmtCService {

  public long createOrder(OrderDTO orderDTO, ControlFieldDTO controlFieldDTO);
}
