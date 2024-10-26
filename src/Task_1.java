import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(reverse(n)); }

    public static int reverse(int x){
        int res = 0;
        while(x > 0){
            res = res * 10 + x % 10;
            x = x / 10;}
        return res;
    }
}

