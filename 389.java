package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.math.BigInteger;

public class Test{
    public static void main(String[] args) {
		PrintWriter pr = new PrintWriter(new BufferedWriter(
				new OutputStreamWriter(System.out)));
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(
				System.in)));
		int from, to;
		String num, ans;
		BigInteger n;

		while (sc.hasNext()) {
			num = sc.next();
			from = sc.nextInt();
			to = sc.nextInt();

			n = new BigInteger(num, from);
			ans = n.toString(to).toUpperCase();
			if (ans.length() > 7)
				ans = "ERROR";
			pr.printf("%7s\n", ans);
		}
		pr.close();
	}
    
       
}  
