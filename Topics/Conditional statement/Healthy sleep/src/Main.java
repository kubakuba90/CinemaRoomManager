import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int sleepAtLeastA = scanner.nextInt();
        int maxHoursSleepB = scanner.nextInt();
        int hoursSleepH = scanner.nextInt();

        if (hoursSleepH >= sleepAtLeastA && hoursSleepH <= maxHoursSleepB) {
            System.out.println("Normal");
        } else if (hoursSleepH < sleepAtLeastA) {
            System.out.println("Deficiency");
        } else if (hoursSleepH > maxHoursSleepB) {
            System.out.println("Excess");
        }
    }
}
