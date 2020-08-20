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
5. ResponseBodyEmitter : 비동기 응답을 다수의 객체로 반환 
6. SseEmitter : 비동기 서버-전송 이벤크를 작성할 떄
7. StreamingResponseBody : 비동기 OutStream을 작성할 떄 