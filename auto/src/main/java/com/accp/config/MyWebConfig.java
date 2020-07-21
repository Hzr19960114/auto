package com.accp.config;

import java.nio.charset.StandardCharsets;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 
 * WebMvcConfigurationSupport等价于以前的spring-mvc.xml
 * WebMvcConfigurationSupport:当如果没有自定web配置时， 使用此类初始springmvc配置
 * 
 * 
 * @Configuration:标注此类为配置，覆盖此类继承的类的配置
 * 	 addResourceHandlers:添加静态资源
 * 	 configureMessageConverters:配置消息转换器的
 * @author admin
 *
 */
@Configuration
public class MyWebConfig extends WebMvcConfigurationSupport {

	/*@Autowired
	MyInterceptor interceptor;*/

	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**")
		.addResourceLocations("classpath:/static/")
		.addResourceLocations("file:d://images/")
		;
	}
	//自动数据格式转换
	@Override
	protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(new StringHttpMessageConverter(StandardCharsets.UTF_8));
		converters.add(new MappingJackson2HttpMessageConverter());//复杂数据序列化
		converters.add(new ByteArrayHttpMessageConverter());//文件字节序列化
		
		super.configureMessageConverters(converters);
	}
	//跨域
	@Override
	protected void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedHeaders("*").allowedMethods("*").allowedOrigins("*").allowCredentials(true);
		super.addCorsMappings(registry);
	}
//拦截器
/*	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interceptor).excludePathPatterns("/user/**");
		super.addInterceptors(registry);
	}*/
}
