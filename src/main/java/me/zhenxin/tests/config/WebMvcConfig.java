package me.zhenxin.tests.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * WebMvc Config
 *
 * @author 真心
 * @since 2024/4/30 下午5:38
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        // Set Default Content Type And Ignore Accept Header
        // If enable this, the response will always be JSON
        // configurer.defaultContentType(MediaType.APPLICATION_JSON).ignoreAcceptHeader(true);
    }
}
