import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter integr value: ");
        int x = input.nextInt();

        MyInteger a = new MyInteger(x);
        MyInteger b = new MyInteger(1);
        System.out.println(a.isEven(a));
        System.out.println(a.isOdd(a));
        System.out.println(a.isPrime(a));
        System.out.println(MyInteger.isEven(b));
        System.out.println(MyInteger.isOdd(b));
        System.out.println(MyInteger.isPrime(b));
        System.out.println(a.equals(b));

    }
}