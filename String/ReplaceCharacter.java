package StringFolder;

public class ReplaceCharacter {
    public static void main(String[] args) {
        String str="dfdfdfdf";
        String newStr="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='d'){
                newStr=newStr+'f';
            }else{
                newStr=newStr+str.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}
