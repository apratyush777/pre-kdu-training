import java.util.*;

public class secondJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrlist = new ArrayList<String>(10);

        HashSet<String> set = new HashSet<String>(10);

        HashMap<String, Integer> hash_map = new HashMap<String, Integer>(10);

        System.out.println("Enter 10 Strings");
        for (int i = 0; i < 10; i++) {
            String s = sc.next();
            arrlist.add(s);
            set.add(s);
            Integer integer = hash_map.get(s);
            if (integer == null) {
                hash_map.put(s, 1);
            } else {
                hash_map.put(s, integer + 1);
            }

        }
        System.out.println("The HashMap contains ");
        for (Map.Entry m : hash_map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("The list contains");
        for (int i = 0; i < 10; i++) {
            System.out.println(arrlist.get(i));
        }
        System.out.println("The Set contains");
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        

    }
}
