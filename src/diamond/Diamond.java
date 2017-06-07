package diamond;

public class Diamond {
    static int n = 5;

    public static void main(String[] args) {
        int totalAsteriskNum = 1 + (n - 1) * 2;
        StringBuffer[] diamonds = new StringBuffer[n];

        for (int i = 1; i <= n; i++) {
            int currentAsteriskNum  = 1 + (i - 1) * 2;
            int blankNum = (totalAsteriskNum - currentAsteriskNum) / 2;
            StringBuffer line = new StringBuffer();

            for (int j = 0; j < blankNum; j++) {
               line.append(" ");
            }
            for (int j = 0; j < currentAsteriskNum; j++) {
                line.append("*");
            }
            for (int j = 0; j < blankNum; j++) {
                line.append(" ");
            }
            diamonds[i-1] = line;
            System.out.println(line);
        }
        for(int i = n - 2; i >= 0; i--) {
            System.out.println(diamonds[i]);
        }
    }
}
