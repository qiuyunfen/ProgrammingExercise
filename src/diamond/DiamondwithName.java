package diamond;

public class DiamondwithName {
    static int n = 5;
    static String name = "Bill";

    public static void main(String[] args) {
        int totalAsteriskNum = 1 + (n - 2) * 2;
        int maxlength = totalAsteriskNum > name.length() ? totalAsteriskNum : name.length();
        StringBuffer[] diamonds = new StringBuffer[n];

        for (int i = 1; i < n; i++) {
            int currentAsteriskNum  = 1 + (i - 1) * 2;
            int blankNum = (maxlength - currentAsteriskNum) / 2;
            StringBuffer line = new StringBuffer();

            line.append(loop(blankNum, " "));
            line.append(loop(currentAsteriskNum, "*"));
            line.append(loop(blankNum, " "));
            diamonds[i-1] = line;
            System.out.println(line);
        }
        StringBuffer line = new StringBuffer();
        line.append(loop((maxlength - name.length()) / 2, " "));
        line.append(name);
        line.append(loop((maxlength - name.length()) / 2, " "));
        System.out.println(line);
        for(int i = n - 2; i >= 0; i--) {
            System.out.println(diamonds[i]);
        }
    }
    public static StringBuffer loop(int count, String signal) {
        StringBuffer line = new StringBuffer();
        for (int i = 0; i < count; i++) {
            line.append(signal);
        }
        return line;
    }
}
