package co.kr.abacus.cube.contract.dcntasgnreld;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

// 할인 지정 관계 설정
@Entity
@Table(name="TB_SB_DCNT_ASGN_REL_D")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SbDcntAsgnRelDEntity extends BaseEntity{

	@EmbeddedId
	private DcntAsgnRelDKeyValue dcntAsgnRelDKeyValue ;
	
	private Date dscntAsgnEndDttm;
	
	private String dscntAsgnKdCd;
	
}
