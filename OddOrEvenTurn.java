
import java.util.Scanner;

public class OddOrEvenTurn {
    public static void main(String[] args) {
        
        int number;
        System.out.print("Enter a Number :");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();



        String EvenOrOdd = (number % 2==0) ? "even" : "odd";
        System.out.println(EvenOrOdd);

    }
}
