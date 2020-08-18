## 환경 파일 

Spring Boot에서 환경 파일의 위치 다음 위치에 있으며 기본 파일은 .properties 파잉 이다.
- src/main/resources/application.properties
=> .yml 파일로 변경 할려면 파일의 홪장자를 .yml로 변경을 하면 된다. (application.yml)

### 환경파일은 다음 순서대로 적용 됨 
1. 명령행 인수
2. 패키징된 application 외부의 application.properties
3. 패키징된 application 내부의 application.properties

### 환경 파일 구분 
환경 파일을 개발, 검증, 운영기에 각각 틀리게 적용 할 수 있으며 적용을 하기 위해서는 **spring.profiles.active**을 설정 하여야 한다.
1. 환경별로 properties.yml을 만든다.
	- local : application-local.yml
	- dev : application-dev.yml
	- real : application-dev.yml
2. application.yml에 active 속성을 지정 한다.
	- spring.profiles.active


!(https://github.com/hyomee/Spring-Boot-Study/blob/master/EXP_PROPERTIES/images/runconfig.PNG)

!(markdown_logo)(https://raw.github.com/dcurtis/markdown-mark/master/png/208x128.png)
