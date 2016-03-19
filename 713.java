import java.math.BigInteger;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        int count;
        BigInteger a,b,c;
        StringBuffer sb;
        Scanner input = new Scanner (System.in);
        count = input.nextInt();
        for (int i = 0; i < count; i++) {
             sb = new StringBuffer(input.next());
             a = new BigInteger(sb.reverse().toString());
             sb = new StringBuffer(input.next());
             b = new BigInteger(sb.reverse().toString());
             c = a.add(b);
             sb =new StringBuffer(c.toString());
             c = new BigInteger(sb.reverse().toString());
            System.out.println(c);
        }
    }
    
       
}  