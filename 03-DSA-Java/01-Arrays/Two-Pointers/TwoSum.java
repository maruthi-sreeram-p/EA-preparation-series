import java.util.Arrays;

public class TwoSumSorted {

    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[] { left, right };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(a, 9)));

        int[] b = {1, 3, 4, 6, 8, 10};
        System.out.println(Arrays.toString(twoSum(b, 14)));
    }
}