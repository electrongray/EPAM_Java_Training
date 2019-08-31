package Java_Fundamentals_Optional_Task_1.src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//1.0
        System.out.println("Insert Name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
//2.0
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Insert integers 1234567: ");
        int value = scanner1.nextInt();
        int revers = 0;
        while (value != 0) {
            revers = revers * 10 + (value % 10);
            value = value / 10;
        }
        System.out.print("Revers : " + revers);
        System.out.println();
//3.1
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Insert args of Array's 'ar' : ");
        int value1 = scanner2.nextInt();
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        for (int i : array) {
            System.out.println(i);
        }
            System.out.println();
//3.2
            Scanner scanner3 = new Scanner(System.in);
            System.out.print("Insert args of Array's 'ar1': ");
            int value2 = scanner3.nextInt();
            int[] array1 = {1, 2, 3, 4, 5, 6, 7};
            for (int i1 : array1) {
                System.out.print(i1);
            }
        }
    }







