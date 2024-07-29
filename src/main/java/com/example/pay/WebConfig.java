package com.example.pay;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan
public class WebConfig implements WebMvcConfigurer {
//    @Bean
//    public ClassLoaderTemplateResolver yourTemplateResolver() {
//        ClassLoaderTemplateResolver configurer = new ClassLoaderTemplateResolver();
//        configurer.setPrefix("templates/");
//        configurer.setSuffix(".html");
//        configurer.setTemplateMode(TemplateMode.HTML);
//        configurer.setCharacterEncoding("UTF-8");
//        configurer.setOrder(0);  // this is important. This way spring //boot will listen to both places 0 and 1
//        configurer.setCacheable(false);
//        configurer.setCheckExistence(true);
//        return configurer;
//    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:3000")
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        .allowedHeaders("*")
                        .allowCredentials(true);
            }
        };
    }
}