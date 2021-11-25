package skypro;

public class Main {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("BMX", 2, "Red");
        Car car = new Car("BMW", 4, 99_999);
        Truck truck = new Truck("MAN", 6, 999_999);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(car, bicycle, truck);

    }
}
