
import java.util.Scanner;

public class CoundSUm {
    public static void main(String[] args) {
        int count =0;
        System.out.println("the count is");
        Scanner sc =new Scanner(System.in);
        count =sc.nextInt();
        int sum=0,num;

        for(int i=0;i<count;i++){
            
            num = sc.nextInt();
            sum = sum + num;
           
        }
        System.out.println(sum);
    }
    
}
