import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problem179 {
	 static class FastReader 
	    { 
	        BufferedReader br; 
	        StringTokenizer st; 
	  
	        public FastReader() 
	        { 
	            br = new BufferedReader(new
	                     InputStreamReader(System.in)); 
	        } 
	  
	        String next() 
	        { 
	            while (st == null || !st.hasMoreElements()) 
	            { 
	                try
	                { 
	                    st = new StringTokenizer(br.readLine()); 
	                } 
	                catch (IOException  e) 
	                { 
	                    e.printStackTrace(); 
	                } 
	            } 
	            return st.nextToken(); 
	        } 
	  
	        int nextInt() 
	        { 
	            return Integer.parseInt(next()); 
	        } 
	  
	        long nextLong() 
	        { 
	            return Long.parseLong(next()); 
	        } 
	  
	        double nextDouble() 
	        { 
	            return Double.parseDouble(next()); 
	        } 
	  
	        String nextLine() 
	        { 
	            String str = ""; 
	            try
	            { 
	                str = br.readLine(); 
	            } 
	            catch (IOException e) 
	            { 
	                e.printStackTrace(); 
	            } 
	            return str; 
	        } 
	    } 

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	FastReader fr = new FastReader();
		int times = Integer.valueOf(fr.next());
		
		for(int v =0; v < times; v++){
		int val = fr.nextInt();
		int count = 0;
		for(int i = 2; i < val; i++){
//		
			if(divisor(i) == divisor(i+1)){
				count++;
				
			}
		}
		
		System.out.println(count);
		//1bufOut.flush();
	}
		
	}
	public static int divisor(int n){
		int kount = 0;
		int upplimit = (int) Math.sqrt(n) + 1;
	for(int i = 2; i < upplimit ; i++){
		
		if(n% i == 0){
			kount++;
			if(i != n/i){
				kount++;
			}
		}
		
	}
	
	return kount;
	}
}
