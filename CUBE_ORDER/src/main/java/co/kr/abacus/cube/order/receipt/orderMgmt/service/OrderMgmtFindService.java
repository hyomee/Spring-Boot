package co.kr.abacus.cube.order.receipt.orderMgmt.service;

import co.kr.abacus.cube.order.receipt.orderMgmt.dto.OrderResponseDTO;
import co.kr.abacus.cube.order.receipt.orderMgmt.entity.OrderEntity;

public interface OrderMgmtFindService {
  // entrNo QueryDsl
  public OrderResponseDTO findByEntrNo(String entrNo);
}
