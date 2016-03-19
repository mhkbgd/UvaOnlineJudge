import java.math.BigInteger;
import java.util.Scanner;



class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            int num = input.nextInt();
            System.out.println(returnSum(factorial(num)));
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
    public static int returnSum(BigInteger number){
        String temp = String.valueOf(number);
        int sum=0;
        for (int i = 0; i < temp.length(); i++) {
            sum += Character.getNumericValue(temp.charAt(i));
            
        }
        return sum;
    }
    
}

