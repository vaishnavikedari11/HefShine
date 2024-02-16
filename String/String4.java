package String;

public class String4 {
    public static void main(String[] args) {
        String s1="you all are very very very very good Studenets";

        //we split string int array
        String sa[]=s1.split(" ");
        //we revrse array
        int start=0;
        int end=sa.length-1;
        while(start<end){
            String temp=sa[start];
            sa[start]=sa[end];
            sa[end]=temp;
            start++;
            end--;
        }
        //we can convert array into string
        String newStr="";
        for(int i=0;i<sa.length;i++){
            newStr=newStr+sa[i]+" ";
        }
        System.out.println(newStr);
    }
}
