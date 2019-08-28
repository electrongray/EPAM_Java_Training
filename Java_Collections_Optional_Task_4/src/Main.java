import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static List<Integer> list = new ArrayList<Integer>();
    public static void enterList() //function for input list
    {
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < 15; i++) {
            int number = -15 + random.nextInt(16 + 15);
            list.add(number);
        }
    }
    public static void printList() //Function for output list
    {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello Tasks!");
        {
            enterList();
            printList();
            int i = 0;
            int resource = 0;
            while(i < list.size() - resource)
            {
                if(list.get(i) < 0)
                {
                    list.add(list.get(i));
                    list.remove(list.get(i));
                    resource++;
                }
                else
                    i++;
            }
            printList();

            System.out.println();
        }

    }
}
