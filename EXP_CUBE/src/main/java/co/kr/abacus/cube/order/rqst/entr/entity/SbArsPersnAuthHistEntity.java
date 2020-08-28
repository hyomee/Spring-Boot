package co.kr.abacus.cube.order.rqst.entr.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import co.kr.abacus.cube.common.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="TB_SB_ENTR_SVC_GRP")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = true)
public class SbArsPersnAuthHistEntity extends BaseEntity {
	
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
