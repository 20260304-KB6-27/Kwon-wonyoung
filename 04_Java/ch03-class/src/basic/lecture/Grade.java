package basic.lecture;

public enum Grade {

    // 권한 인증인가 설정 시 유용

    // 객체 형태로 쓰임.


    A(95, "최우수"),
    B(85, "우수"),
    C(75, "보통");

    public String getDescription() {
        return description;
    }

    private final int score;
    private final String description;

    Grade(int score, String description) {
        this.score = score;
        this.description = description;
    }

}
