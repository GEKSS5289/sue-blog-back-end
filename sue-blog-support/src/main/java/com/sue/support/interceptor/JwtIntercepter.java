package com.sue.support.interceptor;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.sue.common.constant.TokenParameter;
import com.sue.common.enums.ErrorEnums;
import com.sue.support.exception.ErrorclampException;
import com.sue.support.exception.assist.ExceptionPerformer;
import com.sue.support.exception.handle.ExceptionHandle;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author sue
 * @date 2020/11/12 21:15
 */

@Component
public class JwtIntercepter extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String token = request.getHeader("token");
        if(StringUtils.isEmpty(token)){
            ExceptionPerformer.Execute(ErrorEnums.NOT_TOKEN);
        }
        Algorithm algorithm = Algorithm.HMAC256(TokenParameter.JWT_KEY);
        JWTVerifier verifier = JWT.require(algorithm)
                .build();
        DecodedJWT jwt = verifier.verify(token);
        request.setAttribute("username",jwt.getClaim("username").asString());
        return true;

    }
}
