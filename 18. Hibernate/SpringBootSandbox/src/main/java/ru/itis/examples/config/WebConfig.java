package ru.itis.examples.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/assets/js/");
        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/assets/css/");
        registry.addResourceHandler("/fonts/**").addResourceLocations("classpath:/assets/fonts/");
    }
}
