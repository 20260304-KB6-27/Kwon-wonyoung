package basic.ch06.sec00.sec14;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setSpeed(-50);
        System.out.printf("현재 속도: %d\n", myCar.getSpeed());
        myCar.setSpeed(60);
        System.out.printf("현재 속도: %d\n", myCar.getSpeed());
        myCar.setStop(true);
        System.out.printf("현재 속도: %d\n", myCar.getSpeed());

    }
}
