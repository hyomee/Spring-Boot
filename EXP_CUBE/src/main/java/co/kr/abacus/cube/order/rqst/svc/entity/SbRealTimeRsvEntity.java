package co.kr.abacus.cube.order.rqst.svc.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.kr.abacus.cube.common.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name="TB_SB_REAL_TIME_RSV_SVC")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = true)
public class SbRealTimeRsvEntity extends BaseEntity {

	
	@EmbeddedId
	private RealTimeRsvKeyValue realTimeRsvKeyValue;
	
	private String svcDvCd;
	private long entrSvcSeqno;
}
