package StringFolder;

public class EndsWith {
    public static void main(String[] args) {
        String str="hefshine";
        String str2="shine";
        //by using method endsWith();
        boolean endsWith=str.endsWith(str2);
        System.out.println(endsWith);

        //method call
        boolean ends=myEndsWith(str,str2);
        System.out.println(ends);
    }
    static boolean myEndsWith(String str,String str2){
        if(str2.length()>str.length()){
            return false;
        }
        int strIndex=0;
        int str2Index=0;
        while(str2Index>=0){
            if(str.charAt(strIndex)!=str2.charAt(str2Index)){
                return false;
            }
            strIndex--;
            str2Index--;
        }
        return true;
    }
}
