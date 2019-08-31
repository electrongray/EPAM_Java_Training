package Java_IO_Optional_Task_5.src;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {

    private static int score = 0;
    private static String upp_name = "";
    private static String name = "";
    private static String upp_id = "";
    private static String id = "";
    private static int upp_score = 0;
    private static String down_name = "";
    private static String down_id = "";
    private static int down_score = 0;
    private static int valueId = 0;
    private static int upp_str_id = 0;
    private static int down_str_id = 0;

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
                    (new InputStreamReader(new FileInputStream("file.txt"), "UTF-8"));
            while (((strLine1 = reader.readLine()) != null) && reader.getLineNumber() <= 20) {
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
            name = String.valueOf(string.substring(0, 6));
            score = Integer.parseInt(String.valueOf(string.substring(11)));
            id = String.valueOf(string.substring(8, 10));
            valueId = Integer.parseInt(String.valueOf(string.substring(8, 10)));

            if (7 < score) {
                upp_str_id = valueId;
                upp_id = id;
                upp_score = score;
                upp_name = name.toUpperCase() + " ";
                String[] my_array1 = new String[]{"Andre   01 7",
                        "MARK    02 8", "DAVID   03 9", "OLIVER  04 8",
                        "GEORGE  05 9", "Vlad    06 7", "PETER   07 8",
                        "Paule   08 6", "JOHN    09 8", "Serge   10 7"};

                ArrayList<String>  list1 = new ArrayList<>(Arrays.asList(my_array1));
                String filename = "file1.txt";
                FileWriter fw = null;
                try {
                    fw = new FileWriter(filename, false);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    fw.write(String.valueOf((String.valueOf(list1))));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(string.toUpperCase());
            }
            if (7 >= score) {
                down_str_id = valueId;
                down_id = id;
                down_score = score;
                down_name = name + " ";
                System.out.println(string);
            }

            scanner.close();
        }
    }

}