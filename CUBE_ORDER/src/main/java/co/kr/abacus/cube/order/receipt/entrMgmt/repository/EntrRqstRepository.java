package co.kr.abacus.cube.order.receipt.entrMgmt.repository;

import co.kr.abacus.cube.order.receipt.entrMgmt.entity.SbEntrRqstEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrRqstRepository extends JpaRepository<SbEntrRqstEntity, Long> {
}
