package App;

import util.StringUtil;

import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {
        // anonymous class style
//        Predicate<String> predicateToLowercase = new Predicate<String>() {
//            @Override
//            public boolean test(String value) {
//                return StringUtil.isLowerCase(value);
//            }
//        };
        // Lambda style
        // Predicate<String> predicateToLowercase = value -> StringUtil.isLowerCase(value);

        // Lamda using method reference
        Predicate<String> predicateToLowercase = StringUtil::isLowerCase;

        System.out.println(predicateToLowercase.test("Eko"));
        System.out.println(predicateToLowercase.test("eko"));
        System.out.println(predicateToLowercase.test("EKO"));
        System.out.println(predicateToLowercase.test("EKo"));

    }
}
