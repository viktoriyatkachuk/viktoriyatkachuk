package lesson03.c_interfaces;

public class PassengerCar extends Car implements Climatable{

    // aggregation
    //private Person[] passengers;

    public PassengerCar(String manufacturer, int produceYear, Color color) {
        super(manufacturer, produceYear, color);
    }

    public PassengerCar(String manufacturer, int produceYear, Color color, Engine engine) {
        super(manufacturer, produceYear, color, engine);
    }

    @Override
    public void climateControl(int targetTemp) {
        System.out.println("Climate control system tries to make temp: " + targetTemp);
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