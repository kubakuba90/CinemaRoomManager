import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int year = scanner.nextInt();

        int divisible4 = year % 4;
        int divisible100 = year % 100;
        int divisable400 = year % 400;


        if ((divisable400 == 0) || (divisible4 == 0) && (divisible100 != 0)) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}