import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


class Main {
    public static String notJolly = "Not Jolly";
    public static String Jolly = "Jolly";
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        StringTokenizer token;
        int numberOfNumbers;
        while (input.hasNext()) {
            token = new StringTokenizer(input.nextLine());
            numberOfNumbers = Integer.parseInt(token.nextToken());
            int []numbers = new int [numberOfNumbers];
            for (int i = 0; i <numberOfNumbers; i++) {
                numbers[i] = Integer.parseInt(token.nextToken());
                
            }
            System.out.println(isJolly(numbers));
        }
        System.exit(0);
    }
    private static String isJolly(int []numbers){
        List results = new ArrayList();
        for (int i = 0; i < numbers.length-1; i++) {
            int reslut = Math.abs(numbers[i]-numbers[i+1]);
            if(reslut==0){
                return notJolly;
            }if(reslut>=numbers.length){
                return Jolly;
            }if(results.contains(reslut)){
                return notJolly;
            }
            results.add(reslut);
            
        }
        return Jolly;
    }
    
}
