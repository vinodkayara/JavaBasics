public class RevStr {
    public static void main (String[] args){
        String str= "abc";
        String rev="";
        char ch;

        for(int i=0;i<str.length();i++){
             ch= str.charAt(i);
             rev=ch+ rev;

        }
        System.out.println("rev  string is  " + rev );
        

    }
}
