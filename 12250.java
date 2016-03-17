package test;
import java.io.PrintWriter;
import java.util.*;
public class Test {

     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
 
    int i = 1;
    String line;
    while ((line = sc.nextLine()) != null) {
      
        
      if (line.equals("#"))
        break;
      out.print("Case " + i + ": ");
      if (line.equals("HELLO")) {
        out.println("ENGLISH");
      } else if (line.equals("HOLA")) {
        out.println("SPANISH");
      } else if (line.equals("HALLO")) {
        out.println("GERMAN");
      } else if (line.equals("BONJOUR")) {
        out.println("FRENCH");
      } else if (line.equals("CIAO")) {
        out.println("ITALIAN");
      } else if (line.equals("ZDRAVSTVUJTE")) {
        out.println("RUSSIAN");
      } else {
        out.println("UNKNOWN");
      }
      i++;
    }
    out.close();
    sc.close();
  }
    
}
