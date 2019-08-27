package lesson03.c_interfaces;

public class Truck extends Car implements Climatable {

    public Truck(String manufacturer, int produceYear, Color color) {
        super(manufacturer, produceYear, color);
    }

    public Truck(String manufacturer, int produceYear, Color color, Engine engine) {
        super(manufacturer, produceYear, color, engine);
    }

    @Override
    String getType() {
        return "Truck";
    }

    @Override
    public String toString() {
        return "Truck{} extends + " + super.toString();
    }
}