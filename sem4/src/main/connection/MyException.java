package main.connection;

import org.springframework.http.HttpStatus;

/**
 * Created by zamkovoyilya on 27/05/16.
 */
public class MyException extends RuntimeException {
    private HttpStatus statusCode;

    public MyException(HttpStatus status) {
        statusCode = status;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(HttpStatus statusCode) {
        this.statusCode = statusCode;
    }
}
