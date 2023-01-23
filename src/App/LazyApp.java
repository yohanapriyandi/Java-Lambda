package App;

import java.util.function.Supplier;

public class LazyApp {
    public static void main(String[] args) {
        testScore(72, ()-> getName());
    }

//    public static void testScore(int score, String name){
//        if (score > 80){
//            System.out.println("Selamat " + name + ", Anda lulus");
//        }else {
//            System.out.println("Coba lagi tahun depan");
//        }
//
//    }
    // menggunakan lazy parameter
    public static void testScore(int score, Supplier<String> name){
        if (score > 80){
            System.out.println("Selamat " + name.get() + ", Anda lulus");
        }else {
            System.out.println("Coba lagi tahun depan");
        }

    }

    public static String getName(){
        System.out.println("Method get dipanggil");
        return "Fathar";
    }
}
