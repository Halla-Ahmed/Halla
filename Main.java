import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int numbers=s.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            list.add(numbers);
        }
        sort(list);
        System.out.println(list);


    }
}
public static void sort(ArrayList<Integer>list){
    for (int i = 0; i < list.size() - 1; i++) {
        int min = list.get(i);
        int index = i;

        for (int j = i + 1; j < list.size(); j++) {
            if (min > list.get(j)) {
                min= list.get(j);
                index = j;
            }
        }

        if (index != i) {
            list.set(index, list.get(i));
            list.set(i, min);
        }
    }
    }}