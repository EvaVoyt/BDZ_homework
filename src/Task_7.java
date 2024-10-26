import java.util.Scanner;

public class Task_7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] res = new int[n][];
        for (int i = 0; i < n; i++) {
            res[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                res[i][j] = in.nextInt();
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                res[i][j] += Math.max(res[i + 1][j], res[i + 1][j + 1]);
            }
        }

        int maxs = res[0][0];
        System.out.println(maxs);
    }
}
