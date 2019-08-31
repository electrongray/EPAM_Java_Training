package Java_Error_And_Exceptions_Task.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws OutOfMemoryError{
        try {
            FileWriter myWriter = new FileWriter("file.txt");
            myWriter.write("1.99; 11.99; 21.99; 305.99; 408.99; 507.99; 100.99; 250.99; ");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            File myObj = new File("file.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        String test = "1.99; 11.99; 21.99; 305.99; 408.99; 507.99; 100.99; 250.99; ";
        String one = "1.99";
        double oneDo = Double.parseDouble(one);
        String two = "11.99";
        double twoDo = Double.parseDouble(two);
        String three = "21.99";
        double threeDo = Double.parseDouble(three);
        String four = "305.99";
        double fourDo = Double.parseDouble(four);
        String five = "408.99";
        double fiveDo = Double.parseDouble(five);
        String six = "507.99";
        double sixDo = Double.parseDouble(six);
        String seven = "100.99";
        double sevenDo = Double.parseDouble(seven);
        String eight = "250.99";
        double eightDo = Double.parseDouble(eight);

        ArrayList<Double> doubles = new ArrayList<>();

        doubles.add(oneDo);
        doubles.add(twoDo);
        doubles.add(threeDo);
        doubles.add(fourDo);
        doubles.add(fiveDo);
        doubles.add(sixDo);
        doubles.add(sevenDo);
        doubles.add(eightDo);

        System.out.println("Doubles Array List: " + doubles);
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(three);
        arrayList.add(four);
        arrayList.add(five);
        arrayList.add(six);
        arrayList.add(seven);
        arrayList.add(eight);

        double sum = 0;
        for(double i: doubles){
            sum += i;
        }
        double average = sum / doubles.size();
        System.out.println("The Sum is " + sum);
        System.out.println("The Average is " + average);
        System.out.println("ArrayList String:   " + arrayList);
        count(test);
        System.out.println("string length: " + test.length());
    }
    public static void count(String x){
        char[] ch = x.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        for(int i = 0; i < x.length(); i++){
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
        System.out.println(  "String test:   "+"1.99; 11.99; 21.99; 305.99; 408.99; 507.99; 100.99; 250.99; " );
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + other);

    }
}