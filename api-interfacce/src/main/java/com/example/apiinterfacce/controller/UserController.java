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


    @GetMapping("/hello")
    public String test() {
        return "hello world";
    }

    @GetMapping("/get")
    public String getNameByGet(String name) {
        return "GET 你的名字是" + name;
    }
    @PostMapping("/name")
    public String getNameByPost(@RequestParam String name){
        return "POST 你的名字是" + name;
    }
//    @PostMapping("/")
//    public String getUserNameByPost(@RequestBody User user, HttpServletRequest request) {
//        String accessKey = request.getHeader("accessKey");
//        String nonce = request.getHeader("nonce");
//        String timestamp = request.getHeader("timestamp");
//        String sign = request.getHeader("sign");
//        String body = request.getHeader("body");
//
//        if (user.getId() == null) {
//            throw new RuntimeException("用户id为空");
//        }
////        User tempUser = userService.getById(user.getId());
//        User tempUser = null;
//        //
//        if (!accessKey.equals(tempUser.getAccessKey())){
//            throw new RuntimeException("无权限");
//        }
//        // 校验随机数，模拟一下，直接判断nonce是否大于10000
//        if (Long.parseLong(nonce) > 10000) {
//            throw new RuntimeException("无权限");
//        }
//
//        // 时间和当前时间不能超过5分钟
//        if (Integer.parseInt(timestamp) - (System.currentTimeMillis() / 1000) > 300) {
//            throw new RuntimeException("已超时");
//        }
//
//        // 根据数据库去查出secretKey
//        String serverSign = SignUtils.genSign(body, tempUser.getSecretKey());
//        // 判断如果生成的签名前后不一致，则抛出异常，并提示"无权限"
//        if(!sign.equals(serverSign)) {
//            throw new RuntimeException("无权限");
//        }
//        return "POST 用户名字是" + user.getUserName();
//    }
}
