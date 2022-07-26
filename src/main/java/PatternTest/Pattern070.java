package PatternTest;

public class Pattern070 {
    public static int pattern(int num) {
        for (int r = 1; r < num; r++) {
            for (int c = num; c > r; c--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        return num;
    }
}
