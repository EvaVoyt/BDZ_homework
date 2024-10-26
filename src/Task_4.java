import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        String m = in.nextLine();
        if (areAnagrams(n, m)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean areAnagrams (String a, String b){
        int cnt = 0;
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < b.length(); j++) {
                    if (a.charAt(i) == b.charAt(j)) {
                        cnt++;

                    }
                }
            }
        }
        if (cnt == b.length()) {
            return true;
        } else return false;
    }
}

