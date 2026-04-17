package basic.lecture.exam;

public class Database {
    /*
     * 싱클톤 패턴
     * - 애플리케이션에서 하나의 객체만 생성되도록 보장하는 디자인 패턴
     * - 동일한 인스턴스를 공유해서 사용
     * */

    private String connetion = "MYSQL";

    // 객체를 만들지 않아도 사용가능
    private static Database database = new Database();

    private Database() {
    }

    // static 메서드로 인스턴스 변환
    public static Database getInstance() {
        return database;
    }
}
