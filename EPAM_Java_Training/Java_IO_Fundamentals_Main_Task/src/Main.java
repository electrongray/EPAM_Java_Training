import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public int StartWithPlus(String stng){
        int length1 = stng.length();
        int ctr = 0;
        for (int i = 0; i < length1; i++)
        {
            if (stng.charAt(i) == '+')
            {
                if (i < length1-1 && !Character.isLetter(stng.charAt(i+1)))
                    ctr++;
                else if (i == length1-1)
                    ctr++;
            }
        }
        return ctr;
    }
    public int StartWith_A(String stng){
        int length2 = stng.length();
        int ctr = 0;
        for (int i = 0; i < length2; i++)
        {
            if (stng.charAt(i) == 'A')
            {
                if (i < length2-1 && !Character.isLetter(stng.charAt(i+1)))
                    ctr++;
                else if (i == length2-1)
                    ctr++;
            }
        }
        return ctr;
    }

    public int StartWith_V(String stng){
        int length3 = stng.length();
        int ctr = 0;
        for (int i = 0; i < length3; i++)
        {
            if (stng.charAt(i) == 'V')
            {
                if (i < length3-1 && !Character.isLetter(stng.charAt(i+1)))
                    ctr++;
                else if (i == length3-1)
                    ctr++;
            }
        }
        return ctr;
    }
    public int StartWith_P(String stng){
        int length4 = stng.length();
        int ctr = 0;
        for (int i = 0; i < length4; i++)
        {
            if (stng.charAt(i) == 'P')
            {
                if (i < length4-1 && !Character.isLetter(stng.charAt(i+1)))
                    ctr++;
                else if (i == length4-1)
                    ctr++;
            }
        }
        return ctr;
    }


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
//                System.out.println(strLine);
                str_data += strLine;
                try {
                    strLine = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            System.out.println();
//            System.out.println(str_data);
            System.out.println();

            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
        Main m = new Main();
        String str1 = str_data;
        System.out.println("The given string is: "+str1);
        System.out.println("The number of folders is: "+ m.StartWithPlus(str1));
        System.out.println("The number of files in folder A is: "+ m.StartWith_A(str1));
        System.out.println("The number of files in folder V is: "+ m.StartWith_V(str1));
        System.out.println("The number of files in folder P is: "+ m.StartWith_P(str1));
        System.out.println("The Average number of files is: " + (m.StartWith_A(str1)
                + m.StartWith_V(str1)+ m.StartWith_P(str1))/3);

        char[] ch = str_data.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        for(int i = 0; i < str_data.length(); i++){
            if(Character.isLetter(ch[i])){
                letter ++ ;
            }
            else if(Character.isDigit(ch[i])){
                num ++ ;
            }
            else if(Character.isSpaceChar(ch[i])){
                space ++ ;
            }
            else{
                other ++;
            }
        }
        System.out.println("The Average length string of files is: "
                + (str_data.length()-space-other)/(m.StartWith_A(str1)
                + m.StartWith_V(str1)+ m.StartWith_P(str1)));
        System.out.println("The Common string length is : "+ str_data.length());
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + other);

        String filename = "file1.txt";
        FileWriter fw = null;
        try {
            fw = new FileWriter(filename, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            assert fw != null;
            fw.write("The given string is: "+str1 + "\n");
            fw.write("\n");
            fw.write("The number of folders is: "+ m.StartWithPlus(str1) + "\n");
            fw.write("\n");
            fw.write("The number of files in folder A is: "+ m.StartWith_A(str1) + "\n");
            fw.write("\n");
            fw.write("The number of files in folder V is: "+ m.StartWith_V(str1) + "\n");
            fw.write("\n");
            fw.write("The number of files in folder P is: "+ m.StartWith_P(str1) + "\n");
            fw.write("\n");
            fw.write("The Average number of files is: " + (m.StartWith_A(str1)
                    + m.StartWith_V(str1)+ m.StartWith_P(str1))/3 + "\n");
            fw.write("\n");
            fw.write("The Average length string of files is: "
                    + (str_data.length()-space-other)/(m.StartWith_A(str1)
                    + m.StartWith_V(str1)+ m.StartWith_P(str1)));

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