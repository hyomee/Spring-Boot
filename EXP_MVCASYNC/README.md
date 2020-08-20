## SPRING MVC 비동기
<h3>개념</h3> : 
주요 컨테이너는 요청당 하나의 스레드를 사용 한다 . 
즉 요청이 왼료 될 때 까지 클라이언트는 대기 하고 서버는 클라이언크로 응답을 전달 될 때 까지 스레드가 븍록이 된다.  
HTTP의 요청이 증가 함에 따라 블록된 스레드를 사용 하는 것응 비효율적이다.  
서블릿 3.1 스펙에서는 비동기적으로 처리 할 수 있는데 요청에 대해서 새로운 스레드가 백그라운드에서 수행 되며, 결과가 나오는 즉시 클라이언트로 보내 진다.  

<h3>Spring MVC에서 반환 타입</h3>

1. DefferedResult<V> : 다른 스레드로 생성된 비동기 결과
2. ListenableFuture<V> : 다른 스레드로 생성된 비동기 결과
3. CompletionStage<V>/CompletableFutrue<V> : 다른 스레드로 생성된 비동기 결과
4. Callable<V> : 작업이 끝난 후 생성된 결과를 비동기 처리 한다.
	```
	@RestController
	public class AsyncCallableController {
	
		@GetMapping
		public Callable<String> callable() {
			return () -> {
				Thread.sleep(ThreadLocalRandom.current().nextInt(5000));
				return "Callable Return";
			};
		}
	}
	```
	<pre>
	 .   ____          _            __ _ _
	 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
	( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
	 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
	  '  |____| .__|_| |_|_| |_\__, | / / / /
	 =========|_|==============|___/=/_/_/_/
	 :: Spring Boot ::        (v2.3.3.RELEASE)
	
	2020-08-20 23:45:58.681  INFO 18844 --- [           main] c.k.a.s.async.ExpMvcasyncApplication     : Starting ExpMvcasyncApplication on DESKTOP-AE33B8I with PID 18844 (X:\EXP-PRJ\SpringBoot\EXP_MVCASYNC\target\classes started by abacus in X:\EXP-PRJ\SpringBoot\EXP_MVCASYNC)
	2020-08-20 23:45:58.683  INFO 18844 --- [           main] c.k.a.s.async.ExpMvcasyncApplication     : No active profile set, falling back to default profiles: default
	2020-08-20 23:45:59.400  INFO 18844 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
	2020-08-20 23:45:59.408  INFO 18844 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
	2020-08-20 23:45:59.408  INFO 18844 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.37]
	2020-08-20 23:45:59.500  INFO 18844 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
	2020-08-20 23:45:59.501  INFO 18844 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 777 ms
	2020-08-20 23:45:59.688  INFO 18844 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
	2020-08-20 23:45:59.708 DEBUG 18844 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : ControllerAdvice beans: 0 @ModelAttribute, 0 @InitBinder, 1 RequestBodyAdvice, 1 ResponseBodyAdvice
	2020-08-20 23:45:59.755 DEBUG 18844 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : 3 mappings in 'requestMappingHandlerMapping'
	2020-08-20 23:45:59.773 DEBUG 18844 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Patterns [/webjars/**, /**] in 'resourceHandlerMapping'
	2020-08-20 23:45:59.778 DEBUG 18844 --- [           main] .m.m.a.ExceptionHandlerExceptionResolver : ControllerAdvice beans: 0 @ExceptionHandler, 1 ResponseBodyAdvice
	2020-08-20 23:45:59.845  INFO 18844 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
	2020-08-20 23:45:59.853  INFO 18844 --- [           main] c.k.a.s.async.ExpMvcasyncApplication     : Started ExpMvcasyncApplication in 1.467 seconds (JVM running for 2.341)
	2020-08-20 23:46:06.448  INFO 18844 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
	2020-08-20 23:46:06.448  INFO 18844 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
	2020-08-20 23:46:06.448 DEBUG 18844 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Detected StandardServletMultipartResolver
	2020-08-20 23:46:06.451 DEBUG 18844 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : enableLoggingRequestDetails='false': request parameters and headers will be masked to prevent unsafe logging of potentially sensitive data
	2020-08-20 23:46:06.451  INFO 18844 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 3 ms
	2020-08-20 23:46:06.458 DEBUG 18844 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : GET "/", parameters={}
	2020-08-20 23:46:06.462 DEBUG 18844 --- [nio-8080-exec-1] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped to co.kr.abacus.spring.async.controller.AsyncCallableController#callable()
	2020-08-20 23:46:06.472 DEBUG 18844 --- [nio-8080-exec-1] o.s.w.c.request.async.WebAsyncManager    : Started async request
	2020-08-20 23:46:06.473 DEBUG 18844 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Exiting but response remains open for further handling
	2020-08-20 23:46:09.572 DEBUG 18844 --- [         task-1] o.s.w.c.request.async.WebAsyncManager    : Async result set, dispatch to /
	2020-08-20 23:46:09.578 DEBUG 18844 --- [nio-8080-exec-2] o.s.web.servlet.DispatcherServlet        : "ASYNC" dispatch for GET "/", parameters={}
	2020-08-20 23:46:09.579 DEBUG 18844 --- [nio-8080-exec-2] s.w.s.m.m.a.RequestMappingHandlerAdapter : Resume with async result ["Callable Return"]
	2020-08-20 23:46:09.589 DEBUG 18844 --- [nio-8080-exec-2] m.m.a.RequestResponseBodyMethodProcessor : Using 'text/html', given [text/html, application/xhtml+xml, image/webp, image/apng, application/xml;q=0.9, application/signed-exchange;v=b3;q=0.9, */*;q=0.8] and supported [text/plain, */*, text/plain, */*, application/json, application/*+json, application/json, application/*+json]
	2020-08-20 23:46:09.589 DEBUG 18844 --- [nio-8080-exec-2] m.m.a.RequestResponseBodyMethodProcessor : Writing ["Callable Return"]
2020-08-20 23:46:09.595 DEBUG 18844 --- [nio-8080-exec-2] o.s.web.servlet.DispatcherServlet        : Exiting from "ASYNC" dispatch, status 200
	</pre>
	
5. ResponseBodyEmitter : 비동기 응답을 다수의 객체로 반환 
6. SseEmitter : 비동기 서버-전송 이벤크를 작성할 떄
7. StreamingResponseBody : 비동기 OutStream을 작성할 떄 