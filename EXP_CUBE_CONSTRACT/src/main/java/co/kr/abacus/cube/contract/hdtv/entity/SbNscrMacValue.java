package co.kr.abacus.cube.contract.hdtv.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

// NSCREEN MAC 정보 
@Embeddable
@Table(name="TB_SB_NSCR_MAC")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SbNscrMacValue extends BaseEntity {

	// 가입 번호 
	@Column(name="ENTR_NO")
	private long entrNo;
	
	// MAC 주소 
	@Column(name="MAC_ADDR")
	private String macAddr;
	
	// 자사여부 
	
	// 인증 구분 코드 
	
	// 상태 사유 코드 
	
	// 서비스 코드 
	
	// 단말기속성 코드 
	
	// 서비스 구분 코드
}
