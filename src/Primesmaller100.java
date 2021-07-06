public class Primesmaller100 {
    public static void main(String[] args) {
        for (int j = 0; j <=100 ; j++) {
            if(isPrime(j)){
                System.out.print(j+"\t");
            }
        }
    }
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }else {
            int newn=(int) Math.sqrt(n);
            for (int i = 2; i <= newn; i++) {
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}
