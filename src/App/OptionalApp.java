package App;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("zarnui");
        String name = null;
        sayHello(name);
    }

    public static void sayHello(String name){
        // Optional class adalah class yang mambantu untuk menangani NullPointerException di java
        // menggunakan lambda function

        // menggunakan lambda dan method reference
        Optional.ofNullable(name)
                .map(String::toUpperCase)
                .ifPresentOrElse(
                        value -> System.out.println("HELLO " + value),
                        () -> System.out.println("HELLO")
                );

        // menggunakan optional class secara manual
//        Optional<String> optionalName = Optional.ofNullable(name);
//        Optional<String> optionalNameUpper = optionalName.map(value -> name.toUpperCase());
//        optionalNameUpper.ifPresent(value -> System.out.println("Hello " + value));
    }
}
