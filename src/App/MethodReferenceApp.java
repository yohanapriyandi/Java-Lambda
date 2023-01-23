package App;

import util.StringUtil;

import java.util.function.Function;
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

        // Lamda using static method reference
        Predicate<String> predicateToLowercase = StringUtil::isLowerCase;

        System.out.println(predicateToLowercase.test("Eko"));
        System.out.println(predicateToLowercase.test("eko"));
        System.out.println(predicateToLowercase.test("EKO"));
        System.out.println(predicateToLowercase.test("EKo"));

        //Method reference di parameter
        Function<String, String> functionUpper = String::toUpperCase;
        System.out.println(functionUpper.apply("Yohan"));

    }

    public void run(){
        /**
         * Lamda using non  static method reference
         * apabila ingin mengakses object dari luar maka dekalarasikan objeknya
         * kemudian panggil nama objeknya
         */

        // MethodReferenceApp app = new MethodReferenceApp();

        Predicate<String> predicateToLowerCase = this::isLowerCase;
        System.out.println(predicateToLowerCase.test("Eko"));
        System.out.println(predicateToLowerCase.test("eko"));
    }

    public  boolean isLowerCase(String value){
        for (var c : value.toCharArray()){
            if (!Character.isLowerCase(c)){
                return false;
            }
        }
        return true;
    }
}
