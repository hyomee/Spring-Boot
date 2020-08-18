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
	- prod : application-prod.yml

	#application-local.yml
	```
	user:
  		value1: 로컬
	```
	#application-dev.yml
	```
	user:
  		value1: 개발
	```
	#application-prod.yml
	```
	user:
  		value1: 운영
	```
2. application.yml에 active 속성을 지정 한다.
	- spring.profiles.active = local

	#application.yml
	```
	spring:
  		profiles:
    		active: local

	user:
  		value: 기본
	```

3. STS 또는 Eclipse에서 Boot 실행시 지정 
	Run Configurations > Spring Boot Tabs > profiles 지정  ( 예: dev )
	application.yml의 spring.profiles.active가 local로 지정이 되어 있어도 여기에서 지정된 것을 실행 된다. 
	
	```
	2020-08-18 23:53:15.117  INFO 12452 --- [           main] c.k.a.s.p.ExpPropertiesApplication       : Started ExpPropertiesApplication in 0.65 seconds (JVM running for 1.25)
	value :: 기본
	value1 :: 개발
	```

4. 배포시는 다음과 같이 실행을 하여 지정 할 수 있다.
	- java -Dspring.profiles.active=prod  -jar class_name.jar
 	- 해석되는 순서
 		- 명령행 인수
 		- 외부 application-{profiles}.yml
 		- 외부 application.yml
 		- 내부 application-{profiles}.yml
 		- 내부 application.yml
 		
	

	 
	