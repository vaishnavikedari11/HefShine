package String;

public class AllCharFrequency {
    public static void main(String[] args) {
        String s1="abcabaaba";

        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);

            int freq=0;
            for(int j=0;j<s1.length();j++){
                if(s1.charAt(j)==ch){
                    freq++;
                
                }
            }
            System.out.println(ch+" = "+freq);
        }
    }
}
