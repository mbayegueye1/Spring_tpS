package com.Digi.SpringTP1.controlleurs;

import com.Digi.SpringTP1.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/hello")
public class HelloControleur {
    @Autowired
    private HelloService helloService;


    public String direHello(){
        return helloService.salutations();
    }

}
