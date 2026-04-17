package basic.ch06.sec11.exam02;

public class Application {
    public static void main(String[] args) {

        // 인스턴스를 만들지않아도 사용가능
        System.out.println(Earth.EARTH_RADIUS);
        System.out.println(Earth.EARTH_SURFACE_AREA);

        Earth earth = new Earth();
        System.out.println(earth.mainSatellite);

    }
}
