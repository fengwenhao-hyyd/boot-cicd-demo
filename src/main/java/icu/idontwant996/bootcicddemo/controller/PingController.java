package icu.idontwant996.bootcicddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @GetMapping("/ping/{param}")
    public String ping(@PathVariable String param) {
        System.out.println("this is new feature!");
        return "Response is: (" + param + ")";
    }

}
