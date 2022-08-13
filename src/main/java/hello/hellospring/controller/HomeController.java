package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") // 이렇게 치고 들어오면
    public String home() {
        return "home"; // home.html 호출
    }
}
