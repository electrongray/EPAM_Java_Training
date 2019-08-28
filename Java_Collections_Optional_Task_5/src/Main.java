import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Task!");
        Stack stack = new Stack();
        int n=0;
        System.out.println("Insert any Integers and press 'ENTER': ");
        Scanner sc1 = new Scanner(System.in);
        try {
            n = sc1.nextInt();

        } catch (InputMismatchException fg)
        {
            System.out.print("You Inserted not Integer." );
        }

        char [] numbers = String.valueOf(n).toCharArray();
        for(char num : numbers){
            stack.push(num);}

        while(!stack.empty())
        {
            char stackNum;
            stackNum = (Character)stack.pop();
            System.out.print(stackNum);
        }

    }
}