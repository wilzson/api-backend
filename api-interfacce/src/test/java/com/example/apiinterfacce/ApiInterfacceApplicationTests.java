//package com.example.apiinterfacce;
//
//import com.example.apiclientsdk.client.ApiClient;
//import com.example.apiclientsdk.model.User;
//import jakarta.annotation.Resource;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//class ApiInterfacceApplicationTests {
//
//    // 注入一个名为apiclient的bean
//    @Resource
//    private ApiClient apiClient;
//
//    // 表示这是一个测试方法
//    @Test
//    void contextLoads() {
//        // 调用ApiClient的getNameByGet方法，并传入参数"yupi"，将返回的结果赋值给result变量
////        String result = apiClient.getNameByGet("yupi");
//        // 创建一个User对象
//        User user = new User();
//        // 设置User对象的username属性为"liyupi"
//        user.setName("liyupi");
//        // 调用ApiClient的getUserNameByPost方法，并传入user对象作为参数，将返回的结果赋值给usernameByPost变量
//        String usernameByPost = apiClient.getNameByPost(user);
//        // 打印result变量的值
////        System.out.println(result);
//        // 打印usernameByPost变量的值
//        System.out.println(usernameByPost);
//
//        // 调用Api
//    }
//}
