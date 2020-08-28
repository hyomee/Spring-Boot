package co.kr.abacus.cube.contract.rmng.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import co.kr.abacus.cube.contract.svcgrp.entity.SbEntrSvcGrpEntity;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


// 시간제 서비스 장비 연동 대상 정보 
@Entity
@Table(name="TB_SB_PERIOD_SVC_DTTM")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = true)
public class SbPeriodSvcDttmEntity extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="TM_DATA_RMNG_SEQNO")
	private long tmDataRmngSeqno;
	
	
	private long entrNo;
	private String svcDvCd;
	private String svcCd;
	
}
