package App;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("first_name", "Fathar");
        map.put("second_name", "Dhabit");
        map.put("third_name", "Adz-dzaky");

        // map menggunakan for loop biasa
        for (var entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // map menggunakan anonymous class
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " : " + value);
            }
        });
        // map menggunakan lambda
        map.forEach((key, value) -> System.out.println(key + " : " + value));

    }
}
