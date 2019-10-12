package org.hswebframework.web.authorization.basic.aop;

import org.hswebframework.web.authorization.basic.configuration.EnableAopAuthorize;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAopAuthorize
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class,args);
    }

}
