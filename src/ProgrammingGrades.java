public class ProgrammingGrades {

    public static void main(String[] args) {

        int score1 = 96;
        int score2 = 85;
        int score3 = 76;

        System.out.println(score1 + "점->" + grade(score1));
        System.out.println(score2 + "점->" + grade(score2));
        System.out.println(score3 + "점->" + grade(score3));

    }

    public static String grade(int score) {

        if (score >= 95) {
            return "A+";
        } else if (score >= 90) {
            return "A0";
        } else if (score >= 80) {
            return "B+";
        } else if (score >= 70) {
            return "B0";
        } else {
            return "C+";
        }

    }

}
