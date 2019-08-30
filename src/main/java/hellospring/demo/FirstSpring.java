package hellospring.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstSpring {
    @GetMapping(path = "/ss")
    public String hello() {
        System.out.println("++++++++");
        return "hello spring world  gv";
    }
}
