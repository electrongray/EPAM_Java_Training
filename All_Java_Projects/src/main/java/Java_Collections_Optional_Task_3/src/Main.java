package Java_Collections_Optional_Task_3.src;

import java.util.Stack;

public class Main {
    private static void changeValuesTwoStacks(Stack<Integer> stk1, Stack<Integer> stk2) {
        Stack<Integer> tmpStk = new Stack<>();
        int frstSize = stk1.size();
        int scdSize = stk2.size();
        for (int i = 0; i < frstSize; i++) {
            tmpStk.push(stk1.pop());
        }
        for (int i = 0; i < scdSize; i++) {
            tmpStk.push(stk2.pop());
        }
        for (int i = 0; i < scdSize; i++) {
            stk1.push(tmpStk.pop());
        }
        for (int i = 0; i < frstSize; i++) {
            stk2.push(tmpStk.pop());
        }
    }
    private static Stack<Integer> getFillStack(int bottomVal, int stepVal) {
        Stack<Integer> retFor = new Stack<>();
        for (int i = stepVal; i <= bottomVal; i += stepVal) {
            retFor.push(i);
        }
        return retFor;
    }
    private static void printTwoStack(Stack<Integer> stk1, Stack<Integer> stk2) {
        Stack<Integer> stk11 = (Stack<Integer>) stk1.clone();
        Stack<Integer> stk22 = (Stack<Integer>) stk2.clone();
        int frstSize = stk1.size();
        int scdSize = stk2.size();
        System.out.print("Stack1 ");
        for (int i = 0; i < frstSize; i++) {
            System.out.printf("%3d,", stk11.pop());
        }
        System.out.println();
        System.out.print("Stack2 ");
        for (int i = 0; i < scdSize; i++) {
            System.out.printf("%3d,", stk22.pop());
        }
        System.out.println("\n_______________________");
    }

    public static void main(String[] args) {
        System.out.println("Hello Tasks!");
        Stack<Integer> first = getFillStack(5,1);
        Stack<Integer> second = getFillStack(30,10);
        printTwoStack(first, second);
        changeValuesTwoStacks(first, second);
        printTwoStack(first, second);

    }
}