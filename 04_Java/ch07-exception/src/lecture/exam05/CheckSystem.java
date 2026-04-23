package lecture.exam05;

public class CheckSystem {

    public void checkScore(int score) {
        // 만약에 score가 0~100 사이가 아닐경우 예외발생시키고 싶음
        System.out.println(score + "점을 획득하셨습니다.");
    }

    public void checkGrade(char grade) {
        // 만약에 grade가 'A'~'D'가 아닐경우 예외발생시키고 싶음
        System.out.println(grade + "등급이시군요.");
    }

    // 해당 예외 클래스들은 자바에 정의되어있지 않음!!
    // 우리 시스템 상에서만 논리적으로 불가능한 경우기 때문에!
    // => 사용자 정의 예외클래스 만들기
}
