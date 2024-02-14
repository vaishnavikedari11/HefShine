package StringFolder;

public class StartsWith {
    public static void main(String[] args) {
        String str="hefshine";
        String str2="hef";

        //by using java's method startsWith();
        boolean startsWith=str.startsWith(str2);
        System.out.println(startsWith);

        //method calling
        boolean starts=myStartsWith(str,str2);
        System.out.println(starts);
    }
    //other way
    static boolean myStartsWith(String str,String str2){

        //when length of second string is greater than first string then
        // we can't check next condition i.e., checking characters.
        if(str2.length()>str.length()){
            return false;
        }

        int count=0;
        for(int i=0;i<str2.length();i++){
            if(str.charAt(i)==str2.charAt(i)){
                count++;
            }
        }
        if(count==str2.length()){
            return true;
        }else{
            return false;
        }
    }

}
