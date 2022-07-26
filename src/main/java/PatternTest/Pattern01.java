package PatternTest;

public class Pattern01 {
    public static int pattern(int num) {
        for (int r = 1; r < num; r++) {
            for (int c = 1; c < num; c++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        return num;
    }
}
