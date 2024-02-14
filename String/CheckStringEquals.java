package StringFolder;

public class CheckStringEquals {
    public static void main(String[] args) {
        String s1 = "hefshine";
        String s2 = "hef";
        // 1st we check length of the string
       boolean equal=s1.equals(s2);
       System.out.println(equal);
       

//--------------------------------------------------------------------------------------------------
        //method calling
        boolean myans=myEqualMethod(s1, s2);
        System.out.println(myans);
    }

    private static boolean myEqualMethod(String s1, String s2) {
        // 1st we check length of the string
        if (s1.length() != s2.length()) {
            return false;
        }
        // 2nd we check characters are equal or not
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                continue;
            } else {
                return false;
            }
        }
        return true;

    }
}
