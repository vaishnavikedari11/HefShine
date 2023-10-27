public class ForCheckPrime {
    public static void main(String[] args) {
        int num=9;
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime number");
        }else{
            System.out.println("Not prime number");
        }

    }
}
