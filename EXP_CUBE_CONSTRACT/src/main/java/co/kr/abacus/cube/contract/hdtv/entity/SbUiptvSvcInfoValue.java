package co.kr.abacus.cube.contract.hdtv.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Table;
import java.io.Serializable;

@Embeddable
@Table(name="TB_SB_UIPTV_SVC_INFO")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SbUiptvSvcInfoValue implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String svcCd;

}
