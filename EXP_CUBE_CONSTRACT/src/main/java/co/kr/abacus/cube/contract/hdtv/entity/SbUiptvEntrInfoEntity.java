package co.kr.abacus.cube.contract.hdtv.entity;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="TB_SB_UIPTV_ENTR_INFO")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SbUiptvEntrInfoEntity extends BaseEntity {
	
	@Id
	private long entrNo;

	private String itemType;

	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(name = "TB_SB_UIPTV_SVC_INFO",
					joinColumns = { @JoinColumn(name = "ENTR_NO", referencedColumnName = "ENTR_NO")})
	@OrderColumn(name="SVC_CD", columnDefinition = "String")
	private List<SbUiptvSvcInfoValue> sbUiptvSvcInfoValues;


}
