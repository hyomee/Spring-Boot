package co.kr.abacus.cube.contract.entr.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_SB_ENTR_HIST")
public class SbEntrHistEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ENTR_NO")
	private long entrNo;
	
	@Column(name="WORK_ODER_NO")
	private long workOderNo;
	
}
