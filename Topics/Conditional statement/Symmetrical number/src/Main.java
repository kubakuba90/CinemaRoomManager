import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        Random random = new Random();
        int randomNumber = random.nextInt();

        String number = scanner.nextLine();

        if (number.charAt(0) == number.charAt(3) && number.charAt(1) == number.charAt(2)) {
            System.out.println(1);
        } else {
            System.out.println(randomNumber);
        }
    }
}