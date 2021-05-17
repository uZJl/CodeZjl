package exception;

/**
 * Created by JiaLe on 2021/5/16 14:36
 */
//编译时异常
public class AppException extends RuntimeException{
    public AppException(String message) {
        super(message);
    }

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }
}
