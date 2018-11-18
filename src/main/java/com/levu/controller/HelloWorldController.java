package com.levu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/hello") // -> cái này để xác định được controller nào xử lý cho request url nào    -> tham khảo bên file pom.xml thì sẽ xác định được request url run của page này là "http://localhost:8080/hello"
    public String hello(Model model) {

        // truyền giá trị vào model để -> lấy ra và sử dụng trên jsp dựa theo key "greeting"
        model.addAttribute("greeting", "Hello Spring MVC -> Mr.Vu example");

        // trả về file jsp name
        return "hello_page";

    }
}
