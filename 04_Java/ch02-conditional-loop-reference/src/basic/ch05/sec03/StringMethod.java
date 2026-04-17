package basic.ch05.sec03;

public class StringMethod {
    public static void main(String[] args) {

        String subject = "자바 프로그래밍";

        System.out.println(subject.length());

        // indexOf
        // 특정 문자가 처음 등장하는 위치의 인덱스를 반환 (없을 시 -1)
        int location = subject.indexOf("프로그래밍");
        System.out.println("location = " + location);

        // split
        // 문자열을 특정 구분자를 기준으로 잘라 문자열 배열로 반환

        String[] splitstr = subject.split(" ");
        System.out.println(splitstr.length);
        System.out.println(splitstr[0]);

        /*
        * substring
        * 원하는 범위만큼 잘라서 새로운 문자열을 반환
        *
        * 인자가 1개일 때
        * - 해당 인덱스 ~ 끝
        *
        * 인자가 2개일 때
        * - 시작 인덱스 ~ 끝 인덱스 전까지
        * */

        String subString = subject.substring(location);
        System.out.println(subString);

        String subString2 = subject.substring(location, location + 2);
        System.out.println(subString2);

        /*
        * replace(target, replacement)
        *
        * */

        String replaceStr = subject.replace("래밍","램");
        System.out.println(replaceStr);
    }
}
