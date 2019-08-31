package Java_IO_Optional_Task_7.src;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        String strLine = "";
        List<String> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader
                    (new FileReader("file.txt"));
            while (strLine != null) {
                strLine = br.readLine();
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                if (strLine == null)
                    break;
                list.add(strLine);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
        BufferedReader br = null;
        String strLine1 = "";
        try {
            LineNumberReader reader = new LineNumberReader
                    (new InputStreamReader(new FileInputStream
                            ("file.txt"), "UTF-8"));
            while (((strLine1 = reader.readLine()) != null)
                    && reader.getLineNumber() <= 30) {
                //             System.out.println(strLine1);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
        Scanner scanner = new Scanner(String.valueOf(list));
        String[] my_array = new String[list.size()];
        list.toArray(my_array);
        for (String string : my_array) {
            System.out.println("Input the string:");
            System.out.println(string);
            System.out.println("----------------------------");
            string = string.replaceAll("Twinkle, twinkle, little Star!",
                    "Star!, twinkle, little Twinkle");
            string = string.replaceAll("How I wonder what you are!",
                    "are! I wonder what you How");
            string = string.replaceAll("Up above the world so high!",
                    "high! above the world so Up");
            string = string.replaceAll("Like a diamond in the sky!",
                    "sky! a diamond in the Like");
            string = string.replaceAll("Twinkle, twinkle, little star!",
                    "star!, twinkle, little Twinkle");
            System.out.println("New string:");
            System.out.println(string);
            System.out.println("============================");
        }

    }
}
