package String;

public class CheckLexicographicaly {
    public static void main(String[] args) {
        String s1="hef";
        String s2="hefcv";
//by using method compareTo();
        int comareTo=s1.compareTo(s2);
        System.out.println(comareTo);

        //by using own logic

        int myAns=myCompareToMethod(s1,s2);
        System.out.println(myAns);

    }
    static int myCompareToMethod(String s1,String s2){
        for(int i=0;i<Math.min(s1.length(),s2.length());i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return s1.charAt(i)-s2.charAt(i);
            }
        }
        return s1.length()-s2.length();
    }
}
