package Pattern;
/*
12345
1234
123
12
1
 */
public class Pattern32 {
    public static void main(String[] args) {
        int end=5;
        int num=1;
        for(int i=1;i<=5;i++){
            int num2=num;
            for(int j=1;j<=end;j++){
                System.out.print(num2);
                num2++;
            }
            System.out.println();
            end--;

        }
    }
}
