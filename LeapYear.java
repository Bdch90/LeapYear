import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a yeah to check :");
        int year = scanner.nextInt();
        boolean check;
        check = true;
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                check = false;
            }
        } else {
            check = false;
        }


        if (check) {
            System.out.println(year + " is a Leap year");
        } else {
            System.out.println(year + " is not a Leap year");
        }
    }
}
