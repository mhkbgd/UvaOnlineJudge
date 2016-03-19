import java.math.BigInteger;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger large = new BigInteger("6227020800");
        BigInteger small = new BigInteger("10000");
        while(input.hasNext()){
            int num = input.nextInt();
            BigInteger number = factorial(num);
            if(number.compareTo(large)>0){
                System.out.println("Overflow");
            }else if(number.compareTo(small)<0){
                System.out.println("Underflow");
            }else{
                System.out.println(number);
            }
        }
    }
     public static BigInteger factorial(int number){
        BigInteger temp = new BigInteger("1");
        for (int i = 1; i <= number; i++) {
            temp = temp.multiply(new BigInteger(String.valueOf(i)));
        }
        return temp;
        
    } 
           
}
    
    
    
    

