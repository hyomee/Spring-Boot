package co.abacus.order.receipt.orderMgmt.controller;

import co.abacus.order.common.dto.ControlFieldDTO;
import co.abacus.order.common.utils.Header;
import co.abacus.order.receipt.orderMgmt.dto.OrderDTO;
import co.abacus.order.receipt.orderMgmt.dto.OrderResponseDTO;
import co.abacus.order.receipt.orderMgmt.entity.OrderEntity;
import co.abacus.order.receipt.orderMgmt.service.OrderMgmtService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Slf4j
@RestController
public class OrderMgmtController {

  @Autowired
  private OrderMgmtService orderMgmtService;

  @Autowired
  private Header header;

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


