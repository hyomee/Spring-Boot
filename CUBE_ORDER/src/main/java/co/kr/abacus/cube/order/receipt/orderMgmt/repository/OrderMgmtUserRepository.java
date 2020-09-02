package co.kr.abacus.cube.order.receipt.orderMgmt.repository;

import co.kr.abacus.cube.order.receipt.orderMgmt.dto.OrderResponseDTO;
import co.kr.abacus.cube.order.receipt.orderMgmt.entity.OrderEntity;

public interface OrderMgmtUserRepository  {
  public OrderEntity findByOrderContractVOEntrNo(String entrNo);
}
