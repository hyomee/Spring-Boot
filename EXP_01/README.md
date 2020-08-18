## 1. 결합도
결합도란 하나의 클래스가 다른 클래스와 얼마나 많이 연결되어 있는지를 나타내는 표현으로 결합도가 높으면 유지 보수가 어렵다

모바일 업무 중에 단말기 판매 업무는 단말 판매, 유심 판매, 기타 판매로 나뉘어 지는데 다음과 같은 클래스가 있다고 가정을 한다면 다음과 같은 클래스로 구성이 되어 있을 것 이다.

```
public class ModelDevice {
   // 일반 판매 
   public void modelSale() {
      System.out.println("일반  판매");
   }

   // 할부 판매 
   public void modelInstallment() {
      System.out.println("할부  판매");
   }
}

public class UsimDevice {
   // 일반 판매 
   public void usimSale() {
      System.out.println("일반  판매");
   }

   // 할부 판매 
   public void usimInstallment() {
      System.out.println("할부  판매");
   }
}


public class AccessoriesDevice {
   // 일반 판매 
   public void accessorieSale() {
      System.out.println("일반  판매");
   }

   // 할부 판매 
   public void accessorieInstallment() {
      System.out.println("할부  판매");
   }
}
```
Application에서 사용 하기 위해서는 다음과 같이 개발이 되어 있을 것 이다.
```
@SpringBootApplication
public class Exp01Application {

   public static void main(String[] args) {
      SpringApplication.run(Exp01Application.class, args);
      
      // 단말 판매
      ModelDevice modelDevice = new ModelDevice();

      modelDevice.modelSale();
      modelDevice.modelInstallment();
      
      // 유싱 판매
      UsimDevice usimDevice = new UsimDevice();

      usimDevice.usimSale();
      usimDevice.usimInstallment();
      
      // 기타 판매
      AccessoriesDevice accessoriesDevice = new AccessoriesDevice();

      accessoriesDevice.accessorieSale();
      accessoriesDevice.accessorieInstallment();
    }
}
```

만약 새로운 장비가 추가 되거나 여러 Application에서 판매 모듈은 사용 한다면 사용하는 모든 소스에 대해서 변경을 해야 하고 신규 추가 되는 업무를 위해서 영향도 파악을 해야 할 것 입니다.
즉 유지보수의 어려움이 있습니다.
이 문제를 해결 하기 위해서는 자바의 다양성과 패턴을 이용하고 메소드의 이름을 강제화 하여 결합도는 낮출 수 있습니다.

