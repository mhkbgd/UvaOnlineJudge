import java.text.ParseException;
import java.util.Scanner;



class Main {
    
    public static void main(String[] args) throws ParseException {
       Scanner input = new Scanner(System.in);
        while(input.hasNextLine()){
            String time1 = input.nextLine();
            String time2 = input.nextLine();
            String []part  = time1.split(" ");
            String time1value[] = part[0].split(":");
            String time2value[] = time2.split(":");
            double speed = Double.valueOf(part[1]);
            //double hour = Double.parseDouble(time2value[0])-Double.parseDouble(time1value[0]);
            //double minute = (Double.parseDouble(time2value[1])-Double.parseDouble(time1value[1]))/60;
            //double sec = (Double.parseDouble(time2value[2])-Double.parseDouble(time1value[2]))/3600;
            //double totalTime =(Double.parseDouble(time2value[0])-Double.parseDouble(time1value[0]))+((Double.parseDouble(time2value[1])-Double.parseDouble(time1value[1]))/60)+((Double.parseDouble(time2value[2])-Double.parseDouble(time1value[2]))/3600) ;
            double distance = speed*((Double.parseDouble(time2value[0])-Double.parseDouble(time1value[0]))+((Double.parseDouble(time2value[1])-Double.parseDouble(time1value[1]))/60)+((Double.parseDouble(time2value[2])-Double.parseDouble(time1value[2]))/3600));
            System.out.printf(time2+" %.2f km",distance);
            
        }
            
            
       
        
    }
    
}