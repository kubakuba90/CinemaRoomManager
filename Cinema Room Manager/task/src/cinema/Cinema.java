package cinema;

import java.util.Scanner;

public class Cinema {
    static char[][] twoCharArray;
    static int rows;
    static int seats;
    static int resRow;
    static int resSeat;
    static int soldTicketCounter;
    static int currentIncome;
    static float soldPercent;

    public static void seatsPrinter() {
        System.out.print("\nCinema:\n");
        System.out.print("  ");
        for (int i = 1; i <= seats; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int x = 0; x < rows; x++) {
            System.out.print(x+1 + " ");
            for (int y = 0; y < seats; y++) {
                System.out.print(twoCharArray[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void statistics() {

        int totalSeats = rows * seats;

        int totalMoney = moneyTotalCounter();
        //int currentIncomeInt = currentIncome();

        if (soldTicketCounter != 0) {
            soldPercent = 100 * (float)soldTicketCounter / totalSeats;
        }

        System.out.format("\nNumber of purchased tickets: %d\n", soldTicketCounter);
        System.out.format("Percentage: %.2f", soldPercent ); // + "%\n"
        System.out.print("%\n");
        System.out.format("Current income: $%d\n" , currentIncome);
        System.out.format("Total income: $%d\n", totalMoney);
        System.out.println();
    }

    public static int moneyTotalCounter() {
        int total = 0;
        int firstHalf = 0;
        int secondHalf = 0;
        if (rows * seats < 60) {
            total = rows * seats * 10;
        } else if (rows % 2 == 0){
            firstHalf = rows / 2;
            total = firstHalf * seats * 10;
            secondHalf = rows / 2;
            total += secondHalf * seats * 8;
        } else {
            firstHalf = rows / 2;
            total = firstHalf * seats * 10;
            secondHalf = (rows - firstHalf) * seats * 8;
            total += secondHalf;
        }
        return total;
    }

    public static void cinemaGenerator() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        seats = scanner.nextInt();

        //Two dimmensional array
        twoCharArray = new char[rows][seats];

        //cinema filler of 'S' free seats
        for (int i = 0; i < twoCharArray.length; i ++) {
            for (int j = 0; j < twoCharArray[i].length; j++) {
                twoCharArray[i][j] = 'S';

            }
        }

        System.out.println();
        menuCinema();
        }

        public static void cinemaReservation() {
            Scanner scanner = new Scanner(System.in);
            boolean exit = true;

            System.out.println("\nEnter a row number:");
            resRow = scanner.nextInt() -1;
            System.out.println("Enter a seat number in that row:");
            resSeat = scanner.nextInt() -1;

            //cordinate checker
            if (resRow > rows-1 || resSeat > seats-1 || resRow < 0 || resSeat < 0) {
                System.out.println("\nWrong input!");
                cinemaReservation();
            } else {
                while (exit) {
                    if (twoCharArray[resRow][resSeat] == 'B') {
                        System.out.println("\nThat ticket has already been purchased!");
                        cinemaReservation();
                    } else {
                        twoCharArray[resRow][resSeat] = 'B';
                        exit = false;
                    }
                }
                System.out.println("\nTicket price: $" + ticketPrice() + "\n");
                soldTicketCounter += 1;
                currentIncome += ticketPrice();

            }
        }

        public static int ticketPrice() {
            int seat = 0;
            int firstHalf = 0;
            int secondHalf = 0;

            if (rows * seats < 60) {
                seat = 10;

            } else if (rows % 2 == 0){
                  firstHalf = rows / 2;

                seat = 10;
            }

            if (rows * seats < 60) {
                seat = 10;

            } else if (rows / 2 > resRow) {
                seat = 10;
            } else {
                seat = 8;
            }

            return seat;
        }

        public static void menuCinema() {
        System.out.println("1. Show the seats\n" +
                    "2. Buy a ticket\n" +
                    "3. Statistics\n" +
                    "0. Exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        while (choice != 0) {
            if (choice == 1) {
                seatsPrinter();
            } else if (choice == 2) {
                cinemaReservation();
            } else if (choice == 3) {
                statistics();
            }
            System.out.println("1. Show the seats\n" +
                    "2. Buy a ticket\n" +
                    "3. Statistics\n" +
                    "0. Exit");
            choice = scanner.nextInt();
        }
        }


    public static void main(String[] args) {
        cinemaGenerator();
    }

}






