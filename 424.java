package test;

import java.math.BigInteger;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     BigInteger sum = new BigInteger("0");
     BigInteger temp;
        while (true) {
            temp = new BigInteger(input.nextLine());
            if(temp.compareTo(BigInteger.valueOf(0))==0){
                System.out.println(sum);
                break;
                
            }else{
                sum = sum.add(temp);
            }
        }
    }
}
