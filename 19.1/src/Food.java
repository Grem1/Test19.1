import java.util.HashMap;

public class Food {
    private static String food;
    private static double eatenCal;
    private static double maxCal;


    public static String getFood() {
        return food;
    }

    public static void setFood(String food) {
        Food.food = food;
    }

    public static double getEatenCal() {
        return eatenCal;
    }

    public static void setEatenCal(double eatenCal) {
        Food.eatenCal = eatenCal;
    }

    public static double getMaxCal() {
        return maxCal;
    }

    public static void setMaxCal(double maxCal) {
        Food.maxCal = maxCal;
    }

}
