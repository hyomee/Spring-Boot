package co.kr.abacus.cube.contract.dev.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class DtslDlrInfoListKeyValue implements Serializable {

  // 꼬리표번호
  @Column(name="RCPT_SEQ_NO")
  private String rcptSeqNo;

  // 가입번호
  @Column(name="ENTR_NO")
  private long entrNo;

  // 상품번호
  @Column(name = "PROD_NO")
  private String prodNo;

  // 명의자 고객번호
  @Column(name="HLDR_CUST_NO")
  private long hldrCustNo;

  // 꼬리표 발송 일자
  @Column(name="RCPT_DT")
  private Date rcptDt;

}
