package co.abacus.order.receipt.orderMgmt.repository;

import co.abacus.order.receipt.orderMgmt.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMgmtRepository extends JpaRepository<OrderEntity, Long> {
}
