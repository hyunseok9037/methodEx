public class Walking2 {
    public static void main(String[] args) {

        double result = calculateCalory2(5000);
        System.out.println("소모칼로리:" + result + "kcal");

    }

    private static double calculateCalory2(int walk) {
        return 0.02 * walk;
    }

}
