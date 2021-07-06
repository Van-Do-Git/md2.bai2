import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n");
        int n = sc.nextInt();
        if (n<2){
            System.out.println(n+ " is not Prime");
        }else {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n%i==0){
                    check = false;
                }
            }
            if (check)
                System.out.println(n+ " is Prime");
            else {
                System.out.println(n+ " is not Prime");
            }
        }
    }
}
