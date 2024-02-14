package StringFolder;

public class ArrayToSTring {
    public static void main(String[] args) {
        char ca[]={'h','e','f','s','h','i','n','e'};
        String str="";
        for(int i=0;i<ca.length;i++){
            str=str+ca[i];
        }
        System.out.println(str);
        //or using new keyword
        String s2=new String(ca);
        System.out.println(s2);
    }
}
