# Design_Pattern_Study

  head first Design_Pattern 책 참조.

1. 스트래티지 패턴
2. 옵저버 패턴
3. 데코레이터 패턴
4. 팩토리 패턴
5. 싱글턴 패턴
6. 커맨드 패턴
7. 어댑터 패턴과 퍼사드 패턴
8. 템플릿 메소드 패턴
9. 이터레이터와 컴포지트 패턴
10. 스테이트 패턴
11. 프록시 패턴
12. 컴파운드 패턴

#### 객체지향의 기초
 1. 추상화
 2. 캡슐화
 3. 다형성
 4. 상속

#### 객체지향 원칙
- 바뀌는 부분은 캡슐화한다.
- 상속보다는 구성을 활용한다.
- 구현이 아닌 인터페이스를 맞춰서 프로그래밍한다.

### 1. 스트래티지 패턴(Strategy Pattern)
 - 알고리즘군을 정의하고 각각을 캡슐화하여 교환해서 사용할 수 있도록 만든다. 스트래티지를 활용하면 알고리즘을 사용하는 클라이언와는 독립적으로 알고리즘을 변경 할수 있다.

### 2. 옵저버 패턴(Observer Pattern)
 - 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들한테 연락이 가고 자동으로 내용이 갱신되는 방식으로 일대다(one-to-many)의존성을 정의합니다.

  #참고

  1.옵저버 패턴은 그 둘은 상호작용을 하긴 하지만 서로에 대해 서로 잘 모른다라는 느슨한 결합(Loose coupling)을 이루고있다.

  2.java.util.Observable의 단점으로, 이는 인터페이스가 아니라 클래스인 데다가, 어떤 인터페이스를 구현하는 것이 아님,
  Observable은 클래스입니다. 때문에 서브클래스를 만들어야한다는 문제가 발생함. 그래서 재사용성에 제약이 생김//
  클래스의 핵심메소드를 외부에서 호출할수 없음.


##### 옵저버 패턴에서의 디자인 원칙

     1. 애플리케이션에서 바뀌는 부분을 찾아내서 바뀌지 않는 부분으로부터 분리시킨다.

     -> 옵저버 패턴에서 변하는 것은 주제의 상태와 옵저버의 개수, 형식입니다. 옵저버 패턴에서는 주제를 바꾸지 않고도 주제의 상태에 의존하는 객체들을 바꿀 수 있습니다. 나중에 바뀔 것에 대비해 두면 이렇게 편하게 작업할 수 있습니다.

     2. 특정 구현이 아닌, 인터페이스에 맞춰서 프로그래밍한다.

     -> Subject와 Observer에서 모두 인터페이스를 사용했습니다. Subject에서는 Subject인터페이스를 통해서 Observer인터페이스를 구현하는 객체들의 등록/탈퇴를 관리하고, 그런 객체들한테 연락을 돌리지요. 지금까지 우리가 봐왔던 것처럼, 이렇게 함으로써 결합을 느슨하게 만들 수 있습니다.

     3. 상속보다는 구성을 활용합니다.

     -> 옵저버 패턴에서는 구성을 활용하여, 옵저버들을 관리합니다.
     주제와 옵저버 사이의 관계는 상속이 아니라 구성에 의해서 이루어지니까요. 게다가 실행중에 구성되는 방식을 사용하니까 더할 나위 없이 좋겠죠.

### 3. 데코레이터 패턴(Decorator)
  - 객체에 추가적인 요건을 동적으로 첨가한다. 데코레이터는 서브클래스를 만드는 것을 통해서 유연하게 확장할 수 있는 방법을 제공한다.

  #####참고

  1.데코레이터의 수퍼클래스는 자신이 장식하고 있는 객체의 수퍼클래스와 같습니다.
  2.한 객체를 여러 개의 데코레이터로 감쌀 수 있습니다.
  3.데코레이터는 자신이 감싸고 있는 객체와 같은 수퍼클래스를 가지고 있기 때문에 원래 객체(싸여져있는객체)가 들어갈 자리에 데코레이터 객체를 집어넣어도 상관 없습니다.
  4.데코레이터는 자신이 장식하고 있는 객체에서 어떤 행동을 위임하는 것 외에 원하는 추가적인 작업을 수행할 수 있습니다.
  5.객체는 언제든지 감쌀 수 있기 때문에 실행중에 필요한 데코레이터를 마음대로 적용할수 있습니다.

##### 데코레이터 패턴에서의 디자인 원칙


     1. 애플리케이션에서 바뀌는 부분을 찾아내서 바뀌지 않는 부분으로부터 분리시킨다.

     -> 데코레이터 패턴에서 변하는 것은 슈퍼클래스에서는 없습니다. 그러나 이 말의 뜻은 즉슨, 슈퍼클래스의 코드의 변화도 없다는 뜻입니다. 다만 확장을 하기위해서 클래스를 구현하여 위임받아 확장합니다.

     2. 특정 구현이 아닌, 인터페이스에 맞춰서 프로그래밍한다.

     -> 데코레이터에서는 인터페이스 보다 추상클래스를 사용했는데, 물론 인터페이스를 사용해도 무관하나, 추상클래스를 사용한 이유는, 기존 코드를 고치는 것은 될 수 있으면 피하는 게 좋기 때문에 추상 클래스를 써도 되는 상황이라면 그냥 추상 클래스만 가지고 작업하였습니다.

     3. 상속보다는 구성을 활용합니다.

     -> 데코레이터 패턴에서는 어쩌면 상속이라는 말과 구성이라는 말을 적절히 혼합한 방식이라고 말할 수있다.
     '데코레이터의 형식이 그 데코레이터로 감싸는 객체의 형식과 같다'를 이용하기 위해서 상속을 사용하는 것이고,
     행동, 그러니까 구성은 서브클래스의 객체들을 구성하는 방법을 통해서 얻어 오게 된다.

     4. 클래스는 확장에 대해서는 열려 있지만 변경에 대해서는 닫혀 있어야 한다.(OCP)

     -> 3번의 설명처럼 그러므로 데코레이터는 클래스를 확장하는 방법으로는 다양하게 만들 수 있지만, 슈퍼클래스의 변경에 대해서는 닫혀있다고 표현 할 수 있다.

###### 데코레이터 정리
- 상속을 통해 확장을 할 수도 있지만, 디자인의 유연성 면에서 보면 별로 좋지 않습니다.

- 기존 코드를 수정하지 않고도 행동을 확장하는 방법이 필요합니다.

- 구성과 위임을 통해서 실행중에 새로운 행동을 추가할 수 있습니다.

- 상속 대신 데코레이터 패턴을 통해서 행동을 추가할 수 있습니다.

- 데코레이터 패턴에서는 구상 구성요소를 감싸주는 데코레이터을 사용합니다.

- 데코레이터 클래스의 형식은 그 클래스가 감싸고 있는 클래스의 형식을 반영합니다. (상속 또는 인터페이스 구현을 통해서 자신이 감쌀 클래스와 같은 형식을 가지게 됩니다.)

- 데코레이터에서는 자기가 감싸고 있는 구성요소의 메소드를 호출할 결과에 새로운 기능을 더함으로써 행동을 확장합니다.

- 구성요소를 감싸는 데코레이터의 개수에는 제한이 없습니다.

- 구성요서의 클라이언트 입장에서는 데코레이터의 존재를 알 수 없습니다. 클라이언트에서 구성요소의 구체적인 형식에 의존하게 되는 경우는 예외입니다.

- 데코레이터 패턴을 사용하면 자잘한 객체들이 매우 많이 추가될 수 있고, 데코레이터를 너무 많이 사용하면 코드가 필요 이상으로 복잡해질 수도 있습니다.


### 4. 팩토리 메소드

#### 4-1 팩토리 메소드 패턴
 - 객체를 생성하기 위한 인터페이스를 만듭니다. 어떤 클래스의 인스턴스를 만들지는 서브클래스에서 결정하도록 합니다. 팩토리 메소드를 이용하면 인스턴스를 만드는 일을 서브클래스로 미룰수 있습니다.
 (여기서 인터페이스는 implement을 말하는것이 아니라 어느 형태를 말하는 것 입니다. 클래스가 될수도, 추상클래스가 될수도 있습니다.)
#### 4-2 추상 팩토리 패턴
 - 서로 연관된, 또는 의존적인 객체들로 이루어진 제품군을 생성하기 위한 인터페이스를 제공합니다. 구상클래스는 서브클래스에 의해 만들어집니다.

 #### 객체 지향 원칙
 ......
 (+1) 추상화된 것에 의존하라. 구상 클래스에 의존하지 않도록 하라.
 => 가능하면 모든 것을 추상적으로 만들라는 가이드라인을 제공하는 새로운 원칙이 추가되었습니다.

### 5. 싱글톤 패턴
 이전 회사에서도 많이 쓰였던 패턴이였는데, 이 책에서는 굉장히 간결하게 그리고 사용할때 조심하라고 써져있다.
  싱글톤 정의
   - 해당 클래스의 인스턴스가 하나만 만들어지고, 어디서든지 그 인스턴스에 접근할 수 있도록 하기 위한 패턴입니다.

가장 기본적인 패턴은...

public class Singleton {
  private static Singleton uniqueInstance;

  //기타 인스턴스 변수

  private Singleton(){}

  public static Singleton getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new Singleton();
    }
    return uniqueInstance;
  }
  //기타 메소드


 이런식으로 하고 만약에 멀티쓰레드를 사용할경우에는

 public class Singleton {
   private static Singleton uniqueInstance;

   //기타 인스턴스 변수

   private Singleton(){}

   public static <Strong>synchronized</Strong> Singleton getInstance() {
     if (uniqueInstance == null) {
       uniqueInstance = new Singleton();
     }
     return uniqueInstance;
  }
   //기타 메소드
 }

 : <Strong>이렇게 써주면 굿굿!</Strong>

  그리고 멀티쓰레드를 사용하는데, 속도가 문제가 되어 오버헤드가 일어난다면, 이런식의 방법을 사용하는걸 권장!

  public class Singleton {
    private volatile static Singleton uniqueInstance;

    //기타 인스턴스 변수

    private Singleton(){}

    public static <Strong>synchronized</Strong> Singleton getInstance() {
      if (uniqueInstance == null) {
        synchronized(Singleton.clss) {
          if(uniqueInstance == null) {
            uniqueInstance = new Singleton();
          }
        }
      }
      return uniqueInstance;
   }
    //기타 메소드
  }

   **그럼 언제 사용하는게 가장 적당할까??**
##### => 애플리케이션에서 특정 클래스의 인스턴스가 하나만 있어야 하는 경우에 그 클래스를 싱글턴으로 만들면 됩니다.

### 6. 커맨드 패턴

*커맨드 패턴을 이용하면 요구 사항을 객체로 캡슐화 할 수 있으며, 매개변수를 써서 여러가지 다른 요구 사항을 집어넣을수도 있습니다. 또한 요청 내역을 큐에 저장하거나 로그로 기록할 수도 있으며, 작업취소 기능도 지원가능합니다.*

 말이 굉장히 어려운데, 실제로 해보면 어렵다긴보다는 추척하는 힘? 논리적으로 잘 따라가야한다는걸 느낄수 있었어요.

상세설명.
커맨드 객체는 일련의 행동을 특정 리시버하고 연결시킴으로써 요구 사항을 캡슐화한 것이라는 점을 이미 배웠습니다. 이렇게 하기 위해서 행동과 리시버를 한 객체에 집어넣고, execute()라는 메소드 하나만 외부에 공개하는 방법을 씁니다. 이 메소드 호출에 의해서 리시버에서 일련의 작업이 처리됩니다. 외부에서 볼 때는 어떤 객체가 리시버 역할을 하는지, 그 리시버에서 실제로 어떤 일을 하는지 알 수 없습니다. 그냥 execute()메소드를 호출하면 요구 사항이 처리된다는 것만 알 수 있을 뿐이죠.

명령을 통해서 객체를 매개변수화합니다.

 인보커 로딩
 1. 클라이언트에서 커맨드 객체 생성
 2. setCommand()를 호출하여 인보커에 커맨드 객체를 저장
 3. 나중에 클라이언트에서 인보커한테 그 명령을 실행시켜 달라고 요청을 함.
