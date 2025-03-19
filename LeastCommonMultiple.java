
import java.util.Scanner;

public class LeastCommonMultiple{
    public static void main(String[] args) {
        int n1,n2;
        System.out.print("Enter  First number:" );
        Scanner sc = new Scanner(System.in);
        n1=sc.nextInt();
        System.out.print("Enter  Seccond  number:" );
        n2=sc.nextInt();


        int lCM = (n1>n2)? n1:n2;

        while (true) { 
            if(lCM % n1== 0 && lCM%n2 == 0){
          System.out.print( "The LCM is "+ lCM );
        
         break;
        }
        ++lCM;

    }
    
}
}
