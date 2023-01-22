package App;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {
//        Function<String, Integer> function = new Function<String, Integer>() {
//            @Override
//            public Integer apply(String value) {
//                return value.length();
//            }
//        };
//
//        System.out.println(function.apply("Yohan Aoriyandi"));

        // lambda style
        Function<String, Integer> function = value -> value.length();

        System.out.println(function.apply("Yohan Aoriyandi"));
    }
}
