import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Day10_BinaryConverter {

	public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        String i = Integer.toBinaryString(n); System.out.println(i);
	}

}
