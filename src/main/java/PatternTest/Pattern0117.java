package PatternTest;

public class Pattern0117 {
    public static void print(int num){
        for (int r=num;r>=1;r--){
            for (int c=num-1;c>=r;c--){
                System.out.print(" ");
            }
            for (int m=1;m<=r;m++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
