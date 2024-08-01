package org.example.springweb.controller;

import org.apache.catalina.User;
import org.example.springweb.request.UserForm;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestUserController {

    // @RestController - @RequestBody가 모든 요청 핸들러에 디폴트로 적용된 상태 -> 요청 핸들러가 반환하는 값 자체가 응답으로 감

    @GetMapping
    public UserForm x(){
        return new UserForm();
    }

    @PostMapping("/user1")
    public String register1(UserForm userForm){
        System.out.println(userForm);
        return "success";
    }

    @PostMapping("/user2")
    public String register2(@RequestBody UserForm userForm){
        System.out.println(userForm);
        return "success";
    }
}
