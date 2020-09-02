package co.kr.abacus.cube.order.receipt.orderMgmt.service.impl;

import co.kr.abacus.cube.order.receipt.orderMgmt.dto.OrderResponseDTO;
import co.kr.abacus.cube.order.receipt.orderMgmt.entity.OrderEntity;
import co.kr.abacus.cube.order.receipt.orderMgmt.entity.QOrderEntity;
import co.kr.abacus.cube.order.receipt.orderMgmt.repository.OrderMgmtUserRepository;
import co.kr.abacus.cube.order.receipt.orderMgmt.service.OrderMgmtFindService;
import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@NoRepositoryBean
public class OrderMgmtFindServiceImpl extends QuerydslRepositorySupport implements OrderMgmtFindService, OrderMgmtUserRepository {


  @Autowired
  private ModelMapper modelMapper;

  @Autowired
  private Gson gson;

  public OrderMgmtFindServiceImpl() {
    super(OrderEntity.class);
  }

  @Override
  public OrderResponseDTO findByEntrNo(String entrNo) {
    OrderEntity orderEntity = findByOrderContractVOEntrNo(entrNo);
    OrderResponseDTO orderResponseDTO = modelMapper.map(orderEntity, OrderResponseDTO.class);
    orderResponseDTO.setAceno(orderEntity.getOrderContractVO().getAceno());
    orderResponseDTO.setProdNo(orderEntity.getOrderContractVO().getProdNo());
    String str = orderEntity.getRequestObj();

    HashMap jsonNode = gson.fromJson(str, HashMap.class);
    orderResponseDTO.setRequestObj(jsonNode);
    return orderResponseDTO;
  }

  @Override
  public OrderEntity findByOrderContractVOEntrNo(String entrNo) {
    QOrderEntity orderEntity = QOrderEntity.orderEntity;
    return from(orderEntity)
            .where(orderEntity.orderContractVO.entrNo.eq(entrNo))
            .fetchOne();
  }
}
