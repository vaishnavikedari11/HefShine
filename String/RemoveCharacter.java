package StringFolder;

public class RemoveCharacter {
    public static void main(String[] args) {
        String str="hefShine";
        char ch='f';
        String newStr="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                continue;
            }else{
                newStr=newStr+str.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}
