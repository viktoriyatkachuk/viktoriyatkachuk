package lesson03.a_inheritance;

public class Program {

    public static void main(String[] args) {
        PassengerCar car = new PassengerCar("Daewoo", 2005, Color.RED);
        Truck truck = new Truck("Renault", 2016, Color.GREEN);

        System.out.println(truck);
        System.out.println(car);

        truck.gas();
        car.gas();
        car.stop();
        truck.stop();
    }
}