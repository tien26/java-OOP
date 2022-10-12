package programmer.zaman.now.aplication;

public class StackTraceApp {
    public static void main(String[] args) {
        try {
            String[] names = {
                    "Aku","saya","dia"
            };
            System.out.println(names[200]);
        }catch (Throwable throwable){
            StackTraceElement[] stackTraceElements = throwable.getStackTrace();

            throwable.printStackTrace();
        }
    }
}
