class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        // write your code here
        int twoDimmTemp[][] = new int[twoDimArray.length][twoDimArray.length];

        for (int i = twoDimArray.length; i < twoDimArray.length; i--) {
            for (int j = twoDimArray[i].length; j < twoDimArray[i].length; j--) {
                twoDimArray[i][j] = 1;
            }

        }
    }
    public static void main(String[] args) {
        int[][] twoDimArray2 = {
                {0, 0, 9, 9},
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        reverseElements(twoDimArray2);
    }
}