package basic.ch07.sec03.exam02;

public class Application {
    public static void main(String[] args) {

//        SmartPhone smartPhone = new SmartPhone();
        SmartPhone smartPhone2 = new SmartPhone("갤럭시", "은색", "56");

        smartPhone2.printModel();   // Override가 된 함수가 호출
        System.out.println(smartPhone2);

//        Phone phone3 = new SmartPhone();
//        SmartPhone phone4 = (SmartPhone) phone3;
    }
}
