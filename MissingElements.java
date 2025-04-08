
import java.util.HashSet;


public class MissingElements {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,7,8};
        int start=1;
        int end =10;
        
        findMissingElements(arr,start,end);
    }

    public static void findMissingElements(int arr[],int start,int end ){
        HashSet<Integer> set= new HashSet<>();

        for(int num : arr){
            set.add(num);

        }
        System.out.println("The missing elements are:");

       for(int i=start;i<end;i++){ 
        if(!set.contains(i))
          System.out.print(i +" ");
       }

    }
}
