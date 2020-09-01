package co.kr.abacus.cube.order.receipt.orderMgmt.controller;

import co.kr.abacus.cube.order.common.dto.ControlFieldDTO;
import co.kr.abacus.cube.order.common.utils.ControlFieldSetting;
import co.kr.abacus.cube.order.receipt.orderMgmt.dto.OrderDTO;
import co.kr.abacus.cube.order.receipt.orderMgmt.dto.OrderResponseDTO;
import co.kr.abacus.cube.order.receipt.orderMgmt.service.OrderMgmtService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Slf4j
@RestController
public class OrderMgmtController {

  @Autowired
  private OrderMgmtService orderMgmtService;

  @Autowired
  private ControlFieldSetting header;

  @PostMapping(value="/createOrder")
  public void createOrder(HttpServletRequest request,
                          @RequestHeader Map<String, String> headers,
                          @RequestBody  OrderDTO orderDTO) {

    log.debug(orderDTO.toString());

    ControlFieldDTO controlFieldDTO = header.setControllField(headers);

    log.debug(controlFieldDTO.toString());
    orderMgmtService.createOrder(orderDTO, controlFieldDTO);

  }

  @GetMapping(value="/{orderNumner}")
  public OrderResponseDTO findByOrder(HttpServletRequest request,
                                      @PathVariable long orderNumner) {
    log.debug("orderNumner :: " + orderNumner);
    return orderMgmtService.findById(orderNumner);
  }
}


