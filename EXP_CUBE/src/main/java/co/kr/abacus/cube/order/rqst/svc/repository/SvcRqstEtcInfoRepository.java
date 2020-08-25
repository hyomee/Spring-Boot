package co.kr.abacus.cube.order.rqst.svc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.kr.abacus.cube.order.rqst.svc.entity.SvcRqstEtcInfoAGG;

@Repository
public interface SvcRqstEtcInfoRepository extends JpaRepository<SvcRqstEtcInfoAGG, Long> {

}
