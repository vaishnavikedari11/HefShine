package String;

public class Frequency {
    public static void main(String[] args) {
        String s1="abcabaabc";
        char ch='b';

        int freq=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==ch){
                freq++;
            }
        }
        System.out.println(ch+" "+freq);
    }
}
