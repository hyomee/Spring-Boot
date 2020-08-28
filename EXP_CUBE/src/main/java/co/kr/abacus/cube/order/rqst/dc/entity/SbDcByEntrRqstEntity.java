package co.kr.abacus.cube.order.rqst.dc.entity;

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
@Table(name="TB_SB_DC_BY_ENTR_RQST")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = true)
public class SbDcByEntrRqstEntity extends BaseEntity  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ENTR_RQST_NO")
	private long entrRqstNo;
	
	@Column(name="WORK_ODER_NO")
	private long workOrdrNo;
	
}
