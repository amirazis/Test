import java.io.BufferedReader;
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

public class test2 {

	public static void main(String [] args) throws IOException{
		
//		String a = "Lulu";
//		Scanner scan = new Scanner(System.in);
//		String b = scan.nextLine();
//		System.out.println(a+b);
//		scan.close();
		
//		int [] nums = {0,2,1,5,3,4};
//        int numSize = nums.length;
//        int [] newArray = new int[numSize];
//        for (int x=0; x < numSize; x++){
//        	System.out.println("x = " + x);
//
//            int num = (int)Array.get(nums, x);
//            System.out.println("num = " + num);
//            System.out.println("nums[num] = " + nums[num]);
//            newArray[x]= nums[num];
//        }
//        //Output: [0,1,2,4,5,3]
//        System.out.print(Arrays.toString(newArray));

//		int N = 24;
//        if (N < 6 && N%2!=0){
//            System.out.println("Weird");
//        } else if (N > 1 && N < 6 && N%2==0){
//            System.out.println("Not Weird");
//        } else if (N > 5 && N < 21 && N%2==0){
//            System.out.println("Weird");
//        } else if (N > 20 && N%2==0){
//            System.out.println("Not Weird");
//        } 

//		int [] nums = {1,2,1};
//		int [] newNums = Arrays.copyOf(nums, nums.length * 2);
//		for (int i=nums.length;i<newNums.length;i++) {
//			newNums[i] = nums[i-nums.length];
//		}
//		System.out.println(Arrays.toString(newNums));
		
		/* Day 4: Class vs. Instance
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			test2 p = new test2(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
		*/
		
		/* Day 5: Are you in the Loop?
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        if (n > 1 && n < 21) {
        	for (int i  = 1; i < 11; i++) {
        		System.out.println(n + " x " + i + " = " + (n*i));
        	}
        }
        bufferedReader.close();*/
    
		/* Day 6: Operators, Strings, and Loops, Oh My!
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine().trim());
        String S1 = "";
        String S2 = "";
        String [] S3 = new String[T];
        
        for (int j = 0; j < T; j++) {
            String S = bufferedReader.readLine().trim();
            
            for (int i=0; i < S.length(); i++) {
            	
            	if (i % 2 == 0) {
                    S1 = S1 + S.charAt(i);
            	} else {
                    S2 = S2 + S.charAt(i);
            	}
            }
            S3[j] = S1 + " " + S2;
            S1 = "";
            S2 = "";
        }
        for (int h = 0; h < T; h++) {
        	System.out.println(S3[h]);
        }
    	bufferedReader.close();*/
		
		/* Brute Binary Search
		int [] nums = {-1,0,3,5,9,12};
		int target = 9;
		int getIndex = 0;
        boolean gotNum = false;
        for (int i=0;i<nums.length;i++){
            if (nums[i] == target){
                gotNum = true;
                break;
            } else {
                gotNum = false;
            }
        }
        if (gotNum==true) {
            int indexOfElement = IntStream.range(0, nums.length).
                    filter(i -> target == nums[i]).
                    findFirst().orElse(-1);
            System.out.println(indexOfElement);
        }*/
		
		/* Day 7: Arrays
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        bufferedReader.close();
        //Collections.reverse(arr);
        //System.out.println(Arrays.toString(arr.toArray()));
        while (n != 0) {
        	System.out.print(arr.get(n - 1)+" ");
        	n--;
        }
        //System.out.println(arr.toString());
        //arr.forEach(System.out::print);*/
		
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
        }
        in.close();
	}

	/* Day 4: Class vs. Instance
    private int age;	
    
	public test2(int initialAge) {
  		// Add some more code to run some checks on initialAge
		if (initialAge < 0) {
			age = 0;
		} else {
			age = initialAge;
		}
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
		if (age == 0) {
	        System.out.println("Age is not valid, setting age to 0.");
	        System.out.println("You are young.");
		} else if (age < 13) {
	        System.out.println("You are young.");
		} else if (age > 12 && age < 18) {
	        System.out.println("You are a teenager.");
		} else {
	        System.out.println("You are old.");
		}
	}

	public void yearPasses() {
  		// Increment this person's age.
		age++;
	}*/

	/* Binary search
	public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right){
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }*/
}

