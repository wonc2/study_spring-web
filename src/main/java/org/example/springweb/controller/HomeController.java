package org.example.springweb.controller;

import org.example.springweb.request.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*  @Controller
    - spring mvc에서 컨트롤러 역할을 수행하는 클래스임을 나타내는 어노테이션이다.
    - '@Controller' 어노테이션이 부착된 클래스는 애플리케이션 시작시 ->
                  자동으로 스캔되고 -> 객체로 생성되어 -> 스프링 컨테이너에서 관리한다. + 필요한 경우 객체가 자동 주입된다.
*/
@Controller
public class HomeController {

    /*
         @GetMapping("/")
         - HandlerMapping이 이 어노테이션의 설정정보를 분석해서
            "/" 요청 URI가 접수되었을 때 이 요청핸들러 메소드를 실행해야 됨을 알아낸다.
    */

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("message", "언녕하쇼");

        // "thymeleaf 템플릿 이름을 반환한다."
        return "home";
    }

    @GetMapping("/home")
    @ResponseBody
    public UserForm about(){
        return new UserForm();
    }
}
