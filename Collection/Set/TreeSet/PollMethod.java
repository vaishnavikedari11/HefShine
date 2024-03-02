import java.util.TreeSet;

public class PollMethod {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(11);
        ts.add(9);
        ts.add(13);
        ts.add(18);
        ts.add(2);
        ts.add(23);
        //pollFirst() = this can get the first element and then it delete that element
        System.out.println("get First element and remove that element = "+ts.pollFirst());
         //pollLasrt() = this can get the Lastt element and then it delete that element
         System.out.println("get Last element and remove that element = "+ts.pollLast());
        

    }
}
