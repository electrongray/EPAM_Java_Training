import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        String strLine = "";
        String str_data = "";
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader
                    (new FileReader("file.txt"));
            while (strLine != null) {
                list.add(strLine);
                System.out.println(strLine);
                str_data += strLine;
                strLine = br.readLine();

            }
            System.out.println();
            System.out.println(str_data);
            System.out.println();

            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }

        String strTest1 = "little Star!";
        String strTest2 = "wonder what";
        String strTest3 = "the world";
        String strTest4 = "diamond in";
        String strTest5 = "little star!";
        String strTest6 = "you are!";


        String filename = "file1.txt";
        FileWriter fw = null;
        try {
            fw = new FileWriter(filename, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            assert fw != null;
            fw.write("\n");
            fw.write(str_data.substring(18, 30).toUpperCase() + "\n");
            fw.write("\n");
            fw.write(str_data.substring(36, 47).toUpperCase() + "\n");
            fw.write("\n");
            fw.write(str_data.substring(64, 75).toUpperCase() + "\n");
            fw.write("\n");
            fw.write(str_data.substring(90, 101).toUpperCase() + "\n");
            fw.write("\n");
            fw.write(str_data.substring(127, 139).toUpperCase() + "\n");
            fw.write("\n");
            fw.write(str_data.substring(145, 157).toUpperCase() + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
