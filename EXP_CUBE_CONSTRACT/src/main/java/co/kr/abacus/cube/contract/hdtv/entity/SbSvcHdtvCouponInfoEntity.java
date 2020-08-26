package co.kr.abacus.cube.contract.hdtv.entity;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// TB_SB_SVC_HDTV_COUPON_INFO
// 가입단위 쿠폰 ==> Data 없음 
@Entity
@Table(name="TB_SB_SVC_HDTV_COUPON_INFO")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SbSvcHdtvCouponInfoEntity extends BaseEntity {

	// 쿠폰 빌급 번호
	@Id
	private long cpnIsuNo;

	// 쿠폰 코드 값값
	private  String cpnCdValue;
}
