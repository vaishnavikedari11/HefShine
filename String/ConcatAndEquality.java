package StringFolder;

public class ConcatAndEquality {
    public static void main(String[] args) {
        String s1="hefshine";
        String s2="hefshine";
        String s3=new String("software");
        //concatination of strings
        //1st way
        String s4=s1+s2;
        System.out.println(s4);
        //2nd way
        String s5=s1.concat(s2);
        System.out.println(s5);

        //equality of strings
        //by using equality operator
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        //by using method equals()
        boolean s6=s1.equals(s5);
        System.out.println(s6);


    }
}
