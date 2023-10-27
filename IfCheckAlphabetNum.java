public class IfCheckAlphabetNum {
    public static void main(String[] args) {
        char ch='*';
        if(ch>='A'&& ch<='Z' || ch>='a' && ch<='z'){
            System.out.println("Given Character is Alphabet");
        }else if(ch>='0' && ch<='9'){
            System.out.println("Given character is Number");
        }else{
            System.out.println("Given ch is Special Character");
        }
    }
}
