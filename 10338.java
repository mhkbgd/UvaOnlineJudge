import java.math.BigInteger;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num =  input.nextInt();
        while(num>0){
            String name = input.next();
            int number = 1;
            int count = name.length();
            System.out.println("Data set "+number+": "+getNum(count));
            number++;
            num--;
        }
    }
    public static long getNum(int num){
        long temp=1;
        while(num-->1){
            temp *= (num+1);
        }
        return temp/2;
    }
           
}
    
    
    
    

