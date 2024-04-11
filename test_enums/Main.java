package test_enums;

public class Main {
    public static void main(String[] args) {
        Car car = Car.BMW;
//        System.out.println(car);
        Car[] cars = Car.values();
        for (Car car1 : cars) {
            System.out.println(car1);
        }
    }
}
