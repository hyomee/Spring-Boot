package co.kr.abacus.cube.contract.hdtv.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// TB_SB_SVC_HDTV_COUPON_INFO
// 가입단위 쿠폰 ==> Data 없음 
@Entity
@Table(name="TB_SB_SVC_HDTV_COUPON_INFO")
public class SbSvcHdtvCouponInfoAGG {

	@Id
	private long cpnIsuNo;
}
