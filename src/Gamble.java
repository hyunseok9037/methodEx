public class Gamble {
    public static void main(String[] args) {
        double dollar = dice() + dice() + dice();
        double won = exchange(dollar);
        System.out.println("획득 금액:" + dollar + won);

    }

    public static int dice() {
        int num = (int) (Math.random() * 6) + 1;
        return num;
    }

    public static double exchange(double dollar) {

        return dollar * 1082.25108;
    }

}
