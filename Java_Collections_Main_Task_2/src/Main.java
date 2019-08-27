import java.util.Arrays;

public class Main {

    public static int[] split_sorting_array(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Null array......!");
        }
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                    flag = true;
                }
            }
        }
        return nums;
    }
    private static void swap(int[] nums, int left, int right) {
        int temp = nums[right];
        nums[right] = nums[left];
        nums[left] = temp;
    }

    public static void main(String[] args) {

        System.out.println("Hello Task_OK!");

        int[] nums = {10,31,44,1,13,15,21,4,0,6,8,18};
        System.out.println("\nOriginal array: " + Arrays.toString(nums));
        int[] result = split_sorting_array(nums);
        System.out.println("\nResult: " + Arrays.toString(result));
    }
}