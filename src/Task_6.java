import java.util.Scanner;
public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int res = result(a, b);
        System.out.println(res);
    }
    public static int result(int a, int b)
    {
        int rs = a ^ b;
        int sd = (a & b) << 1;
        if (sd != 0) {
            return result(rs, sd);
        }
        return rs;
    }

}