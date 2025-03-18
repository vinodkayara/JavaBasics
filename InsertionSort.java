public class InsertionSort {
     public static void main(String[] args) {
          int arr[]={ 12,11,13,5,6};
          int length=arr.length;

        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] =arr[j];
                j=j-1;
            }
            arr[j+1]=key;

        }

        System.out.println("the sorted array is :");
        for(int i=0; i<arr.length;i++){
        System.out.print(arr[i]+ ",");
        }
     }
}
