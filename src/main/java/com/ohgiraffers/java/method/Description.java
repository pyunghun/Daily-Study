package com.ohgiraffers.java.method;

public class Description {

    /*
        Method(방법)
            우리가 어떻게 하는 지에 따라 사전에 준비해둔 것.(함수)
            특정 작업을 위한 명령문의 집합
        Method는 프로그래밍에서 객체 지향 언어를 비롯한 많은 프로그래밍 언어에서 사용되는 용어로,
        Method는 클래스 내부에 정의 되며, 해당 클래스의 객체에서 호출될 수 있다.
        또한 특정한 작업을 수행하고 결과를 반환할 수 있으며, 필요시 매개변수를 받을 수 있다.
        나중에 나오는 개념이지만 메소드는 프로그램의 모듈화와 재사용성을 촉진하며, 코드를 구조화하여 유지보수성을
        용이하게 만들 수 있다.

        ex) + 연산을 실행하는 방법
            int num1 = 10;
            int num2 = 10;
            int num3 = 10;
            int num4 = 10;

            System.out.println(num1 + num2);
            System.out.println(num2 + num3);
            System.out.println(num1 + num2);
            System.out.println(num1 + num2);

        -- 위 방법의 단점
        1. 코드의 반복이 너무 많음(단순 노가다)
        2. 변경 시 모든 코드를 바꾸어야 한다.
        따라서 두 수 예를들면 a,b가 있다고 가정하여 a와 b를 받으면 자동으로 연산해주는 기능을 만든다면?
        -- 공통적인 작업을 하는 기능을 하나의 함수로 만들어두고 필요시 사용
        1. 코드의 응집도를 높여준다.

        ex)
        -- Main Method
        public static void main(String[] args) {
            int num1 = 10;
            int num2 = 20;
            int num3 = 30;
            int num4 = 40;

        wrong -> sout(num1 + num2)
        - 만약에 빼기 연산을 하거나 다른 수를 더하고 싶으면 코드 전체를 수정해야 한다.
        good -> sout(sumTwoNumber(num1, num2)
        - 만약 빼기를 하거나 다른 수를 더하고 싶다면 Method만 수정하면 된다.
        - 이것을 코드의 응집도를 높인다고 할 수 있다.
        }
        -- Method
        public int sumTwoNumber(int first, int second){
            int sum = first + second;

            return sum;
        }

        Method 실행 시 어떠한 값을 미리 주고(전달 인자) 그 값을 활용(매개변수)해서 메소드를 수행 가능하다.
        위에 봤던 예시처럼 sumTwoNumber 라는 메소드를 실행할 시 전달인자로 num1과 num2를 주고
        sumTwoNumber 메소드에서 전달받은 인자를 매개변수로 하여 실행하게 된다.
        매개변수는 값을 전달 받을 수 있는 공간이다.
        매개변수 또한 변수이기 때문에 공간이다.
        전달인자는 메소드에게 값을 전달하는 역할, 즉 값을 의미한다.

        매개변수의 개수나 자료형의 제한은 없으며 상수(final)도 사용이 가능하다.
        final 키워드가 붙은 매개변수는 상수의 값이기 때문에 해당 스코프 내에서 값의 변경이 불가능하다.
        매개변수는 지역변수이다. 해당하는 블록에서만 사용이 가능하다.

        지역변수는 stack 영역에 공간이 생성된다.
        그렇다면 매개변수는? 마찬가지로 stack에 생성된다.

        메소드는 종료 시에 return으로 메소드를 호출한 곳으로 돌아가게 된다.
        return은 크게 2가지로 사용할 수 있다.
        1. 그냥 복귀
        2. return 뒤에 있는 값을 가지고 복귀
        공통점은 원래의 위치로 돌아가는 것은 마찬가지이다.

        return 뒤에 붙어있는 값은 return value or 반환값 이런 식으로 명칭한다.

        - return
        해당 메소드를 종료하고, 자신을 호출 한 메소드로 돌아가는 예약어
        이 상황을 이해하기 위해서는 STACK의 구조에 대해 알아야한다.
        자료구조에 대해 공부 jvm
        특징 : 데이터가 들어오고 나올 수 있는 공간이 한쪽으로만 되어있다.
              먼저 push가 되면은 가장 아래단에 쌓이게 되고 그 위로 순서대로 쌓이는 순서이다.
              따라서 data가 pop 될 때 가장 나중에 들어온 데이터가 나오고 차례로 나오는 순서를 가지게 된다.
              LIFO (last in first out)

        return의 값이 있다고 가정할 때 메소드의 자료형과 return값의 자료형은 같아야한다.
        void 는 단순이 예를 들면 야 너 공부해 <- 이런 느낌 (작업의 수행만을 목적으로 하는 메소드)
        void 가 아닌 경우는 야 너 공부해서 나한테 시험문제 어떤 거 알려줘 <- 이런 느낌

        static / heap
        heap 은 주소를 통해 그 객체에 접근을 한다.
        ex) Application app = new Application(); <- Application 이라는 객체를 사용하겠다 선언(메모리에 사용할 준비)
            app.methodA(); app 은 Application 이라는 객체를 변수 app 에 담아서 사용하겠다 라는 의미를 말한다.
            이 때 참조 연산자 . 은 app 이라는 변수에 주소값을 찾아 Application 안에 있는 어떤 methodA()라는 것을 찾는다.

    */


}
