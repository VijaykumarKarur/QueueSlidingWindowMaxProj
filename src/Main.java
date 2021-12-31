public class Main {
    public static void main(String[] args) {
        //int[]  A = {1, 3, -1, -3, 5, 3, 6, 7};
        //int B = 3;

        int[]  A = {1, 2, 3, 4, 2, 7, 1, 3, 6};
        int B = 12;
        Solution solution = new Solution();
        int[] result = solution.slidingMaximum(A, B);
        for(int index = 0; index < result.length; index++){
            System.out.print(result[index] + " ");
        }
    }
}
