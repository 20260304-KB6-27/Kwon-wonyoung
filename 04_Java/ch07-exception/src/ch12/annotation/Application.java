package ch12.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Application {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        // 1. Service에 선언된 메서드를 모두 가져옴 (method 1,2,3)
        Method[] declaredMethod = Service.class.getDeclaredMethods();

        Method method = declaredMethod[0];

        // 2. 메서드에 부은 어노테이션을 읽기
        PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);


        // 3. 어노테이션 속성 값으로 구분선 출력
        if(printAnnotation != null) {
            int number = printAnnotation.number();
            String value = printAnnotation.value();

            for(int i = 0; i < number; i++) {
                System.out.print(value);
            }

            System.out.println();
        }

        // 4. 메서드 실행
        method.invoke(new Service());

        // 3. 어노테이션 속성 값으로 구분선 출력
        if(printAnnotation != null) {
            int number = printAnnotation.number();
            String value = printAnnotation.value();

            for(int i = 0; i < number; i++) {
                System.out.print(value);
            }

            System.out.println();
        }
    }
}
