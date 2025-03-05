public class BubbleSort{
    public static void main(String[] args) {
        int arr[]={5,7,1,2,3,5};
        int length = arr.length;

        System.out.println("The original array is :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                int temp;
                 if(arr[j-1]> arr[j]){
                    temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                
                
            }
           
            }
            System.out.println();
            System.out.println("Sorted array is :");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+ " ");

        }
    }
}