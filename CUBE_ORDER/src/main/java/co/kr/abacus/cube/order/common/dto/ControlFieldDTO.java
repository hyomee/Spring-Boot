package co.kr.abacus.cube.order.common.dto;

import java.time.LocalDateTime;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ControlFieldDTO {

 	private LocalDateTime sysCreateDate;
	private LocalDateTime sysUpdateDate;
	private String operatorId;
  private String applicationId;
  private String dlServiceCode;
  private Integer dlUpdateStamp;

  private String requestObj;


  public void setControlFieldDTO(String operatorId,
                         String applicationId,
                         String dlServiceCode,
                         Integer dlUpdateStamp) {

    if (sysCreateDate == null) {
      this.sysCreateDate = getCurrentDate();
    }

    if (sysUpdateDate == null) {
      this.sysUpdateDate = getCurrentDate();
    }

    this.operatorId = operatorId;
    this.applicationId = applicationId;
    this.dlServiceCode = dlServiceCode;
    this.dlUpdateStamp = dlUpdateStamp;

  }

  public void setdlUpdateStamp(Integer dlUpdateStamp ) {
    this.dlUpdateStamp = dlUpdateStamp + 1;
  }

  public void setRequestObj(String str) {
    this.requestObj = str;
  }

  private LocalDateTime getCurrentDate() {
    return LocalDateTime.now();
  }



}
