package programmer.zaman.now.aplication;

import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.ValidationExceptionNew;
import programmer.zaman.now.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("","123");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("data Valid");
        }catch (ValidationExceptionNew exception){
            System.out.println("Data Tidak Valid : " + exception.getMessage()) ;
        }catch (NullPointerException exception){
            System.out.println("Data Tidak Valid : " + exception.getMessage()) ;
        } finally {
            System.out.println("error atau tidak selalu dieksekusi");
        }

        LoginRequest loginRequest1 = new LoginRequest(null,null);
        ValidationUtil.validateRuntime(loginRequest1);
        System.out.println("Sukses");
//        untuk menggunakan error runtime menggunakan error handler
    }
}
