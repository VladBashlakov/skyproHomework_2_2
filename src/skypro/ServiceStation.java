package skypro;

public class ServiceStation {

    public void check(Car car, Bicycle bicycle, Truck truck) {
        checkVehicle(car);
        checkVehicle(truck);

        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
            System.out.println("У " + bicycle.getModelName() + " Обслуживание закончено");
            System.out.println();
        }
    }

    private void checkVehicle(Car car) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();
            System.out.println("У " + car.getModelName() + " Обслуживание закончено");
            System.out.println();
        }
    }
}


