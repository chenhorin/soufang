package top.hrfeat.souh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SouHApplication {

    public static void main(String[] args) {
        SpringApplication.run(SouHApplication.class, args);
    }

    @GetMapping("/hello")
//    @RequestMapping(value = "",produces = "")
    public String hello() {
        return "Hello, horin";
    }
}
