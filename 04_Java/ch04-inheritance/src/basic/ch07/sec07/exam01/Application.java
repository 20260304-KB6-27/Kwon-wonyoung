package basic.ch07.sec07.exam01;

public class Application {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        // 업캐스팅
        // 타입을 자식 -> 부모로 변경 가능
        A a1 = new B();
        A a2 = new C();
        A a3 = new D();
        A a4 = new E();
        B b1 = new D();

        // 다운캐스팅
        // 부모 -> 자식으로 변경
        B b2 = (B) a1;
    }
}
