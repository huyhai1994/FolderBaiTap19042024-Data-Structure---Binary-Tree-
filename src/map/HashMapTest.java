package map;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<String, Integer> customers = new HashMap<>();
        customers.put("hai",30);
        customers.put("hanh",40);
        customers.put("huong",20);
        customers.put("huyen",80);
        customers.put("haii",100);
        Set<String> keys = customers.keySet();
        for(String key : keys) {
            System.out.println("key: " + key + " : " + customers.get(key));
        }
    }
}
