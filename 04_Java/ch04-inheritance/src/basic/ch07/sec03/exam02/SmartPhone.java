package basic.ch07.sec03.exam02;


/*
* 상속
* - 부모가 가지고 있는 멤버(필드, 메서드)를 자식이 물려받음을 의미
* - 자바에서는 확장의 개념
* */
public class SmartPhone extends Phone{

    public String network;

    public SmartPhone() {
        System.out.println("자식의 기본생성자 호출됨..");
    }

    public SmartPhone(String model, String color, String network) {
        super(model, color);    // 부모 생성자 호출이 먼저요.
        this.network = network;
        System.out.println("자식의 모든필드를 초기화하는 생성자 호출됨...");
    }

    /*
    * Overriding
    * - 부모가 가지는 메소드 선언부를 그대로 사용하면서
    * - 자식클래스에서 정의한대로 동작하도록 함.
    *
    * 참고
    * - private (접근불가), final(변경불가) 메서드는 override 불가
    * - 접근제어자가 부모 메서드와 같거나 더 넓어야 함니다.
    * */
    @Override
    public void printModel() {
        super.printModel();
        System.out.println("자식에서 호출된 printModel.....");
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "network='" + network + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
