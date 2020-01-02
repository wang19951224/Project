package com.qf.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @RequestMapping("/mm")
    public String mm(){
        return "去你妈的";
    }
}
