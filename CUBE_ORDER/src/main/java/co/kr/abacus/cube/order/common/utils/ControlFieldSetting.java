package co.kr.abacus.cube.order.common.utils;

import co.kr.abacus.cube.order.common.dto.ControlFieldDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
@Component
public class ControlFieldSetting {

  public ControlFieldDTO setControllField(Map<String, String> headers) {
    ControlFieldDTO controlFieldDTO = new ControlFieldDTO();

    controlFieldDTO.setControlFieldDTO(headers.get("operatorid").toString(),
            headers.get("applicationid").toString(),
            headers.get("dlservicecode").toString(),
            0);

    return controlFieldDTO;
  }

}
