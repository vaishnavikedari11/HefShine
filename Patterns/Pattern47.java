package Pattern;
/*
1
23
456
78910
1112131415
 */
public class Pattern47 {
    public static void main(String[] args) {
        int end=1;
        int num=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=end;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
            end++;
        }
    }
}
