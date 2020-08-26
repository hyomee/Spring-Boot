package co.kr.abacus.cube.contract.dev.entity;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="TB_DV_DEV_BY_ENTR")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SecondaryTables({
	@SecondaryTable(name="TB_DV_DEVC_CIRC_MGMT",
					pkJoinColumns= { @PrimaryKeyJoinColumn(name="ENTR_NO"), 
									 @PrimaryKeyJoinColumn(name="DEV_SALE_SEQNO")})
	})
public class DvDevByEntrEntity extends BaseEntity {
	
	@EmbeddedId
	private DevByEntrKeyValue devByEntrKeyValue;
	
	private String itemId;
	
	private String devSttsCd;
	
	// 단말 유통 관리  
    @Embedded
    @Basic(fetch=FetchType.LAZY)
    private DvDevcCircMgmtValue dvDevcCircMgmtValue;
    
    // 단말 유통 위약금 
    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(
        name = "TB_DV_DEVC_CIRC_PNLT",
        joinColumns = { @JoinColumn(name = "ENTR_NO", referencedColumnName = "ENTR_NO"), 
        		 		@JoinColumn(name = "DEV_SALE_SEQNO", referencedColumnName = "DEV_SALE_SEQNO")})
    @OrderColumn(name="RECP_SEQNO")
	private List<DvDevcCircPnltValue> dvDevcCircPnltValue;
	
	

}
