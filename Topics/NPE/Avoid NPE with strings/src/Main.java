import java.util.Scanner;


public class Main {

    public static String concatStrings(String str1, String str2) {
        /* write your code here */

        return str1.concat(str2);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        str1 = "null".equalsIgnoreCase(str1) ? null : str1;
        str2 = "null".equalsIgnoreCase(str2) ? null : str2;

        String concated = null;
        //= concatStrings(str1, str2);

        if (str1 == null && str2 != null) {
            concated = str2;
        } else if (str2 == null && str1 != null) {
            concated = str1;
        } else if (str1 != null && str2 != null) {
            concated = str1+str2;
        } else {
            concated = "";
        }
        System.out.println(concated);
    }
}