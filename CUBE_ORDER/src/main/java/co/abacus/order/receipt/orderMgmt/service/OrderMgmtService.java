package co.abacus.order.receipt.orderMgmt.service;

import co.abacus.order.common.dto.ControlFieldDTO;
import co.abacus.order.receipt.orderMgmt.dto.OrderDTO;
import co.abacus.order.receipt.orderMgmt.dto.OrderResponseDTO;
import co.abacus.order.receipt.orderMgmt.entity.OrderEntity;

public interface OrderMgmtService {

  public void createOrder(OrderDTO orderDTO, ControlFieldDTO controlFieldDTO);

  public OrderResponseDTO findById(long oderNumber);
}
