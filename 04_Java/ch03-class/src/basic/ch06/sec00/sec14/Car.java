package basic.ch06.sec00.sec14;

public class Car {
    private int speed;
    private boolean stop;

    public void setSpeed(int speed) {
        this.speed = Math.max(speed, 0);
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        if(stop) this.speed = 0;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean isStop() {
        return this.stop;
    }
}
