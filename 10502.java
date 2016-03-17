package test;
import java.util.*;
public class Main {

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
            for (int i = 0; i < num; i++) {
                int a = input.nextInt();
                int b = input.nextInt();
                int c = input.nextInt();
                int result = c*(2*a-b)/(a+b);
                System.out.println(result);
            }
    }
    
}
