package com.example.cumulusspringboot;

import com.example.cumulusspringboot.config.TwilioConfig;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@ComponentScan({"com.example.cumulusspringboot.controllers", "com.example.cumulusspringboot.config"})

@SpringBootApplication
@EnableConfigurationProperties(TwilioConfig.class)
@EnableScheduling
public class CumulusSpringBootApplication {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }


    public static void main(String[] args) {
        SpringApplication.run(CumulusSpringBootApplication.class, args);
        System.out.println("testiiiiiiiiiiiinnnnnng");
    }

}
