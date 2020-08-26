package co.kr.abacus.cube.contract.entr.entity;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="TB_SB_ENTR")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@SecondaryTables({
	@SecondaryTable(name="TB_SB_ENTR_CNTC",
								pkJoinColumns=@PrimaryKeyJoinColumn(name="ACENO")) })
@EqualsAndHashCode(callSuper = true)
public class SbEntrEntity extends BaseEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ENTR_NO")
	private long entrNo;
	
	@Column(name="WORK_ODER_NO")
	private long workOderNo;
	
	
	// 가입계약 
	@Embedded
	private EntrCntcValue entrCntcValue;
	
	// 가입대리인 
	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(name = "TB_ENTR_AGNT",
					joinColumns = { @JoinColumn(name = "ENTR_NO", referencedColumnName = "ENTR_NO")})
	@OrderColumn(name="AGNT_SEQNO")
	private List<EntrAgntValue> EntrAgntValue;
}
