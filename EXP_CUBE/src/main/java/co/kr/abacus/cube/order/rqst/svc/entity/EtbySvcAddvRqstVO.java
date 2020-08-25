package co.kr.abacus.cube.order.rqst.svc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;

import co.kr.abacus.cube.common.entity.BaseDomain;

@Table(name="TB_SB_ETBY_SVC_ADDV_RQST")
public class EtbySvcAddvRqstVO extends BaseDomain {
	
	//@Id
	//@Column(name="ENTR_SVC_RQST_SEQNO")
	//private long entrSvcRqstSeqno;
	@Column(name="ENTR_NO")
	private String entrNo;
	
	@Column(name="ENTR_SVC_SEQNO")
	private long entrSvcSeqno;
	
	@Column(name="SALE_EMPNO")
	private String saleEmpno;
	
	@Column(name="LAST_INDC_ID")
	private String lastIndcId;
	
	@Column(name="LAST_INDC_CHNL_ID")
	private String lastIndcChnlCd;
	
	@Column(name="SALE_PATH_DV_CD")
	private String salePathDvCd;
	
	@Column(name="RSALE_POS_CD")
	private String rsalePosCd;
	
	@Column(name="SVC_STRT_RQST_DLR_CD")
	private String svcStrtRgstDlrCd;
	
	@Column(name="PROD_CUST_HOPE_DT")
	private Date prodCustHopeDt;
	
	@Column(name="SBGN_CHNG_APNT_DT")
	private Date sbgnChngApntDt;
	
	@Column(name="ITNG_BIZ_CD")
	private String itngBizCd;
	
	@Column(name="MGMR_ID")
	private String mgmrId;
	

}
