import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        solveHanoi(n, 'A', 'C', 'B');
    }

    public static void solveHanoi(int n, char fr, char to, char vspom) {
        if(n == 1) {
            System.out.println("Move disk 1 from " + fr + " to " + to);
        }
        else{
            solveHanoi(n-1, fr, vspom, to);
            System.out.println("Move disk " + n + " from " + fr + " to " + to);
            solveHanoi(n-1, vspom, to, fr); }
    }
}
