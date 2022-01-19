public enum Kaloric {
    MORNING(550),
    LATEMORNING(150),
    NOON(750),
    AFTERNOON(150),
    NIGHT(550);


    private static double maxCal;

    Kaloric(double maxCal) {
    }

    public static double getMaxCal() {
        return maxCal;
    }

    public static void setMaxCal(double maxCal) {
        Kaloric.maxCal = maxCal;
    }
}
