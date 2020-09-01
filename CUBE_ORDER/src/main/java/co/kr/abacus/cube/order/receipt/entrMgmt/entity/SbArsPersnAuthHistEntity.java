package co.kr.abacus.cube.order.receipt.entrMgmt.entity;

import co.kr.abacus.cube.order.common.entity.ControlFieldVO;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="TB_ARS_PERS_AUTH_HIST")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = true)
public class SbArsPersnAuthHistEntity extends ControlFieldVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SNBR")
	private long snbr;
	
	private long entrRqstNo;
	private long entrNo;
	private String svcCd;
	private String authMthdDvCd;
	private String authDt;

}
