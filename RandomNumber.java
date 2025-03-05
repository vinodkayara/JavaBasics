
import java.util.Random;

public class RandomNumber {
    public static void main ( String args[]){
    
        int number ;
        Random random = new Random();
        number = random.nextInt(6);
        System.out.println("THE RANDOM NUMBER IS :"+ (number+1));


    }
}
