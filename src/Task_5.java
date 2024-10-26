import java.util.Scanner;
public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String dateString = in.nextLine();


        String dayOfWeek = calculateDayOfWeek(dateString);
        System.out.println(dayOfWeek);
    }
    public static String calculateDayOfWeek(String input) {
        String[] date = input.split(" ");
        int day = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int year = Integer.parseInt(date[2]);

        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        year -= (month < 3) ? 1 : 0;
        int dayOfWeek = (year + year / 4 - year / 100 + year / 400 + t[month - 1] + day) % 7;

        switch (dayOfWeek) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            default:
                return "";
        }
    }
}