package lk.rent.spring.advisor;

import lk.rent.spring.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@CrossOrigin
@RestControllerAdvice
public class AppWideExceptionHandler {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({Exception.class})
    public ResponseUtil exceptionHandler(Exception exception) {
        return new ResponseUtil(500, exception.getMessage(), null);
    }

}
