package PatternTest;

public class Pattern095 {
    public static int pattern(int num) {
        for (int r = 1; r <=num; r++) {
            for (int c =num-1;c>=r;c--) {
                System.out.print(" ");
            }
            for (int m=1;m<=r;m++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        return num;
    }
}
