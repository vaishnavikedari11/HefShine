package StringFolder;

public class ConversionLowerToUpper {
    public static void main(String[] args) {
        String s1 = "hefShiNe";
        // by using upper()method
        String s2 = s1.toUpperCase();
        System.out.println(s2);
        // by using method

        String ans = myUpperMethod(s1);
        System.out.println(ans);
    }

    private static String myUpperMethod(String s1) {
        String s3 = "";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') {
                char ch = (char) (s1.charAt(i) -32);
                s3 = s3 + ch;
            } else {
                s3 = s3 + s1.charAt(i);
            }
        }
        return s3;
    }
}
