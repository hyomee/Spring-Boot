package co.abacus.order.receipt.orderMgmt.entity;

import com.sun.istack.NotNull;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Slf4j
@Embeddable
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OrderContractVO {

  @NonNull
  @Column(name="ENTR_NO")
  private String entrNo;

  @Column(name="ACENO")
  private String aceno;

  @Column(name="BILL_ACNT_NO")
  private String billAcntNo;

  @Column(name="HLDR_CUST_NO")
  private String hldrCustNo;

  @NonNull
  @Column(name="PROD_NO")
  private String prodNo;

  @Builder
  public OrderContractVO ( String entrNo,
                           String aceno,
                           String billAcntNo,
                           String hldrCustNo,
                           String prodNo) {
    Assert.hasText(entrNo, "entrNo must not be empty");
    Assert.hasText(prodNo, "prodNo must not be empty");

    this.entrNo = entrNo;
    this.aceno = aceno;
    this.billAcntNo = billAcntNo;
    this.hldrCustNo = hldrCustNo;
    this.prodNo = prodNo;


  }
}
