package ss9_set_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapStudy {
    public static void main(String[] args) {
        Map<Integer, String> stringMap = new HashMap<>();

        stringMap.put(1, "Nguyễn Văn A");
        stringMap.put(2, "Nguyễn Văn B");

//        System.out.println(stringMap.get(2));
//        for(Map.Entry<Integer, String> entry : stringMap.entrySet()) {
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        }
        Set<Integer> integerSet = stringMap.keySet(); //Trả về tất cả key ở trong map
        for (Integer key : integerSet) {
            System.out.println(key + " - " + stringMap.get(key));
        }
    }
}
