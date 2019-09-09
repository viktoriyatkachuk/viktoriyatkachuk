package lesson03.a_inheritance;

public abstract class Car {

    private String manufacturer;
    private int produceYear;
    private Color color;

    public Car(String manufacturer, int produceYear, Color color) {
        this.manufacturer = manufacturer;
        this.produceYear = produceYear;
        this.color = color;
    }

    abstract String getType();

    public void gas() {
        System.out.println(getType() + " started to move");
    }

    public void stop() {
        System.out.println(getType() + " started to stop");
        System.out.println(getType() + " stopped");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (produceYear != car.produceYear) return false;
        if (manufacturer != null ? !manufacturer.equals(car.manufacturer) : car.manufacturer != null) return false;
        return color == car.color;
    }

    @Override
    public int hashCode() {
        int result = manufacturer != null ? manufacturer.hashCode() : 0;
        result = 31 * result + produceYear;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", produceYear=" + produceYear +
                ", color=" + color +
                '}';
    }
}