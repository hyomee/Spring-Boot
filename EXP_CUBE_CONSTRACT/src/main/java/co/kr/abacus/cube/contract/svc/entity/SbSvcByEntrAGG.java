package co.kr.abacus.cube.contract.svc.entity;

import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.kr.abacus.cube.order.rqst.svc.entity.AsgnDcByNoRqstVO;
import co.kr.abacus.cube.order.rqst.svc.entity.RqstRsvVarDetlVO;

@Entity
@Table(name="TB_SB_SVC_BY_ENTR")
public class SbSvcByEntrAGG {	
	
	@EmbeddedId
	private SbSvcByEntrKeyVO SbSvcByEntrKeyVO;
	
	
	// 유치자 정보  ->  TABLE  TB_SB_ETBY_SVC_ADDV
	private EtbySvcAddvVO etbySvcAddvVO;
	
	// 서비스 요소 -> TABLE 
	private List<FtrVarDtlVO> ftrVarDtlVO;
		
	// 할인 지정 번호 --> TABLE 
	private List<AsgnDcByNoVO> asgnDcByNoVO;
	
	// 테이터 상품권 --> TB_SB_GIFT_SVC_ENTR
	private List<GiftSvcEntrVO> giftSvcEntrVO;
	
	

}
