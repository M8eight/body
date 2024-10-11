package com.videohub.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class PathRedirect implements WebMvcConfigurer {
    @Value("${files.video-directory}")
    private String externalFilePath;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/media/**")
                .addResourceLocations("file:///" + externalFilePath + "/media/");
        registry
                .addResourceHandler("/avatars/**")
                .addResourceLocations("file:///" + externalFilePath + "/avatars/");
        registry
                .addResourceHandler("/pictures/**")
                .addResourceLocations("file:///" + externalFilePath + "/pictures/");
        registry
                .addResourceHandler("/previews/**")
                .addResourceLocations("file:///" + externalFilePath + "/previews/");
        registry
                .addResourceHandler("/static/**")
                .addResourceLocations("classpath:static/");
    }
}
