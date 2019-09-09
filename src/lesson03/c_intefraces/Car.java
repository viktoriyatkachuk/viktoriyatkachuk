package lesson03.c_interfaces;

public abstract class Car {

    private String manufacturer;
    private int produceYear;
    private Color color;
    private Engine engine;

    public Car(String manufacturer, int produceYear, Color color) {
        this.manufacturer = manufacturer;
        this.produceYear = produceYear;
        this.color = color;
    }

    public Car(String manufacturer, int produceYear, Color color, Engine engine) {
        this.manufacturer = manufacturer;
        this.produceYear = produceYear;
        this.color = color;
        this.engine = engine;
    }

    abstract String getType();

    public void gas() {
        engine.startEngine();
        System.out.println(getType() + " started to move");
    }

    public void stop() {
        System.out.println(getType() + " started to stop");
        System.out.println(getType() + " stopped");
        engine.stopEngine();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (produceYear != car.produceYear) return false;
        if (manufacturer != null ? !manufacturer.equals(car.manufacturer) : car.manufacturer != null) return false;
        if (color != car.color) return false;
        return engine != null ? engine.equals(car.engine) : car.engine == null;
    }

    @Override
    public int hashCode() {
        int result = manufacturer != null ? manufacturer.hashCode() : 0;
        result = 31 * result + produceYear;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (engine != null ? engine.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", produceYear=" + produceYear +
                ", color=" + color +
                ", engine=" + engine +
                '}';
    }
}