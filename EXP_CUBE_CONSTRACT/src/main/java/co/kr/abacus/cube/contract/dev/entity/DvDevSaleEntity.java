package co.kr.abacus.cube.contract.dev.entity;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

// 단말 판매 
@Entity
@Table(name="TB_DV_DEV_SALE")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SecondaryTables({
	@SecondaryTable(name="TB_DV_DEV_INSTT",
					pkJoinColumns= { @PrimaryKeyJoinColumn(name="ENTR_NO"), 
									 @PrimaryKeyJoinColumn(name="DEV_SALE_SEQNO")}),
	@SecondaryTable(name="TB_DV_DEV_SALE_DTL",
					pkJoinColumns= { @PrimaryKeyJoinColumn(name="ENTR_NO"), 
									 @PrimaryKeyJoinColumn(name="DEV_SALE_SEQNO")})
	})
public class DvDevSaleEntity extends BaseEntity {
	
	@EmbeddedId
	private DevSaleKeyValue devSaleKeyValue;
	
	private String itemId;
	
	private String manfSerialNo;	
	
       
	// 단말 납부 
    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(
        name = "TB_DV_CHRG_PYM",
        joinColumns = { @JoinColumn(name = "ENTR_NO", referencedColumnName = "ENTR_NO"), 
        		 		@JoinColumn(name = "DEV_SALE_SEQNO", referencedColumnName = "DEV_SALE_SEQNO")})
    @OrderColumn(name="DEV_CHRG_PYM_SEQNO")
	private List<DvDevChrgPymValue> dvDevChrgPymValue;
    
    // 단말 할부 
    @Embedded
    private DvDevInsttValue dvDevInsttValue;
    
    // 단말 할부 
    @Embedded
    private DvDevSaleDtlValue dvDevSaleDtlValue;
    
 
    
}
