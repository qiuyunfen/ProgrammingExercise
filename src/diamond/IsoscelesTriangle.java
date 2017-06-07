package diamond;

public class IsoscelesTriangle {
    static int n = 5;
    public static void main(String[] args) {
        int totalAsteriskNum = 1 + (n - 1) * 2;
        for (int i = 1; i <= n; i++) {
            int currentAsteriskNum  = 1 + (i - 1) * 2;
            int blankNum = (totalAsteriskNum - currentAsteriskNum) / 2;
            for (int j = 0; j < blankNum; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < currentAsteriskNum; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < blankNum; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
