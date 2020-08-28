package co.kr.abacus.cube.contract.svc.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Table(name="TB_SB_GIFT_SVC_ENTR")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SbGiftSvcEntrValue extends BaseEntity {

	// 가입번호 
	@Column(name="ENTR_NO")
	private String entrNo;
	
	private String svcCd;
		
}
