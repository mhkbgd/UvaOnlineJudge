import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.math.BigInteger;

class Main {

    public static void main(String[] args) {
       Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
      
       while (true) {
           
           int  b= input.nextInt();
           if(b==0)break;
           BigInteger p = new BigInteger(input.next(),b);
           BigInteger m = new BigInteger(input.next(),b);
           System.out.println(p.mod(m).toString(b));
            
        }
 
        
       
    }
    
}
