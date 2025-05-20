package cat.itacademy.s04.t01.n01.S04T01N01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class HelloWorld {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class, args);
    }

    @GetMapping("/HelloWorld")
    public String helloWorld(@RequestParam(value = "name", defaultValue = "UNKNOWN") String name) {
        return String.format("Hi World and hi %s. You are executing a Maven Project.", name);
    }

    @GetMapping(value = {"/HelloWorld2", "HelloWorld2/{name}"})
    @ResponseBody
    public String helloWorld2(@PathVariable(required = false) String name) {
        if (name != null) {
            return String.format("Hi World and hi %s. You are executing a Maven Project.", name);
        } else {
            return "Name missing";
        }
    }
}


