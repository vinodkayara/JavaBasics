
import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of n ");
        int n =sc.nextInt();

        int []nums = new int[n];
        System.out.println("enetr the elements of n");
      
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        for(int num :nums){
            set.add(num);

        }

        System.out.print("After removing duplicate elements ");

        for(int unique : set){
            System.out.print(unique + " ");
        }

    }
}
