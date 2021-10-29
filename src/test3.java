import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class test3 {

	public static void main(String [] args) throws IOException{
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.factorial(n);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
        System.out.println(String.valueOf(result));
	}
}

class Result {

    public static int factorial(int n) {
    // Write your code here
    	  if (n == 0)    
    		    return 1;    
    		  else    
    		    return(n * factorial(n-1));  
    }

}
