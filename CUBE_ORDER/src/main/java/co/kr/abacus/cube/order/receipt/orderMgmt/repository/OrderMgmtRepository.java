package co.kr.abacus.cube.order.receipt.orderMgmt.repository;

import co.kr.abacus.cube.order.receipt.orderMgmt.dto.OrderResponseDTO;
import co.kr.abacus.cube.order.receipt.orderMgmt.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMgmtRepository extends JpaRepository<OrderEntity, Long> {

   public OrderEntity findByOrderContractVOProdNo(String prodNO);

}
