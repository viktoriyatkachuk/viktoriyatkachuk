package lesson03.b_composition;

public class Program {

    public static void main(String[] args) {
        Engine truckEngine = new Engine(5.6);
        Engine passEngine = new Engine(1.5);
        PassengerCar car = new PassengerCar("Daewoo", 2005, Color.RED, passEngine);
        Truck truck = new Truck("Renault", 2016, Color.GREEN, truckEngine);

        System.out.println(truck);
        System.out.println(car);

        truck.gas();
        car.gas();
        car.stop();
        truck.stop();
    }
}