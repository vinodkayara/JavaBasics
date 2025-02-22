import java.util.Scanner;

public class PrimeOnot{
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num =sc.nextInt();

        int flag=0;

            if(num<=1){
               flag=1;
            }
            else{
                for(int i=2; i<=Math.sqrt(num);i++){
                    if(num%2==0){
            
                        flag=1;
                        break;
                    }
                }
            }

            if(flag==0){
                System.out.println(num + "is   prime ");
            }
            else{
                System.out.println(num+ " is not  prime");
            }
    }
}
