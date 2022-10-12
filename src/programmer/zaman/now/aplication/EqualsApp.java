package programmer.zaman.now.aplication;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Irfan";
        first = first + " " + "Martien";

        System.out.println(first);

        String second = "Irfan Martien";
        System.out.println(second);

        System.out.println(first == second);
        // == objectnya sama atau tidak dimemory
        System.out.println(first.equals(second));
    }
}
