package Java_Collections_Optional_Task_1.src;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> inString = new ArrayList<String>();
        inString.add("Red");
        inString.add("Green");
        inString.add("Black");
        inString.add("White");
        inString.add("Pink");

        System.out.println("Array list before Swap:");
        for (String a : inString) {
            System.out.println(a);
        }

        try {
            FileWriter myWriter = new FileWriter("file.txt");
            myWriter.write(String.valueOf(inString));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
            System.out.println(inString);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        //Swapping 1st(index 0) element with the 3rd(index 2) element
        Collections.swap(inString, 0, 4);
        Collections.swap(inString, 1, 3);

        System.out.println("Array list after swap:");
        for (String b : inString) {
            System.out.println(b);
            try {
                FileWriter myWriter = null;
                try {
                    myWriter = new FileWriter("file1.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    myWriter.write(String.valueOf(inString));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    myWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("Successfully wrote to the file.");

            } finally {

            }
        }
    }
}
