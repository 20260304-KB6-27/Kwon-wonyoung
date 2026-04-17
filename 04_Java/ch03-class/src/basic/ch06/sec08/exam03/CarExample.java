package basic.ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setGas(5);

        myCar.isLeftGas();
        myCar.run();
        if(!myCar.isLeftGas()){
            System.out.println("gas를 주입하세요.");
        }

    }
}
