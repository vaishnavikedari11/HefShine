package String;

public class String3 {
    public static void main(String[] args) {
        String s1 = "        hef   shine     ";

        // using trim method
        String s3=s1.trim();
        System.out.println(s3);

        // using my method
        String myTrimMethod=myTrimMethod(s1);
        System.out.println(myTrimMethod);
    }

    static String myTrimMethod(String s1) {
        // finding start non space index
        int start = -1;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != ' ') {
                start = i;
            }
        }
        // finding end non space index
        int end = -1;
        for (int i = s1.length() - 1; i >= 0; i--) {
            if (s1.charAt(i) == ' ') {
                end = i;
            }
        }
        // printing middle part of string which
        String s2="";
        for (int i = start; i < end; i++) {
            s2 = s2 + s1.charAt(i);
        }
        return s2;
    }
}
