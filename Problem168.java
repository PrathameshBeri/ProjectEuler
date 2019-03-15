import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem168 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long sum = 0;
        try {
            String t = br.readLine();
            int n = Integer.valueOf(t);
            long limit = (long)Math.pow(10, n);
            for(long i = 11 ; i < limit; i++){
                
               // long digit = i % 10;
              //  long remaining = i/10;
               // String s = Long.toString(digit) + Long.toString(remaining);
               String y = String.valueOf(i);
               int length = y.length();
               String o = y.charAt(length-1) + y.substring(0,length-1);
               
                long number = Long.valueOf(o);
                if(number % i == 0){
                    
                    sum += i;
                    
                }
            }
            System.out.println(sum % 10000);
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}