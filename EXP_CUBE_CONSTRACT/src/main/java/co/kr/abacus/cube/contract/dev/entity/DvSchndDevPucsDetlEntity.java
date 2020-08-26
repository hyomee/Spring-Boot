package co.kr.abacus.cube.contract.dev.entity;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

// 중고폰 판매 상세 
// TB_DV_RVINS_ENTR, TB_DV_SCHND_DEV_PUCS, 클럽 관련에서 사용 함 
@Entity
@Table(name="TB_DV_SCHND_DEV_PUCS_DETL")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = true)
public class DvSchndDevPucsDetlEntity extends BaseEntity {
	
	// 중고폰 단말기 매입 상세 누적 번호 , 가입번호, 단말기 판매 누적 번호, 중고폰단말기 매입 누적번호 
	@EmbeddedId
	private SchndDevPucsDetlKeyValue  shndDevPucsDetlKeyValue;
	
	// 매입 유형 구분 코드 
	private String pucsKdDcCd;
	
	// 모델 구분 코드 
	private String mdlDvCd;
	
	// 단말번호
	// 단말기수분코드
	// .....
	
	
	// 단말별체크리스트 결과
	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(name = "TB_DV_CHKLIST_APRAS_RSULT",
					joinColumns = { @JoinColumn(name = "SCHND_DEV_PUCS_DETL_SEQNO", referencedColumnName = "SCHND_DEV_PUCS_DETL_SEQNO")})
	@OrderColumn(name="SDPHN_LOC_CD")	
	private List<DvChkListAprasRsultValue> dvChkListAprasRsultValue;

}
