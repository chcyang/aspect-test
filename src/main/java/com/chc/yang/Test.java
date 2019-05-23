package com.chc.yang;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController("")
@Controller
public class Test {

    @RequestMapping("/test")
    @ResponseBody
    public String runAspect(int id) {
        System.out.println("It wil call a aspect!" + id);
        return "Hello World 呵呵";
    }


    //    public static void main(String[] args){
    //
    //        runAspect(123);
    //    }
}
