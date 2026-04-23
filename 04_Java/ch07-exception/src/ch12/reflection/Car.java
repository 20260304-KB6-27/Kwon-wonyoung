package ch12.reflection;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String brand;
    private int speed;

    public void drive(){
        System.out.printf("%s가 %d km/h로 달립니다.\n", brand, speed);
    }

    public void stop(){
        System.out.println(brand + "가 멈췄습니다.");
    }
}
