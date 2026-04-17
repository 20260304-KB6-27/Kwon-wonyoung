package basic.lecture.encapsulation;

import basic.lecture.Grade;
import basic.lecture.Student;

public class Application {
    public static void main(String[] args) {

        Monster monster = new Monster();
        monster.setName("드라큘라");
        System.out.println("monster.name = " + monster.getName());
    }
}
