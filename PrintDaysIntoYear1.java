//print days into=years,month,week,days
public class PrintDaysIntoYear1 {
    public static void main(String[] args) {
        int days=710;
        
        int year=days/365;
        int rem=days%365;
        System.out.println("Year ="+year);

        int month=rem/30;
        int rem2=rem%30;
        System.out.println("Month ="+month);

        int week=rem2/7;
        int day=rem2%7;
        System.out.println("Week ="+week);
        System.out.println("Days ="+day);
    }
}
