
import java.util.Scanner;

public class UserCountSumAvg {
    public static void main(String args[]){
        int count;

        int sum=0; int num;
        System.out.println("enter the count ");
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        System.out.println("enter the numbers");
        num = sc.nextInt();



        for(int i=0;i<count;i++){
        sum = sum + num;

        float avg =sum/count;
        }
        System.out.println(sum);

    }
}
