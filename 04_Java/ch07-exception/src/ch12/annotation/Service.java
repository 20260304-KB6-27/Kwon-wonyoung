package ch12.annotation;

public class Service {

    @PrintAnnotation    // 둘 다 기본값
    public void method1(){
        System.out.println("실행 내용 1");

    }

    @PrintAnnotation("*")
    public void method2(){
        System.out.println("실행 내용 2");

    }

    @PrintAnnotation(value = "*", number = 5)
    public void method3(){
        System.out.println("실행 내용 3");

    }
}
