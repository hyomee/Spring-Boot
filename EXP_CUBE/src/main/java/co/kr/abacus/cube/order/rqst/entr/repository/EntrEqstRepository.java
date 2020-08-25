package co.kr.abacus.cube.order.rqst.entr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.kr.abacus.cube.order.rqst.entr.entity.EntrRqstAGG;

@Repository
public interface EntrEqstRepository extends JpaRepository<EntrRqstAGG, Long> {

}
