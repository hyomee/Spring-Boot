package co.kr.abacus.spring.xml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import co.kr.abacus.spring.xml.entr.service.EntrService;

@SpringBootApplication
@ImportResource({"classpath*:applicationContext.xml"})
public class ExpXmlApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExpXmlApplication.class, args);
		
		EntrService entrService = applicationContext.getBean(EntrService.class);
		
		entrService.entrSvc();
	}

}
