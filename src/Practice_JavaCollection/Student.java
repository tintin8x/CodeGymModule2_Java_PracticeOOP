package Practice_JavaCollection;
import java.util.*;

public class TesCollection {
    public static void main(String[] args){
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        System.out.println(hashMap.keySet() + "\n");

        Map<String, Integer> map = new HashMap<>();
        map.put("hehe", 1);
        System.out.println(map + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);

    }
}
