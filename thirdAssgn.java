import java.io.*;
import java.util.*;

public class thirdAssgn {
    public static void main(String[] args) throws IOException {
        String file = "D:\\tempp.csv";
        BufferedReader reader = null;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        ArrayList<String> al = new ArrayList<String>();
        String line = "";
        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                for (String index : row) {
                    al.add(index);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
        for (int k = 0; k < al.size(); k++) {
            if (map.containsKey(al.get(k))) {
                map.put(al.get(k), map.get(al.get(k)) + 1);
            } else {
                map.put(al.get(k), 1);
            }
        }
        
        int i, first, second, third;
        third = second = first = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            int curr = m.getValue();
            if (curr > first) {
                third = second;
                second = first;
                first = curr;
            } else if (curr > second) {
                third = second;
                second = curr;
            }

            else if (curr > third)
                third = curr;
        }
        
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            if (m.getValue() == first) {
                System.out.println(m.getKey());
            }
            else if (m.getValue()==second){
                System.out.println(m.getKey());
            }
            else if (m.getValue()==third){
                System.out.println(m.getKey());
            }
            
            
        }

    }
}
