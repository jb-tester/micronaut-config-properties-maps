package com.mytests.micronaut.cp;


import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class MyController {

    private final BeanUsingConfProps3 beanUsingConfProps3;

    public MyController(BeanUsingConfProps3 beanUsingConfProps3) {
        this.beanUsingConfProps3 = beanUsingConfProps3;
    }

    @Get("/")
    public String showProps() {
        return beanUsingConfProps3.getProperties();
    }
}
