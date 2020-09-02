package co.kr.abacus.cube.order.receipt.entrMgmt.controller;

import co.kr.abacus.cube.order.common.dto.ControlFieldDTO;
import co.kr.abacus.cube.order.common.utils.ControlFieldSetting;
import co.kr.abacus.cube.order.receipt.entrMgmt.dto.EntrRqstOrderDTO;
import co.kr.abacus.cube.order.receipt.entrMgmt.service.ProcessEntrRqstService;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
public class ProcessEntrRqstController {

  @Autowired
  private ControlFieldSetting header;

  @Autowired
  private ProcessEntrRqstService processEntrRqstService;

  @Autowired
  private Gson gson;

  @PostMapping(value="/processEntrRqstOrder")
  public void processEntrRqstOrder(@RequestHeader Map<String, String> headers,
                                   @RequestBody EntrRqstOrderDTO entrRqstOrderDTO) {

    log.debug("인입정보 :: " + entrRqstOrderDTO.toString());
    ControlFieldDTO controlFieldDTO = header.setControllField(headers);
    log.debug("제어필드 :: " +controlFieldDTO.toString());
    entrRqstOrderDTO.setRequestObj(gson.toJson(entrRqstOrderDTO));

    entrRqstOrderDTO.setControlFieldDTO(controlFieldDTO.getOperatorId(),
            controlFieldDTO.getApplicationId(),
            controlFieldDTO.getDlServiceCode(),
            controlFieldDTO.getDlUpdateStamp());


    processEntrRqstService.processEntrRqst(entrRqstOrderDTO, controlFieldDTO);


  }
}
