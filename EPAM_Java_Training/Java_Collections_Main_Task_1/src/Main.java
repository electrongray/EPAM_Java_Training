import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] park_array = {-1, 0, 0, -1, 0, -1, -1, 0, -1, -1};
        int[] cars_array = {1, 1, 0, 1, 1, 1, 1, 1, 1, 0};
        int[] come_array = {1, 0, 1, 0, 1, 1, 1, 0, 0, 1};
        int[] leave_array = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        int[] right_array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] res = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println("\nArray Parking:         " + Arrays.toString
                (park_array));
        System.out.println("\nArray Cars:            " + Arrays.toString
                (cars_array));
        System.out.println("\nArray Coming Car:      " + Arrays.toString
                (come_array));
        System.out.println("\nArray Leaving Car:     " + Arrays.toString
                (leave_array));
        System.out.println("\nArray Turn Right:      " + Arrays.toString
                (right_array));
        System.out.println();

        for (int i = 0; i < park_array.length; i++) {
            int num1 = park_array[i];
            int num2 = cars_array[i];
            int num3 = come_array[i];
            int num4 = leave_array[i];
            int num5 = right_array[i];

            res[i] = park_array[i]+cars_array[i]+come_array[i]+leave_array[i]+right_array[i];

            System.out.print(i+1+" " + res[i]+ "  ");
            if (res[i] == -1){
                System.out.println("Parking place is free");
            }else if(res[i] == 0){
                System.out.println("No parking place");
            }else if (res[i] == 1){
                System.out.println("No parking places and 1 Car in queue");
            }
        }
    }
}