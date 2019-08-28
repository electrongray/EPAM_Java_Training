import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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
        Scanner sc = new Scanner( System.in );
        System.out.print("Input the starting number of the range: ");
        int start_num = sc.nextInt();
        System.out.print("Input the ending number of the range: ");
        int end_num = sc.nextInt();
        int random_num = start_num + (int)(Math.random() * ((end_num - start_num) + 1));
        System.out.println(random_num);

        System.out.print("Input the starting number of the range: ");
        int start_num1 = sc.nextInt();
        System.out.print("Input the ending number of the range: ");
        int end_num1 = sc.nextInt();
        int random_num1 = start_num + (int)(Math.random() * ((end_num1 - start_num1) + 1));
        System.out.println(random_num1);

        System.out.print("Input the starting number of the range: ");
        int start_num2 = sc.nextInt();
        System.out.print("Input the ending number of the range: ");
        int end_num2 = sc.nextInt();
        int random_num2 = start_num2 + (int)(Math.random() * ((end_num2 - start_num2) + 1));
        System.out.println(random_num2);

        System.out.print("Input the starting number of the range: ");
        int start_num3 = sc.nextInt();
        System.out.print("Input the ending number of the range: ");
        int end_num3 = sc.nextInt();
        int random_num3 = start_num3 + (int)(Math.random() * ((end_num3 - start_num3) + 1));
        System.out.println(random_num3);

        System.out.print("Input the starting number of the range: ");
        int start_num4 = sc.nextInt();
        System.out.print("Input the ending number of the range: ");
        int end_num4 = sc.nextInt();
        int random_num4 = start_num + (int)(Math.random() * ((end_num4 - start_num4) + 1));
        System.out.println(random_num4);
        System.out.println( "Random Integers are: " + random_num + " " + random_num1 + " " + random_num2
                + " " + random_num3 + " " + random_num4);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(random_num);
        arrayList.add(random_num1);
        arrayList.add(random_num2);
        arrayList.add(random_num3);
        arrayList.add(random_num4);
        System.out.println( "ArrayList: " + arrayList);

        int[] nums = {random_num, random_num1, random_num2, random_num3,random_num4};
        System.out.println("\nOriginal array: " + Arrays.toString(nums));
        int[] result = split_sorting_array(nums);
        System.out.println("\nResult: " + Arrays.toString(result));

        try {
            FileWriter myWriter = new FileWriter("file.txt");
            myWriter.write(Arrays.toString(result));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();


        }
    }
}