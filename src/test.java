import java.util.Scanner;
import java.util.Scanner;

public class test {

	public static void main(String [] args) {
		int h = 30;
		int k = 40;
		System.out.println("Before h = " + h + ", k = " + k);
		k = k + h; //70
		h = k - h; //40
		k = k - h; //30
		System.out.println("After h = " + h + ", k = " + k);
	}
}
