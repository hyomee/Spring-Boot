package co.kr.abacus.cube.contract.hdtv.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;


@Embeddable
public class SbNscrMacKeyVO implements Serializable {
	
	
	@Column(name="ACNT_SRLNO")
	private long acntSelno;
	
	
}
