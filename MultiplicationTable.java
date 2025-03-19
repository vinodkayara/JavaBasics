
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter the Number  for Multiplication Table:");
        Scanner sc = new Scanner(System.in);
        number =sc.nextInt();


        for(int i=1;i<=10;i++){
            int answer = number * i;
            System.out.println(number + " * " +  i + " = "+ answer);
        }
    }
    
}
