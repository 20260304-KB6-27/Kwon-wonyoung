package basic.ch04;

public class ForExample {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }


    }
}
