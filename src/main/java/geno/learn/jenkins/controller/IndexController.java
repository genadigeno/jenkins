package geno.learn.jenkins.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<?> index(){
        System.out.println("Ok");
        return ResponseEntity.ok("Let's Go!");
    }
}
