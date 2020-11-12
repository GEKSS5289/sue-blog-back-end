package com.sue.api.controller;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.sue.common.constant.TokenParameter;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author sue
 * @date 2020/10/17 21:53
 */

@RestController
@RequestMapping("test")
public class TestController {


    @GetMapping("testapi")
    public String getTestApi(){

        return null;
    }

    @PostMapping("testapi")
    public String postTestApi(){
        return null;
    }


    @GetMapping("/loginWithJWT")
    public String loginWithJWT(@RequestParam String username,@RequestParam String password){
        Algorithm algorithm = Algorithm.HMAC256(TokenParameter.JWT_KEY);
        String token = JWT.create()
                .withClaim("username",username)
//                .withExpiresAt(new Date(System.currentTimeMillis()+200))
                .sign(algorithm);
        return token;
    }



//    @GetMapping("/infoWithJWT")
//    public String infoWithJWT(@RequestHeader String token){
//        Algorithm algorithm = Algorithm.HMAC256("imooc");
//        JWTVerifier verifier = JWT.require(algorithm)
//                .build();
//        DecodedJWT jwt = verifier.verify(token);
//        return jwt.getClaim("username").asString();
//    }


    @GetMapping("/address")
    public String address(@RequestAttribute String username){
        return username;
    }



}
