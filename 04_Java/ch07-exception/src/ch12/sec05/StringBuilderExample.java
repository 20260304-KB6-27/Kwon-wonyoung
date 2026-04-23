package ch12.sec05;

public class StringBuilderExample {
    public static void main(String[] args) {

        String data = new StringBuilder()
                .append("DEF")  // 뒤에 추가
                .insert(0, "ABC") // 앞에 추가
                .delete(3, 4) // 3 ~ 4-1까지 삭제
                .toString();

        System.out.println(data);
    }
}
