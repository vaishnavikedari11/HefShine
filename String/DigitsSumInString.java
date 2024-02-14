package StringFolder;

public class DigitsSumInString {
    public static void main(String[] args) {
        String s1="123hef456";
        int sum=0;
        
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)>='0' && s1.charAt(i)<='9'){
                int num=Character.getNumericValue(s1.charAt(i));
                sum=sum+num;
            }
        }
        System.out.println(sum);
    }
}
