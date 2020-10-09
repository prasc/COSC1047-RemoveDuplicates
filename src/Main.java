import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void removeDuplicate(ArrayList<Integer> list) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 Integers");

        for (int i = 0; i< 10; i++) {
            int value = input.nextInt();

            if (!list.contains(value)) {
                list.add(value);
            }
        }
        System.out.println("The distinct integers are: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        removeDuplicate(list);

    }
}


