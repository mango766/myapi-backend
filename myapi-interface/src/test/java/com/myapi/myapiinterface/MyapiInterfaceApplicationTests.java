package com.myapi.myapiinterface;

import com.myapi.myapiclientsdk.client.MyApiClient;
import com.myapi.myapiclientsdk.model.User;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MyapiInterfaceApplicationTests {
    @Resource
    private MyApiClient myApiClient;

    @Test
    void contextLoads() {
        String result = myApiClient.getNameByGet("nihao");
        User user = new User();

        user.setUsername("lala");
        String userNameByPost = myApiClient.getUserNameByPost(user);
        System.out.println(result);
        System.out.println(userNameByPost);

    }

}
