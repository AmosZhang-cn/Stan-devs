package com.ltmmb.stan.Swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;



//@Configuration
public class SwaggerConfiguration{

    //@Bean
    public Docket createAPI(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        return docket;
    }
}
