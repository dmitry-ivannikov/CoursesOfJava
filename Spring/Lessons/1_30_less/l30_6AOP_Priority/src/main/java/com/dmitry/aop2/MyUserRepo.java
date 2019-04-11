package com.dmitry.aop2;

import org.springframework.stereotype.Component;

@Component("myUserRepo")
public class MyUserRepo implements MyRepo {
    public void getInfo() {
        System.out.println("name Kot age 5");
    }

    public void withParams(String name) {
        System.out.println(name);
    }
}
