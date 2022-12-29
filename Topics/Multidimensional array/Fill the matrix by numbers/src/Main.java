import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int [][] twoDimArr = new int[size][size];

        for (int i = 0; i < twoDimArr.length; i++) {
            for (int j = 0; j < twoDimArr[i].length; j++) {
                twoDimArr[i][j] = Math.abs(i - j);
            }
        }



        for (int i = 0; i < twoDimArr.length; i++) {
            for (int j = 0; j < twoDimArr[i].length; j++) {
                System.out.print(twoDimArr[i][j] + " ");
            }
            System.out.println();
        }


    }
}