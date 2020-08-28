package co.kr.abacus.cube.contract.svcgrp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
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
public class SbEntrSvcGrpEntity extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SVC_GRP_SEQNO")
	private long svcGrpSeqno;
	
	private String svcGrpCd;
	private long svcGrpFrstOprtr;
	private String svcGrpPrssDlrCd;
	private String svcGrpSttsCd;
	private Date valdStrtDt;
	private Date valdEndDt;
	

}
