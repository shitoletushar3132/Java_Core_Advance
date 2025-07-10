package HashMaps;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("apple",32);
        map.put("Orange",232);


        System.out.println(map);

        if(map.containsKey("apple")){
            System.out.println(map.get("apple"));
        }else{
            System.out.println("not found");
        }

        System.out.println(map.size());

        System.out.println(map.values());

        for(String key : map.keySet()){
            System.out.println(map.get(key));
        }
    }
}
