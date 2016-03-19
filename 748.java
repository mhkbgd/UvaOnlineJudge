import java.util.Scanner;
import java.math.*;

class Main{
    public static void main(String[] args) {
        BigDecimal R;
        int n;
        String ans;
        int hi,lo;
        Scanner input= new Scanner(System.in);
        while (input.hasNext()){
            R = input.nextBigDecimal();
            n = input.nextInt();
            ans = R.pow(n).toPlainString();
            lo=0;
            while (ans.charAt(0)=='0') {                
                lo++;
            }
            hi = ans.length()-1;
            while(ans.charAt(hi)=='0'){
                hi--;
            }
            for (int i = lo; i <= hi; i++) {
                System.out.print(ans.charAt(i));
                
            }
            System.out.println("");
        }
    }
}  

