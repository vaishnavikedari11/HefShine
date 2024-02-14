package StringFolder;

public class DigitCountInString {
    public static void main(String[] args) {
       // String s="hef123shine";
        String s="12345";
        int digitcount=0;
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                digitcount++;
            }
        }
        if(digitcount==s.length()){
            System.out.println("only digits");
        }else{
            System.out.println("not only digits");
        }
    }
}
