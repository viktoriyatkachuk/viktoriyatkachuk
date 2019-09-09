package lesson03.a_inheritance;

public class PassengerCar extends Car {

    public PassengerCar(String manufacturer, int produceYear, Color color) {
        super(manufacturer, produceYear, color);
    }

    @Override
    String getType() {
        return "Passenger car";
    }

    @Override
    public String toString() {
        return "PassengerCar{} extends " + super.toString();
    }
}