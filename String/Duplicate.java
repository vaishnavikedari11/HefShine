package String;

public class Duplicate {
    public static void main(String[] args) {
        String s1="abcbabcdaba";

        String duplicate="";
        for(int i=0;i<s1.length();i++){
            int count=0;
            for(int j=i+1;j<s1.length();j++){
                if(s1.charAt(i)==s1.charAt(j)){
                    count++;
                }
            }
            if(count==0){
                duplicate=duplicate+s1.charAt(i);
            }
        }
        System.out.println("duplicate character string = "+duplicate);
    }
}
