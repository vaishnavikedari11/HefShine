package StringFolder;

public class CharToNum {
    public static void main(String[] args) {
        char ch='5';
        //1st way using ascii value
        int num=ch-48;
        System.out.println(num);
        //2nd way sing method getNumericValue()
        int num1=Character.getNumericValue(ch);
        System.out.println(num1);
    }
}
