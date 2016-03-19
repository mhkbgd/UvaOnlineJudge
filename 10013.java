import java.util.Scanner;
import java.math.BigInteger;

class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
            int M = input.nextInt();
            String num1 = new String("");
            String num2 = new String("");
            int dig1,dig2;
            for (int j = 0; j < M; j++) {
                dig1 = input.nextInt();
                dig2 = input.nextInt();
                num1 +=dig1;
                num2 +=dig2;
            }
             BigInteger a = new BigInteger(num1);
             BigInteger b = new BigInteger(num2);
             System.out.println(a.add(b));
             if(i!=N-1){
                 System.out.println("");
             }
        }
       
        
        
    }
    
}

