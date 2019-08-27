import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import static java.lang.String.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Task_OK!");

        List<String> listMenArray = new ArrayList<>();
        listMenArray.add("'a");
        listMenArray.add("'b");
        listMenArray.add("'c");
        listMenArray.add("'d");
        listMenArray.add("'e");
        listMenArray.add("'f");
        listMenArray.add("'g");
        listMenArray.add("'h");
        listMenArray.add("'k");
        listMenArray.add("'l");

        System.out.println(listMenArray);
        while (listMenArray.size() > 1) {
            Iterator iterator = listMenArray.iterator();
            for (int i = 0; iterator.hasNext(); i++, iterator.next()) {
                if (i % 2 == 1) {
                    i=0;
                    iterator.remove();
                    System.out.println(listMenArray);
                }
            }
        }
        List<String> listManLinked = new LinkedList<>();
        listManLinked.add("a'");
        listManLinked.add("b'");
        listManLinked.add("c'");
        listManLinked.add("d'");
        listManLinked.add("e'");
        listManLinked.add("f'");
        listManLinked.add("g'");
        listManLinked.add("h'");
        listManLinked.add("k'");
        listManLinked.add("l'");

        System.out.println(listManLinked);
        while (listManLinked.size() > 1) {
            Iterator iterator = listManLinked.iterator();
            for (int i = 0; iterator.hasNext(); i++, iterator.next()) {
                if (i % 2 == 1) {
                    i=0;
                    iterator.remove();
                    System.out.println(listManLinked);
                }
            }
        }
        double parseDouble = 0;

        for (int i = 0; i < parseDouble; i++) {
            listMenArray.add(listMenArray.toString());
            listManLinked.add(listManLinked.toString());
        }
        Long startTime = System.nanoTime();
        Long endArrayList = System.nanoTime();
        System.out.println();
        System.out.println(format( "Nano Time ArrayList: "
                + "%,d ns", endArrayList - startTime));
        Long endLinkedList = System.nanoTime();
        System.out.println(format( "Nano Time LinkedList: "
                + "%,d ns", endLinkedList - startTime));

    }
}