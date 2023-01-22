package App;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {

        // contoh ini menggunakan anonymous class
//        Consumer<String> consumer = new Consumer<String>() {
//            @Override
//            public void accept(String value) {
//                System.out.println(value);
//            }
//        };
//
//        consumer.accept("Yohan Apriyandi");

        // menggunakan lambda
        Consumer<String> consumer = value -> System.out.println(value);

        consumer.accept("Yohan Apriyandi");


    }
}
