public class Pork {

    public static void main(String[] args) {

        int n = 3;

        double result = calorieCalculator(n);

        System.out.printf("삼결살3인분:" + result + "kcal");

    }

    public static double calorieCalculator(int n) {
        return 180 * 5.179 * n;
    }

}
