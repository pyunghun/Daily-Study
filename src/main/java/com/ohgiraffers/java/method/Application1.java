package com.ohgiraffers.java.method;

public class Application1 {

    public static void main(String[] args) {

        // 메소드 호출의 흐름 확인
        System.out.println("main() 시작됨...");

        // methodA() 호출
        Application1 app1 = new Application1();
        app1.methodA();

        System.out.println("main() 종료됨...");
    }

    public void methodA() {
        System.out.println("methodA() 시작됨...");

        Application1 app1 = new Application1();
        app1.methodB();
        // Application1 app1 = newApplication1();
        // 을 사용하지 않게 된다면 app1. heap 메모리에 있는 Application1을 찾을 수 없음.

        System.out.println("methodA() 종료됨...");
    }

    public void methodB() {
        System.out.println("methodB() 시작됨...");
        System.out.println("methodB() 종료됨...");
    }
}
