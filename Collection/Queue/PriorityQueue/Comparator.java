package Collection.Queue;
//Queue does not follow insertion order
//
import java.util.PriorityQueue;

public class Comparator {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        queue.add(11);
        queue.add(22);
        queue.add(33);
        queue.add(10);
        queue.add(9);

        PriorityQueue<Integer>queue2=new PriorityQueue<>();
        queue2.add(11);
        queue2.add(33);
        queue2.add(10);
        queue2.add(9);
        queue2.add(22);

        for(int data:queue){
            if(queue2.contains(data)==true){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }


    }
}
