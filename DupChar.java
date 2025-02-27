public class DupChar {
    public static void main(String[] args) {
        String str= "vinod kayara vikas kayara";
        
    
   
        char[] chars= str.toCharArray();
        
        System.out.println("Duplicate charactes in the string:");

        for(int i=0;i<chars.length;i++){
            int count = 1;
            if(chars[i]!=' '){
                for(int j=i+1;j<chars.length;j++){
                    if(chars[i]==chars[j]){
                        count++;
                        chars[j]=' ';//mark as counted
                    }
                }
                if(count>1){
                    System.out.println(chars[i]+ " : " + count);
                }
            }

        }

    
}

}