import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 5 numbers: ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            list.add(input.nextInt());
        sort(list);
        System.out.println(list);

    }
    public static void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int Min = list.get(i);
            int Index = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (Min > list.get(j)) {
                    Min = list.get(j);
                    Index = j;
                }
            }

            if (Index != i) {
                list.set(Index, list.get(i));
                list.set(i, Min);
            }
        }
    }
}