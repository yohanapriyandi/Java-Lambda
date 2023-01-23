package App;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {
        List<String> list = List.of("Fathar", "Dhabit", "Adz-dzaky");

        // perulangan for
        for (var value : list){
            System.out.println(value);
        }

        // dengan menggunakan anonymous class
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });

        // menggunakan lambda
        list.forEach(value -> System.out.println(value));

        // menggunakan method reference lambda
        list.forEach(System.out::println);
    }
}
