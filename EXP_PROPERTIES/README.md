## 환경 파일 

Spring Boot에서 환경 파일의 위치 다음 위치에 있으며 기본 파일은 .properties 파잉 이다.
- src/main/resources/application.properties
=> .yml 파일로 변경 할려면 파일의 홪장자를 .yml로 변경을 하면 된다. (application.yml)

### 환경파일은 다음 순서대로 적용이 되어지진다.
1. 명령행 인수
2. 패키징된 application 외부의 application.properties
3. 패키징된 application 내부의 application.properties

