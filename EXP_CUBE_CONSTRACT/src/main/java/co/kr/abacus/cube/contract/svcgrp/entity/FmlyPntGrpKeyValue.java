package co.kr.abacus.cube.contract.svcgrp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Embeddable
public class FmlyPntGrpKeyValue implements Serializable {
	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="PNT_GRP_SEQNO")
	private long pntGrpSeqno;

	
	@Column(name="ENTR_NO")
	private long entrNo;
	
	@Column(name="HLDR_CUST_NO")
	private long hldrCustNo;
	
	@Column(name="HIST_SEQNO")
	private long histSeqno;
}
