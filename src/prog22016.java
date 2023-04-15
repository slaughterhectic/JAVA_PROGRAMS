import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class prog22016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] uniqueNums = getUniqueNumbers(nums);
        System.out.println("Unique numbers in the array: " + Arrays.toString(uniqueNums));
    }

    public static int[] getUniqueNumbers(int[] nums) {
        List<Integer> uniqueList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int isUnique = 1;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    isUnique = 0;
                    break;
                }
            }

            if (isUnique != 0) {
                uniqueList.add(nums[i]);
            }
        }

        int[] uniqueNums = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueNums[i] = uniqueList.get(i);
        }

        return uniqueNums;
    }
}
