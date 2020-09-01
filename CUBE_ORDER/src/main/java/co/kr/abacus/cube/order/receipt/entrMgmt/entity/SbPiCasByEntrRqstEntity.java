package co.kr.abacus.cube.order.receipt.entrMgmt.entity;

import co.kr.abacus.cube.order.common.entity.ControlFieldVO;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="TB_PI_CAS_BY_ENTR_RQST")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = true)
public class SbPiCasByEntrRqstEntity extends ControlFieldVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="MEMBER_ID")
	private long memberId;
	

	@Column(name="UCUBE_INTG_ID")
	private String ucubeIntgId;
	
	@Column(name="ENTR_NO")
	private long entrNo;

}
