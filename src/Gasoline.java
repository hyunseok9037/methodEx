public class Gasoline {

    public static void main(String[] args) {

        double gasoline = 8.86;
        double distance = 182.736;
        double efficiency = calcEffiency(gasoline, distance);
        System.out.println("연비:" + efficiency + "km/L");
    }

    public static double calcEffiency(double fuel, double distance) {

        return distance / fuel;
    }

}
