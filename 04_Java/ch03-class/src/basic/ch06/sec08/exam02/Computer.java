package basic.ch06.sec08.exam02;

public class Computer {
    public Computer() {
    }

    public int sum(int i, int i1, int i2) {
        return i+i1+i2;
    }

    public int sum(int i, int i1, int i2, int i3, int i4) {
        return i+i1+i2+i3+i4;
    }

    public int sum(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
}
