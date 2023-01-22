package App;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {
        // ANonymous class style
//        Supplier<String> supplier = new Supplier<String>() {
//            @Override
//            public String get() {
//                return "Yohan Apriyandi";
//            }
//        };

        // lambda style
        Supplier<String> supplier = () -> "Yohan Apriyandi";

        System.out.println(supplier.get());
    }
}
