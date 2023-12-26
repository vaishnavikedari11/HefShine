package Pattern;
/*
1
26
3710
481113
59121415
 */
public class Pattern50 {
    public static void main(String[] args) {
        int end=1;
        int num=1;
        for(int i=1;i<=5;i++){
            int diff=4;
            int num2=num;
            for(int j=1;j<=end;j++){
                System.out.print(num2);
                num2=num2+diff;
                diff--;
            }
            System.out.println();
            end++;
            num++;
        }
    }
}
