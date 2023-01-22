package App;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        // Anonymous style
//        Predicate<String> predicate = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.isBlank();
//            }
//        };

        // lambda style
        Predicate<String> predicate = value -> value.isBlank();
        System.out.println(predicate.test(""));
        System.out.println(predicate.test("Yohan"));
    }
}
