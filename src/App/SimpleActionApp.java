package App;

import ardhastudio.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

        // contoh menggunakan anonymous Class
        SimpleAction simpleAction = new SimpleAction() {
            @Override
            public String action() {
                return "Yohan";
            }
        };

        System.out.println(simpleAction.action());

        // contoh menggunakan lambda function
        SimpleAction simpleAction1 = () -> { return "Yohan"; };
        System.out.println(simpleAction1.action());
    }
}
