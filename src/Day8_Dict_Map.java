import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8_Dict_Map {

	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map <String,Integer> mapName = new HashMap<String,Integer>();
        ArrayList<String> nameArray = new ArrayList<String>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            mapName.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            nameArray.add(s);
        } 
        for (String nameArr : nameArray) {
          if (mapName.get(nameArr) == null) {
              System.out.println("Not found");
          } else {
              System.out.println(nameArr+"="+mapName.get(nameArr));
          }
        }
        in.close();
	}

}
