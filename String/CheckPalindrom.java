package StringFolder;
//equals() method checks the content
//== operator can check address.
public class CheckPalindrom {
    public static void main(String[] args) {
        String str="abcba";
        String revStr="";
        for(int i=str.length()-1;i>=0;i--){
            revStr=revStr+str.charAt(i);
        }
        if(str.equals(revStr)==true){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
