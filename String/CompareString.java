package StringFolder;

public class CompareString {
    //comapreTo()=int=negative-first  string small than second string
    //                positive-first string greater than second string
     //               zero-both strings are same
    public static void main(String[] args) {
        String s2="akshay";
        String s3="aksash";
        //characters checks by their ascii value
        int s4=s2.compareTo(s3);
        System.out.println(s4);
    }
}
