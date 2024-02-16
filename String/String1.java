package String;

public class String1 {
    public static void main(String[] args) {
        String str = "hi welcome to hefSHine";
        String sa[] = str.split(" ");
        for (int i = 0; i < sa.length; i++) {
            for (int j = i + 1; j < sa.length; j++) {
                if (sa[i].length() > sa[j].length()) {

                    String temp = sa[i];
                    sa[i] = sa[j];
                    sa[j] = temp;
                }
            }

        }
        System.out.println("smallest word = " + sa[0]);
        System.out.println("largest word = " + sa[sa.length - 1]);
    }
}
