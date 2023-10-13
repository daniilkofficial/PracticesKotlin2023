package LP2_03_NullableTypes;

public class Main {
    private static String name = null;

    public static void main(String[] args) {
//        System.out.println(name.length()); // будет выдано NullPointerException

        // символ ? в Котлин эквивалентно
        if(name != null){
            System.out.println(name.length());
        }
        else{
            System.out.println("null");
        }
    }
}
