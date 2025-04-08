
import java.util.HashSet;
import java.util.Scanner;


public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the  size of n ");
        int n =sc.nextInt();

        int nums[] = new int[n];
        System.out.println("eneter the elements of  array ");
        
        for (int i =0;i<n;i++) {
            
            nums[i]=sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }
        System.out.println("missing elements are :");

        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                System.out.println(i+ " ");
            }
        }
    }
    
}
