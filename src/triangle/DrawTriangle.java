package triangle;

public class DrawTriangle {
    static int n = 5;
    public static void main(String[] args) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
