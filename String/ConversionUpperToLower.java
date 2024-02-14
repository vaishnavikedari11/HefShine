package StringFolder;

public class ConversionUpperToLower {
    public static void main(String[] args) {
        String s1="hefSHInE";
        //by using lower()method

        String s2=s1.toLowerCase();
        System.out.println(s2);
        //----------------------------------------------------------------------------------
        //by using method
        String myAns=myLowerMethod(s1);
        System.out.println(myAns);
    }
    private static String myLowerMethod(String s1){
        String s3="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)>='A' && s1.charAt(i)<='Z'){
                char ch=(char)(s1.charAt(i)+32);
                s3=s3+ch;
            }else{
                s3=s3+s1.charAt(i);
            }
        }
        return s3;
    }

}
