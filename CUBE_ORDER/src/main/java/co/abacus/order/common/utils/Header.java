package co.abacus.order.common.utils;

import co.abacus.order.common.dto.ControlFieldDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
@Component
public class Header {

  public  ControlFieldDTO setControllField(Map<String, String> headers) {
    ControlFieldDTO controlFieldDTO = new ControlFieldDTO();

   /* headers.forEach((key, value) -> {
      log.debug(String.format("Header '%s' = %s", key, value));
    });*/

    controlFieldDTO.setControlFieldDTO(headers.get("operatorid").toString(),
            headers.get("applicationid").toString(),
            headers.get("dlservicecode").toString(),
            0);

    return controlFieldDTO;
  }

}
