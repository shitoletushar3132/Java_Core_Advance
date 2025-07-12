package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("name","tushar");
        map.put("roll","128");
        map.put("state","maharastra");
        map.putIfAbsent("state","pune");


        Set<String> keys = map.keySet();
        System.out.println(keys);

        System.out.println(map);

        map.remove("roll");
        System.out.println(map);
        System.out.println(map.containsKey("state"));
        System.out.println(map.containsValue("128"));

        System.out.println(map.get("state"));


    }
}
