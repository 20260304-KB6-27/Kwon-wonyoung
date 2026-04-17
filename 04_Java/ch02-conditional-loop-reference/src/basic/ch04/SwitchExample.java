package basic.ch04;

public class SwitchExample {
    public static void main(String[] args) {
        // Switch로 특정 case 별로 코드를 분기하고 싶을 때 사용

        char grade = 'a';

//        // 값 반환
//        switch (grade) {
//            case 'A', 'a' -> System.out.println("A요!");
//            case 'B'->  System.out.println("B요!");
//            default -> System.out.println("기본이요!");
//        }



        String result = switch (grade) {
            case 'A', 'a' -> {
                System.out.println("실행됨");
                yield "A요!";
            }
            case 'B'->  "B요!";
            default -> "기본이요!";
        };

        System.out.println("result = " + result);
    }
}

