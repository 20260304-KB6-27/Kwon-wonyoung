package basic.ch05.sec03;

public class StringExample {
    public static void main(String[] args) {
        // String 객체 타입
        String str1 = "hello";

        // String 불변 객체
        // -> 기존 값이 변경되지 않고 새로운 객체가 생성됨
        String str2 = "hello";
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        String str3 = new String("hello");
        // 문자열 풀에 있는 같은 주소
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(System.identityHashCode(str3));

//        str1 = str1 + "world";

        // 문자열 비교는 equals
        System.out.println(str1.equals(str3));

        // 코드상에서 주소값 보는 메소드 (그런데 주소값은 아닌)
        System.out.println(System.identityHashCode(str1));



    }
}
