package App;

import ardhastudio.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

//        // contoh menggunakan anonymous Class
//        SimpleAction simpleAction = new SimpleAction() {
//            @Override
//            public String action(String name) {
//                return "Yohan";
//            }
//        };
//
//        System.out.println(simpleAction.action("Yohan"));
//
//        // contoh menggunakan lambda function
//        SimpleAction simpleAction1 = (String name) -> { return "Yohan"; };
//        System.out.println(simpleAction1.action("Yohan"));

        SimpleAction simpleAction1 = (String name) -> {
          return  "Hello " + name;
        };

        SimpleAction simpleAction2 = (name) -> {
            return  "Hello " + name;
        };

        SimpleAction simpleAction3 = (String name)-> "Hello " + name;
        SimpleAction simpleAction4 = (name)-> "Hello " + name;
        SimpleAction simpleAction5 = name-> "Hello " + name;
    }
}
