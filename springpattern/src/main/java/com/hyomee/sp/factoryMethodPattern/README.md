#Factory Method Pattern

부모 클래스에서 구체적인 객체 셍성 방법을 결정 하는 디자인 패턴 

부모객체
```
public abstract class FactoryMethodPatternParent {
    abstract public void process();
}
```
자식객체
```
@Slf4j
@RequiredArgsConstructor
@Service
public class FactoryMethodPatternChildA extends FactoryMethodPatternParent{
    @Override
    public void process() {
        log.debug("Process FactoryMethodPatternChildA");
    }
}
```

**Hook Method**
부모 클래스에서 디폴트 기능을 정의 하고 자식 클래스에서 선택적으로 오버라이드할 수 있도록 만들어 둔 메소드

