package co.kr.abacus.cube.contract.dev.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

// 부가장치 판매 
@Entity
@Table(name="TB_DV_ADDEV_SALE")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = true)
@SecondaryTables({
	@SecondaryTable(name="TB_DV_ADDEV_SALE_DTL",
								pkJoinColumns=@PrimaryKeyJoinColumn(name="ADDEV_SALE_NO")) 
	})
public class DvAddevSaleEntity extends BaseEntity {
	
	// 부가 장치 판매 번호 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ADDEV_SALE_NO")
	private long addevSaleNo;
	
	// 가입번호 
	@Column(name="ENTR_NO")
	private String entrNo;
	
	
	// 모델 구분 코드 
	@Column(name="MDL_DV_CD")
	private String mdlDvCd;
	
	
	// 부기징치 판매 상세 
	@Embedded
	private AddevSaleDtlValue addevSaleDtlValue;
	
	
	

}
