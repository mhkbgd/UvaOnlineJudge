import java.math.BigInteger;
import java.util.Scanner;



class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            int num = input.nextInt();
            if(num==0){
                break;
            }else{
                    BigInteger number = factorial(num);
                    System.out.println(num+"! --");
                    int zero=0,one=0,two=0,three=0,four=0,five=0,six=0,seven=0,eight=0,nine=0;
                    for (int i = 0; i < getSize(number); i++) {
                        switch (String.valueOf(number).charAt(i)){
                            case '0':zero++;break;
                            case '1':one++;break;
                            case '2':two++;break;
                            case '3':three++;break;
                            case '4':four++;break;
                            case '5':five++;break;
                            case '6':six++;break;
                            case '7':seven++;break;
                            case '8':eight++;break;
                            case '9':nine++;break;
                
                        }
            
                    }
                    System.out.println("(0)  "+zero+"  (1)  "+one+"  (2)  "+two+"  (3)  "+three+"  (4)  "+four);
                    System.out.println("(5)  "+five+"  (6)  "+six+"  (7)  "+seven+"  (8)  "+eight+"  (9)  "+nine);
            }
        }
        
        
    }
    public static BigInteger factorial(int n){
        BigInteger a = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            a = a.multiply(new BigInteger(String.valueOf(i)));
            
        }
        return a;
    }
    public static int getSize(BigInteger num){
        int count=0;
        while (!num.equals(BigInteger.ZERO)) {
            num = num.divide(BigInteger.TEN);
            count++;
        }
        return count;
    }
    
}

