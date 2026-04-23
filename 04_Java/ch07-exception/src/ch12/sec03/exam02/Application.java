package ch12.sec03.exam02;

public class Application {
    public static void main(String[] args) {

        Student student = new Student();
        Student student1 = new Student(0, "won");

        System.out.println(student1);
        System.out.println(student.getNo());
    }
}
