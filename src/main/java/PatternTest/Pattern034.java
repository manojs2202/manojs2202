package PatternTest;

public class Pattern034 {
    public static int pattern(int num) {
        for (int r = 1; r < num; r++) {
            for (int c = 1; c < r; c++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        return num;
    }
}
