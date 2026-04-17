package basic.ch06.sec09;

public class Car {
    String model;
    int speed;

    public Car(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void run(){
        System.out.printf("%s가 달립니다.(시속:%dkm/h)", model, speed);
    }
}
