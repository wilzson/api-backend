package com.example.apiinterfacce.controller;

import com.example.apiclientsdk.model.User;
import com.example.apiclientsdk.utils.SignUtils;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

/**
 * 名字api
 */
@RestController
@RequestMapping("name")
public class UserController {

    @GetMapping("/")
    public String getNameByGet(String name) {
        return "GET 你的名字是" + name;
    }
    @PostMapping("/name")
    public String getNameByPost(@RequestParam String name){
        return "POST 你的名字是" + name;
    }
    @PostMapping("/")
    public String getUserNameByPost(@RequestBody User user, HttpServletRequest request) {
        String accessKey = request.getHeader("accessKey");
        String nonce = request.getHeader("nonce");
        String timestamp = request.getHeader("timestamp");
        String sign = request.getHeader("sign");
        String body = request.getHeader("body");

        // todo 实际情况应该是去数据库中查是否已分配给用户
        if (!accessKey.equals("fengzefeng")){
            throw new RuntimeException("无权限");
        }
        // 校验随机数，模拟一下，直接判断nonce是否大于10000
        if (Long.parseLong(nonce) > 10000) {
            throw new RuntimeException("无权限");
        }

        // todo 时间和当前时间不能超过5分钟
//        if (timestamp) {}

        // TODO 根据数据库去查出secretKey
        String serverSign = SignUtils.genSign(body, "scnussp");
        // 判断如果生成的签名前后不一致，则抛出异常，并提示"无权限"
        if(!sign.equals(serverSign)) {
            throw new RuntimeException("无权限");
        }
        return "POST 用户名字是" + user.getName();
    }
}
