디자인 원칙 :
  1. 애플리케이션에서 달라지는 부분을 찾아내고, 달라지지 않는 부분으로부터 분리시킨다.
    -> 특히, 기능들이 그룹지어 있고, 이 기능들의 종류를 가져다 쓸 때 전략 패턴을 쓰면 좋다.
    -> 모든 자식 클래스에서 다른 기능을 구현해야 한다면 전략 패턴은 쓸모가 없다.
    -> 모든 자식 클래스에서 같은 기능을 구현해야 한다면 상속이면 충분하다.
  2. 구현이 아닌 인터페이스에 맞춰서 프로그래밍한다.
    -> 코드를 수정할 필요가 없이(오버라이딩 없이) 만들어진 기능을 다르게 쓰면 된다.
    -> 다형성을 활용
      1. 상속의 단점 : 수퍼클래스의 행동이 모든 하위 클래스에 상속되어서 원하지 않는 기능을 포함할 수 있다.
                       따라서 기능을 따로 구현하기 위해 자식 클래스에서 오버라이딩 해야하고, 코드 중복의 결과를 낳는다.
      2. 인터페이스의 장점 : 인터페이스를 만들고 이것을 구현하는 클래스들을 만들어서 메소드를 구현하면 
                             코드 중복 없이 서브 클래스에서 가져다가 사용할 수 있다. 재사용성이 증가하고,
                             새로운 기능을 수정하거나, 새로운 객체를 만들때도 간편하다!
  3. 상속보다는 구성을 활용한다.(A에는 B가 있다)
  4. 서로 상호작용을 하는 객체 사이에서는 가능하면 느슨하게 결합하는 디자인을 사용해야 한다.
  5. 클래스 확장에 대해서는 열려있지만, 변경에 대해서는 닫혀 있어야 한다.(OCP)
  6. 
  =>'전략패턴' 에서는 알고리즘군을 정의하고 각각을 캡슐화하여 사용할 수 있도록 만든다. 전략패턴을 활용하면
    알고리즘을 사용하는 클라이언트와는 독립적으로 알고리즘을 변경할 수 있다.
