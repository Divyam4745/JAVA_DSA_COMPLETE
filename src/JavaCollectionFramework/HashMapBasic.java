package JavaCollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapBasic {
    static void main() {
        Map<String,String> mapping=new HashMap<>();
        //Insertion in Map
        mapping.put("In","India");
        mapping.put("Br","Brazil");
        mapping.put("Aus","Austrilia");
        System.out.println(mapping);

        Map<String,String> table=new HashMap<>();
        table.put("Can","Canada");

        System.out.println("Before : " + table);

        table.putAll(mapping);
        System.out.println("After: "+ table );

        //Delection
//        table.remove("In");
//        System.out.println(table);

        System.out.println(table.size());
//        table.clear();
//        System.out.println(table);

        System.out.println(table.get("Can"));
        System.out.println(table.containsKey("Im "));
        System.out.println(table.getOrDefault("Cr","None"));

        System.out.println(table);

        table.replace("In","Indonesia");
        System.out.println("After replace :"+ table);

         Set<String> Keysets=table.keySet();
        System.out.println(Keysets);

    }
}
