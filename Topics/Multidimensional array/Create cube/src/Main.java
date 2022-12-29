import java.util.Arrays;

class ArrayOperations {
    public static int[][][] createCube() {
        // write your code here

        int [][][] threeDimmArray = new int[3][3][3];
        int element  = 0;

        for (int i = 0; i < threeDimmArray.length; i++) {
            for (int j = 0; j < threeDimmArray[i].length; j++) {
                for (int k = 0; k < threeDimmArray[i][j].length; k++) {
                    threeDimmArray[i][j][k] = element;
                    element++;
                }
            }
            element = 0;
        }

//        for (int i = 0; i < threeDimmArray.length; i++) {
//            for (int j = 0; j < threeDimmArray[i].length; j++) {
//                System.out.print(Arrays.toString(threeDimmArray[i][j]) + " ");
//            }
//            System.out.println();
//        }
    return threeDimmArray;
    }

//    public static void main(String[] args) {
//        createCube();
//    }
}