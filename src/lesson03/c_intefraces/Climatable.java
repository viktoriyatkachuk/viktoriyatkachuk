package lesson03.c_interfaces;

public interface Climatable {

    default void climateControl(int targetTemp) {
        System.out.println("AC works with temp: " + targetTemp);
    }

    default void stopClimate() {
        System.out.println("Climate control is turned off");
    }
}