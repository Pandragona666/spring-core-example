package pl.sdacademy.spring.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

public class HelloWorldService implements DisposableBean, InitializingBean { //this is not recommended...

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String sayHello() {
        return "Hello! " + name;
    }

    public void destroy() throws Exception {
        System.out.println("Sorry " + name + ", destroing your bean ;(");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Good news " + name + ", just created your bean!");
    }
}