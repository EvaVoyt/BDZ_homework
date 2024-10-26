import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.next();
        int[] spis = new int[10];
        for (int i = 0; i < line.length(); i++) {
            spis[line.charAt(i) - '0']++;
        }
        change(spis, "", line.length());
    }

    public static void change(int[] spis, String line, int a) {

        if (a == 0) {
            if (line.charAt(0) == '0') {
                return;
            }
            else{
                System.out.println(line);
            }
        }

        for (int i = 0; i < 10; i++) {
            if (spis[i] > 0) {
                if ( i != 0 || !line.isEmpty()) {
                    spis[i]--;
                    change(spis, line + i, a - 1);
                    spis[i]++;
                }
            }
        }
    }
}