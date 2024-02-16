package String;

public class MaxFrequencyChar {
    public static void main(String[] args) {
        String s1 = "welcome";

        int max = 0;

        char ch1 = s1.charAt(0);

        for (int i = 0; i < s1.length(); i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (s1.charAt(i) == s1.charAt(j)) {
                    count++;
                }
            }
            if (count == 0) {
                int freq = 0;
                for (int j = 0; j < s1.length(); j++) {
                    if (s1.charAt(i) == s1.charAt(j)) {
                        freq++;
                    }
                }

                if (freq > max) {
                    max = freq;
                    ch1 = s1.charAt(i);
                }
            }
        }
        System.out.println(ch1 + " = " + max);
    }
}
