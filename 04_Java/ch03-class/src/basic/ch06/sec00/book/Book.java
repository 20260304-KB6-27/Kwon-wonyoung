package basic.ch06.sec00.book;

public class Book {
    // 필드 === 멤버변수, 전역변수, 인스턴스 변수
    String author;
    String title;
    String publisher;
    int pageCount;

    // 생성자 오버로딩
    public Book(String author, String title, String publisher, int pageCount) {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.pageCount = pageCount;
    }

    public Book(String author, String title) {
        // this(): 생성자 최상단에 위치
        this(author, title, "soft cover", 12);
//        this.author = author;
//        this.title = title;

    }

    // 생성자
    // 생성자가 하나도 없으면 컴파일러가 기본생성자를 만들어준다.
    Book(){
        System.out.println("기본생성자 호출함..");
    }

    // 메서드
    public void introduce(){
        System.out.println(title + " 책의 작가는 " + author + "입니다.");
    }

    @Override
    public String toString() {
        return title + " 책의 작가는 " + author + "입니다.";
    }
}
