package Java_IO_Optional_Task_4.src;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        String strLine = "";
        List<String> list = new ArrayList<String>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
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
            LineNumberReader reader = null;
            try {
                reader = new LineNumberReader(new InputStreamReader
                        (new FileInputStream("file.txt"), "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            while (true) {
                try {
                    if (!(((strLine1 = reader.readLine()) != null)
                            && reader.getLineNumber() <= 62)) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String upper_case_line = "";
                Scanner lineScan = new Scanner(strLine1);
                while(lineScan.hasNext()) {
                    String word1 = lineScan.next();
                    int len = word1.length();

                    upper_case_line += Character.toUpperCase(word1.charAt(0)) +
                            word1.substring(1) + " ";
                    if (len > 2) {
                        String upper_str = word1.toUpperCase();
                        System.out.println(upper_str);
                    }
                }
            }

        } finally {

        }
    }
}