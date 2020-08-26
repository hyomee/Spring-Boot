package co.kr.abacus.cube.contract.svc.entity;

import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.kr.abacus.cube.order.rqst.svc.entity.AsgnDcByNoRqstValue;
import co.kr.abacus.cube.order.rqst.svc.entity.RqstRsvVarDetlValue;

@Entity
@Table(name="TB_SB_SVC_BY_ENTR")
public class SbSvcByEntrEntity {	
	
	@EmbeddedId
	private SvcByEntrKeyValue SbSvcByEntrKeyValue;
	
	// 유치자 정보  ->  TABLE  TB_SB_ETBY_SVC_ADDV
	private SbEtbySvcAddvValue sbEtbySvcAddvValue;
	
	// 서비스 요소 -> TABLE 
	private List<SbFtrVarDtlValue> sbFtrVarDtlValueList;
		
	// 할인 지정 번호 --> TABLE 
	private List<SbAsgnDcByNoValue> sbAsgnDcByNoValueList;
	
	// 테이터 상품권 --> TB_SB_GIFT_SVC_ENTR
	private List<SbGiftSvcEntrValue> sbGiftSvcEntrValueList;
	
	

}
