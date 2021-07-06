import java.util.Scanner;

public class TotalInterest {
    public static void main(String[] args) {
        final double rate = 0.06;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so tien gui");
        int money = sc.nextInt();
        System.out.println("nhap so thang gui");
        int month = sc.nextInt();
        double totalInterest=0;
        for (int i = 0; i < month; i++) {
            totalInterest +=money*rate/12;
        }
        System.out.println(totalInterest);
    }
}
