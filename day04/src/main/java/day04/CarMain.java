package day04;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        GasStation gasStation= new GasStation(500);

        System.out.println("A tankolás ára (20 liter): "+gasStation.tank(car,20));
        car.setKmWithGas(300);
        System.out.println("Az aoutó átlagfogyasztása: "+car.calculateConsumption());


    }
}
