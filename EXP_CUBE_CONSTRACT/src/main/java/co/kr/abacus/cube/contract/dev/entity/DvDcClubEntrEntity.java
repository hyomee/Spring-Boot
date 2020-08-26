package co.kr.abacus.cube.contract.dev.entity;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Table(name="TB_DV_DC_CLUB_ENTR")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DvDcClubEntrEntity extends BaseEntity {
	
	@EmbeddedId
	private DcClubEntrKeyValue dcClubEntrKeyValue;
	
	//클럽 가입 일시 
	private Date clubEntrDttm;

}
