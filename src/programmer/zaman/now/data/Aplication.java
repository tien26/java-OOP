package programmer.zaman.now.data;

public class Aplication {
    public  static final int PROCESSORS;

    static {
        System.out.println("Mengakses Aplication static");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
