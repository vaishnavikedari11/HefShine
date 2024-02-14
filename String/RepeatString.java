package StringFolder;

public class RepeatString {
    public static void main(String[] args) {
        String s1="abcd";//output will be ->abcdabcd
        //by using repeat()method 
        String s2=s1.repeat(2);
        System.out.println(s2);

        //by using loop output will be-> aabbccdd
        String s3="";
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            s3=s3+ch+ch;
        }
        System.out.println(s3);
    }
}
