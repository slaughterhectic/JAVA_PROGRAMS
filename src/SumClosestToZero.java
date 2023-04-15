public class SumClosestToZero {
    public static void main(String[] args) {
        int[] array = {16,-10,7,-80};

        int minSum = Integer.MAX_VALUE;
        int minLeft = 0;
        int minRight = 1;

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                int sum = array[i] + array[j];
                if (sum<0){
                    sum=-sum;
                }
                if (minSum<0){
                    minSum=-minSum;
                }
                if (sum < minSum) {
                    minSum = sum;
                    minLeft = i;
                    minRight = j;
                }
            }
        }

        System.out.println("The two elements whose sum is closest to zero are " + array[minLeft] + " and " + array[minRight] + ".");
    }
}
