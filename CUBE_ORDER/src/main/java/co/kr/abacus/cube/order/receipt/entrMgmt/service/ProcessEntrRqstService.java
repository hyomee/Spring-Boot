package co.kr.abacus.cube.order.receipt.entrMgmt.service;

import co.kr.abacus.cube.order.common.dto.ControlFieldDTO;
import co.kr.abacus.cube.order.receipt.entrMgmt.dto.EntrRqstOrderDTO;

public interface ProcessEntrRqstService {

  public void processEntrRqst(EntrRqstOrderDTO entrRqstOrderDTO, ControlFieldDTO controlFieldDTO) ;
}
