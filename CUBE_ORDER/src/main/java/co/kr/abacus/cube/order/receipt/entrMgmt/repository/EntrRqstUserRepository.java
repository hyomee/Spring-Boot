package co.kr.abacus.cube.order.receipt.entrMgmt.repository;

import co.kr.abacus.cube.order.receipt.entrMgmt.entity.SbEntrRqstEntity;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

@Repository
public class EntrRqstUserRepository extends QuerydslRepositorySupport {

  private final JPAQueryFactory queryFactory;

  public EntrRqstUserRepository(JPAQueryFactory queryFactory) {
    super(SbEntrRqstEntity.class);
    this.queryFactory = queryFactory;
  }


}
