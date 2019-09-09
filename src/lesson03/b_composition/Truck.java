package lesson03.b_composition;

public class Truck extends Car {

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