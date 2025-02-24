
import java.util.Scanner;

public class Add2Num {
    public static void main(String[] args) {
        int num1 ,num2,sum;
        System.out.println("enter  first number:");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("enter seccond  number:");
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println("the sum of two num is "+sum);
        

    }
}
