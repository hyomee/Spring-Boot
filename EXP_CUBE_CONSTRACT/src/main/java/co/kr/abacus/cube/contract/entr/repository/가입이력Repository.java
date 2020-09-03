package co.kr.abacus.cube.contract.entr.repository;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.kr.abacus.cube.contract.entr.entity.SbEntrHistEntity;

@Repository
public interface 가입이력Repository extends JpaRepository<SbEntrHistEntity, Long> {
	
	public Map 번호변경횟수조회();
}