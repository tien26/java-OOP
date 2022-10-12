package programmer.zaman.now.util;

import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.BlankException;
import programmer.zaman.now.error.ValidationExceptionNew;

public class ValidationUtil{
    public static void validate(LoginRequest loginRequest) throws ValidationExceptionNew , NullPointerException{
        if (loginRequest.username() ==null){
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()){
            throw new ValidationExceptionNew("Username is Blank");
        } else if (loginRequest.password() ==null){
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()){
            throw new ValidationExceptionNew("Password is null");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() ==null){
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()){
            throw new BlankException("Username is Blank");
        } else if (loginRequest.password() ==null){
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()){
            throw new BlankException("Password is null");
        }
    }
}
