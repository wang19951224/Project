package com.qf.redis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import java.util.Random;

@RestController
public class redisController {
    public String createVerificationCode(){

        String code = "";

        for (int i = 0; i<4; i++){

            int num = new Random().nextInt(10);

            code += num;
        }

        System.out.println(code);
        return code;
    }
    @RequestMapping(value = "/sendVerificationCode")
    public String sendVerificationCode(String phone){
        String VerificationCode = createVerificationCode();
        Jedis jedis = new Jedis("47.105.132.213", 6379);
        jedis.setex("VerificationCode",30,VerificationCode);
        return "success";
    }
    @RequestMapping("/verificationCode")
    public String verificationCode(String verification_code){
        Jedis jedis = new Jedis("47.105.132.213", 6379);
        String verificationCode = jedis.get("VerificationCode");
        //验证
        if(verificationCode.equals(verification_code)){
            return "success";
        }else{
            return "error";
        }

    }

}
