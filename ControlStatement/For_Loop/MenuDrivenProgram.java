import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        while(true){
            System.out.println("Enetr Number");
            int num=sc.nextInt();
            System.out.println("1.Prime");
            System.out.println("2.even");
            System.out.println("3.odd");
            System.out.println("4.exit");
            int choice=sc.nextInt();
            //prime
            if(choice==1){
            
                int count=0;

                for(int i=1;i<=num;i++){
                    if(num%i==0){
                        count++;
                    }
                }
                if(count==2){
                    System.out.println("prime");
                }else{
                    System.out.println("not a prime number");
                }
            }
            
            //even
            if(choice==2){
                if(num%2==0){
                    System.out.println("even number");
                }
            }

            //odd
            if(choice==3){
                if(num % 2 !=0){
                    System.out.println("odd number");
                } 
            }

            //exit
            if(choice==4){
                System.out.println("stop execution");
                break;
            }
        }
    }
}
