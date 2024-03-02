import java.util.TreeSet;

public class FindLessNumberThan {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(11);
        ts.add(9);
        ts.add(13);
        ts.add(18);
        ts.add(2);
        ts.add(23);

        for(int data:ts){
            if(data<7){
            System.out.println("less number than geven number = " +data);}
        }
    }
}
