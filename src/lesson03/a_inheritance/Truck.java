package lesson03.a_inheritance;

public class Truck extends Car {

    public Truck(String manufacturer, int produceYear, Color color) {
        super(manufacturer, produceYear, color);
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