package com.levu.controller;

import com.levu.service.HelloWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @Autowired
    private HelloWordService service;

    @RequestMapping("/hello") // -> cái này để xác định được controller nào xử lý cho request url nào    -> tham khảo bên file pom.xml thì sẽ xác định được request url run của page này là "http://localhost:8080/hello"
    public String hello(Model model) {

        String name = service.getNameFromDb();

        // truyền giá trị vào model để -> lấy ra và sử dụng trên jsp dựa theo key "greeting"
        model.addAttribute("greeting", name);

        // trả về file jsp name
        return "hello_page";

    }
}
