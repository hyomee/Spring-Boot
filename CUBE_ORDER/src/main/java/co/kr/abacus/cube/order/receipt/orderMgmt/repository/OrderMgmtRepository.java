package co.kr.abacus.cube.order.receipt.orderMgmt.repository;

import co.kr.abacus.cube.order.receipt.orderMgmt.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

// QuerydslPredicateExecutor<OrderEntity>
@Repository
public interface OrderMgmtRepository extends JpaRepository<OrderEntity, Long>, OrderMgmtUserRepository {

   public OrderEntity findByOrderContractVOProdNo(String prodNO);


}
