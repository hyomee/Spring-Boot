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
		
		Logger logger = LoggerFactory.getLogger(AsyncCallableController.class);
		
		@GetMapping
		public Callable<String> callable() {
			logger.info("Callable Start");
			return () -> {
				logger.info("Callable Sleep : 5000");
				Thread.sleep(ThreadLocalRandom.current().nextInt(5000));
				return "Callable Return";
			};
		}
	}
	```
	<h4>결과</h4>
	<pre>
	2020-08-20 23:57:02.565  INFO 12312 --- [           main] c.k.a.s.async.ExpMvcasyncApplication     : Started ExpMvcasyncApplication in 1.266 seconds (JVM running for 1.997)
	2020-08-20 23:57:12.850  INFO 12312 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
	2020-08-20 23:57:12.851  INFO 12312 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
	2020-08-20 23:57:12.852 DEBUG 12312 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Detected StandardServletMultipartResolver
	2020-08-20 23:57:12.863 DEBUG 12312 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : enableLoggingRequestDetails='false': request parameters and headers will be masked to prevent unsafe logging of potentially sensitive data
	2020-08-20 23:57:12.863  INFO 12312 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 11 ms
	2020-08-20 23:57:12.871 DEBUG 12312 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : GET "/", parameters={}
	2020-08-20 23:57:12.875 DEBUG 12312 --- [nio-8080-exec-1] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped to co.kr.abacus.spring.async.controller.AsyncCallableController#callable()
	2020-08-20 23:57:12.879  INFO 12312 --- [nio-8080-exec-1] c.k.a.s.a.c.AsyncCallableController      : Callable Start
	2020-08-20 23:57:12.884 DEBUG 12312 --- [nio-8080-exec-1] o.s.w.c.request.async.WebAsyncManager    : Started async request
	2020-08-20 23:57:12.885 DEBUG 12312 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Exiting but response remains open for further handling
	2020-08-20 23:57:12.887  INFO 12312 --- [         task-1] c.k.a.s.a.c.AsyncCallableController      : Callable Sleep : 5000
	2020-08-20 23:57:15.275 DEBUG 12312 --- [         task-1] o.s.w.c.request.async.WebAsyncManager    : Async result set, dispatch to /
	2020-08-20 23:57:15.279 DEBUG 12312 --- [nio-8080-exec-2] o.s.web.servlet.DispatcherServlet        : "ASYNC" dispatch for GET "/", parameters={}
	2020-08-20 23:57:15.280 DEBUG 12312 --- [nio-8080-exec-2] s.w.s.m.m.a.RequestMappingHandlerAdapter : Resume with async result ["Callable Return"]
	2020-08-20 23:57:15.292 DEBUG 12312 --- [nio-8080-exec-2] m.m.a.RequestResponseBodyMethodProcessor : Using 'text/html', given [text/html, application/xhtml+xml, image/webp, image/apng, application/xml;q=0.9, application/signed-exchange;v=b3;q=0.9, */*;q=0.8] and supported [text/plain, */*, text/plain, */*, application/json, application/*+json, application/json, application/*+json]
	2020-08-20 23:57:15.292 DEBUG 12312 --- [nio-8080-exec-2] m.m.a.RequestResponseBodyMethodProcessor : Writing ["Callable Return"]
	2020-08-20 23:57:15.298 DEBUG 12312 --- [nio-8080-exec-2] o.s.web.servlet.DispatcherServlet        : Exiting from "ASYNC" dispatch, status 200</pre>
	
	<h4>설명</h4>
	
	1. nio-8080-exec-1 : DispatcherServlet으로 요청 받음 
	2. task-1 : 내부 처리 ( 5초간 대기 )
	3. nio-8080-exec-2 : 실행 결과를 응답 
	
5. ResponseBodyEmitter : 비동기 응답을 다수의 객체로 반환 
6. SseEmitter : 비동기 서버-전송 이벤크를 작성할 떄
7. StreamingResponseBody : 비동기 OutStream을 작성할 떄 