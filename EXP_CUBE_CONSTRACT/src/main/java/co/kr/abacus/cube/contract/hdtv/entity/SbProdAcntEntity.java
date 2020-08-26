package co.kr.abacus.cube.contract.hdtv.entity;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

// TB_SB_PROD_ACNT
// 방송 센터 계정 관리 
@Entity
@Table(name="TB_SB_PROD_ACNT")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = true)
public class SbProdAcntEntity extends BaseEntity{
	
	// 계정 일련 번호 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ACNT_SRLNO")
	private long acntSrlno;
	
	
	@Column(name="ENTR_NO")
	private long entrNo;
	
	@Column(name="PROD_CD")
	private String prodCd;
	
	@Column(name="PROD_DV_CD")
	private String prodDvCd;
	
	@Column(name="ACNT_ID")
	private String acntId;
	
	@Column(name="ACNT_PSWD")
	private String acntPswd;
	
	@Column(name="LINK_ENTR_NO")
	private long linkEntrNo;
	
	@Column(name="ACNT_STTS_NM")
	private long acntSttsNm;
	
	@Column(name="ACNT_HPNO")
	private long acntHpno;
	
	@Column(name="VT_ID_YN")
	private long vtIdYn;
	
	// 추가 컬럼 존재 함 
	
	
	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(name = "TB_SB_NSCR_CTN",
					joinColumns = { @JoinColumn(name = "ACNT_SRLNO", referencedColumnName = "ACNT_SRLNO")})
	@OrderColumn(name="HPNO_SRLNO")
	private List<SbNscrCtnValue> nscrCtnValue;
	
	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(name = "TB_SB_NSCR_MAC",
					joinColumns = { @JoinColumn(name = "ACNT_SRLNO", referencedColumnName = "ACNT_SRLNO")})
	@OrderColumn(name="MAC_ADDR_SRLNO")
	private List<SbNscrMacValue> nscrMacValue;
	
	
	
	
}
