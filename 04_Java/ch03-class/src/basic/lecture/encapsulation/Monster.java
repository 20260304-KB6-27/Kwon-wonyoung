package basic.lecture.encapsulation;

public class Monster {

    private String name;
    private int hp;

    /*
    * 접근 제어자
    * - 클래스 또는 멤버에 참조연산자로 접근할 수 있는 범위를 제한하는 키워드
    * public : 모든패키지에서 접근 가능
    * protected : 동일패키지에 접근 허용 (상속관계일때는 다른 패키지에서도 가능)
    * default : 동일패키제서만 접근 허용 (작성하지 않았을때)
    * private : 해당 클래스 내에서만 접근 허용
    * */


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {

        // hp가 1이상일때만 저장 0또는 음수면 0으로 저장
        if(hp > 0) {
            this.hp = hp;
        } else {
            this.hp = 0;
        }
    }
}
