package co.kr.abacus.cube.contract.dev.entity;

import java.util.List;

import javax.persistence.*;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

// 단말 판매 
@Entity
@Table(name="TB_DV_DEV_SALE")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SecondaryTables({
	@SecondaryTable(name="TB_DV_DEV_INSTT",
					pkJoinColumns= { @PrimaryKeyJoinColumn(name="ENTR_NO"), 
									 @PrimaryKeyJoinColumn(name="DEV_SALE_SEQNO")}),
	@SecondaryTable(name="TB_DV_DEV_SALE_DTL",
					pkJoinColumns= { @PrimaryKeyJoinColumn(name="ENTR_NO"), 
									 				 @PrimaryKeyJoinColumn(name="DEV_SALE_SEQNO")}),
	@SecondaryTable(name="TB_DV_GRTINS_FEE_BATCH_TRGT",
					pkJoinColumns= { @PrimaryKeyJoinColumn(name="ENTR_NO"),
									@PrimaryKeyJoinColumn(name="DEV_SALE_SEQNO")}),
	@SecondaryTable(name="TB_SBSD_PAY_INFO",
					pkJoinColumns= { @PrimaryKeyJoinColumn(name="ENTR_NO"),
									@PrimaryKeyJoinColumn(name="DEV_SALE_SEQNO")}),
	@SecondaryTable(name="TB_DV_DEVC_CIRC_MGMT",
	pkJoinColumns= { @PrimaryKeyJoinColumn(name="ENTR_NO"), 
					 @PrimaryKeyJoinColumn(name="DEV_SALE_SEQNO")})
	})
public class DvDevSaleEntity extends BaseEntity {
	
	@EmbeddedId
	private DevSaleKeyValue devSaleKeyValue;
	
	private String itemId;
	
	private String manfSerialNo;	
	
       
	// 단말 납부 
	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(
			name = "TB_DV_CHRG_PYM",
			joinColumns = { @JoinColumn(name = "ENTR_NO", referencedColumnName = "ENTR_NO"),
							        @JoinColumn(name = "DEV_SALE_SEQNO", referencedColumnName = "DEV_SALE_SEQNO")})
	@OrderColumn(name="DEV_CHRG_PYM_SEQNO")
	private List<DvDevChrgPymValue> dvDevChrgPymValue;
    
	// 단말 할부
	@Embedded
	@Basic(fetch = FetchType.LAZY)
	private DvDevInsttValue dvDevInsttValue;

	// 단말 판메 상세
	@Embedded
	@Basic(fetch = FetchType.LAZY)
	private DvDevSaleDtlValue dvDevSaleDtlValue;

	// 보증 보험료 패치 대상
	@Embedded
	@Basic(fetch = FetchType.LAZY)
	private DvGrtinsFeeBatchTrgtValue dvGrtinsFeeBatchTrgt;
	
	// 단말 유통 관리  
    @Embedded
    @Basic(fetch=FetchType.LAZY)
    private DvDevcCircMgmtValue dvDevcCircMgmtValue;
    
   

	// 단말 할부 요율 IF
	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(
					name = "TB_DV_INSTT_RATE_FRP_IF",
					joinColumns = { @JoinColumn(name = "ENTR_NO", referencedColumnName = "ENTR_NO"),
									@JoinColumn(name = "DEV_SALE_SEQNO", referencedColumnName = "DEV_SALE_SEQNO")})
	@OrderColumn(name="INSTT_RATE_ERP_SEQNO")
	private List<DvInsttRateErpIfValue> dvInsttRateErpIfValuesList;

	// 단말선납할인 위약금
	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(
					name = "TB_DV_PRPAY_DSCNT_PLNT",
					joinColumns = { @JoinColumn(name = "ENTR_NO", referencedColumnName = "ENTR_NO"),
									@JoinColumn(name = "DEV_SALE_SEQNO", referencedColumnName = "DEV_SALE_SEQNO")})
	@OrderColumn(name="MGMT_NO") // 관리 번호
	private List<DvPrpayDscntPlntValue> dvPrpayDscntPlntValueList;

  // RV 보험 가입
	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(
					name = "TB_DV_RVINS_ENTR",
					joinColumns = { @JoinColumn(name = "ENTR_NO", referencedColumnName = "ENTR_NO"),
									@JoinColumn(name = "DEV_SALE_SEQNO", referencedColumnName = "DEV_SALE_SEQNO")})
	@OrderColumn(name="RVINS_ENTR_SEQNO") // RV 보험 가입 누적 번호
	private List<DvRvinsEntrValue> dvRvinsEntrValueList;

	// 보조금 지급 정보
	@Embedded
	@Basic(fetch = FetchType.LAZY)
	private DvSbsdPayInfoValue dvSbsdPayInfoValue;

	// 중고 단말기 선납
	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(
					name = "TB_DV_SCHND_DEV_PRPAY",
					joinColumns = { @JoinColumn(name = "ENTR_NO", referencedColumnName = "ENTR_NO"),
									@JoinColumn(name = "DEV_SALE_SEQNO", referencedColumnName = "DEV_SALE_SEQNO")})
	@OrderColumn(name="SCHND_DEV_OROAY_SEQNO") // 중고단말기 선납 누적번호
	private List<DvSchndDevPrpayValue> dvSchndDevPrpayValueList;

	// 중고 단말기 매입
	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(
					name = "TB_DV_SCHND_DEV_PUCS",
					joinColumns = { @JoinColumn(name = "ENTR_NO", referencedColumnName = "ENTR_NO"),
									@JoinColumn(name = "DEV_SALE_SEQNO", referencedColumnName = "DEV_SALE_SEQNO")})
	@OrderColumn(name="SCHND_DEV_PUCS_SEQNO") // 중고단말기 매입 누적번호
	private List<DvSchndDevPucsValue> dvSchndDevPucsValueList;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumns( { @JoinColumn(name = "ENTR_NO", referencedColumnName = "ENTR_NO"),
								  @JoinColumn(name = "DEV_SALE_SEQNO", referencedColumnName = "DEV_SALE_SEQNO")})
	private List<DvSclubEntrEntity> dvSclubEntrEntityList;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumns( { @JoinColumn(name = "ENTR_NO", referencedColumnName = "ENTR_NO"),
					        @JoinColumn(name = "DEV_SALE_SEQNO", referencedColumnName = "DEV_SALE_SEQNO")})
	private List<DvUclubEntrEntity> dvUclubEntrEntityList;


}
