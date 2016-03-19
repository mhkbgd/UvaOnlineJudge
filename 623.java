import java.math.BigInteger;
import java.util.Scanner;


class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) { 
            int num = input.nextInt();
            System.out.println(num+"!");
            System.out.println(factorial(num));
        }
        
        
    }
    public static BigInteger factorial(int number){
        BigInteger temp = new BigInteger("1");
        for (int i = 1; i <= number; i++) {
            BigInteger a = new BigInteger(String.valueOf(i));
            temp = temp.multiply(a);
        }
        return temp;
        
    }
    
    
}

