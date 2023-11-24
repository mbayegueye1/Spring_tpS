package controlleurs;

import HelloService.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/hello")
public class HelloControleur {
    private HelloService helloService;
    @Autowired
    public HelloControleur(HelloService helloService) {
        this.helloService = helloService;
    }
    @GetMapping("/direHello")
    public String direHello(){
        return helloService.salutations();
    }

}
