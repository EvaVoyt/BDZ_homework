import java.util.Scanner;
public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();

        poisk(line1, line2);
    }

    public static void poisk(String line1, String line2) {
        boolean a = true;
        for (int i = 0; i <= line1.length() - line2.length(); i++) {
            if (line1.substring(i, i + line2.length()).equals(line2)) {
                System.out.print(i + " ");
                a = false;
            }
        }
        if (a) {
            System.out.println("-1");
        }
    }
}


