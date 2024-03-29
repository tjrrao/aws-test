package com.techprimers.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello Raja Rao TJ, this is a aws Elastic Beanstalk CICD using with SpringBoot";
    }
    
    @GetMapping("/hai")
    public String hai() {
        return "Hai getting images from S3 Url";
    }
}
