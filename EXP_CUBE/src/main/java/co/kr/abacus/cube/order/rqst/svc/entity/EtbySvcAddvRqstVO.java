package co.kr.abacus.cube.order.rqst.svc.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import co.kr.abacus.cube.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class EtbySvcAddvRqstVO {

	@Column(table="TB_SB_ETBY_SVC_ADDV_RQST", name="ENTR_NO")
	private String entrNo;
	
	@Column(table="TB_SB_ETBY_SVC_ADDV_RQST", name="ENTR_SVC_SEQNO")
	private long entrSvcSeqno;
	
	@Column(table="TB_SB_ETBY_SVC_ADDV_RQST", name="SALE_EMPNO")
	private String saleEmpno;
	
	@Column(table="TB_SB_ETBY_SVC_ADDV_RQST", name="LAST_INDC_ID")
	private String lastIndcId;
	
	@Column(table="TB_SB_ETBY_SVC_ADDV_RQST", name="LAST_INDC_CHNL_ID")
	private String lastIndcChnlCd;
	
	@Column(table="TB_SB_ETBY_SVC_ADDV_RQST", name="SALE_PATH_DV_CD")
	private String salePathDvCd;
	
	@Column(table="TB_SB_ETBY_SVC_ADDV_RQST", name="RSALE_POS_CD")
	private String rsalePosCd;
	
	@Column(table="TB_SB_ETBY_SVC_ADDV_RQST", name="SVC_STRT_RQST_DLR_CD")
	private String svcStrtRgstDlrCd;
	
	@Column(table="TB_SB_ETBY_SVC_ADDV_RQST", name="PROD_CUST_HOPE_DT")
	private Date prodCustHopeDt;
	
	@Column(table="TB_SB_ETBY_SVC_ADDV_RQST", name="SBGN_CHNG_APNT_DT")
	private Date sbgnChngApntDt;
	
	@Column(table="TB_SB_ETBY_SVC_ADDV_RQST", name="ITNG_BIZ_CD")
	private String itngBizCd;
	
	@Column(table="TB_SB_ETBY_SVC_ADDV_RQST", name="MGMR_ID")
	private String mgmrId;

	//@CreationTimestamp
	@Column(table="TB_SB_ETBY_SVC_ADDV_RQST", name="SYS_CREATE_DATE", nullable = false, updatable = false)
	private LocalDate sysCreateDate;

	//@UpdateTimestamp
	@Column(table="TB_SB_ETBY_SVC_ADDV_RQST", name="SYS_UPDATE_DATE", nullable = false)
	private LocalDate sysUpdateDate;

	@Column(table="TB_SB_ETBY_SVC_ADDV_RQST", name="OPERATOR_ID")
	private String operatorId;

	@Column(table="TB_SB_ETBY_SVC_ADDV_RQST", name="APPLICATION_ID")
	private String applicationId;

	@Column(table="TB_SB_ETBY_SVC_ADDV_RQST", name="DL_SERVICE_CODE")
	private String dlServiceCode;

	@Column(table="TB_SB_ETBY_SVC_ADDV_RQST", name="DL_UPDATE_STAMP")
	private String dlUpdateStamp;
	

}
