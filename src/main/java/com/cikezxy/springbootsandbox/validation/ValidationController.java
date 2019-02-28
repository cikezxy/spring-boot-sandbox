package com.cikezxy.springbootsandbox.validation;

import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ValidationController
//    方式1：继承ResponseEntityExceptionHandler并覆盖handleMethodArgumentNotValid方法
//    extends ResponseEntityExceptionHandler
{

    @PostMapping("/validate")
    public String validate(@Valid @RequestBody Person person) {
        return person.toString();
    }

//    @Override
//    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
//        return new ResponseEntity<>(ex.getBindingResult()
//                .getAllErrors().stream()
//                .map(ObjectError::getDefaultMessage)
//                .collect(Collectors.toList()), HttpStatus.OK);
//    }

    // 方式2：使用ExceptionHandler注解
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public List<String> validate(MethodArgumentNotValidException ex) {
        return ex.getBindingResult()
                .getAllErrors().stream()
                .map(ObjectError::getDefaultMessage)
                .collect(Collectors.toList());
    }
}