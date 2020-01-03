package com.first;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Configuration
@ComponentScan({"com.first"})

public class JlcConfig {

	@Bean
	public InternalResourceViewResolver vr() {
	 InternalResourceViewResolver vr=new InternalResourceViewResolver();
	 vr.setViewClass(JstlView.class);
	 vr.setPrefix("/");
	 vr.setSuffix(".jsp");
	return vr;
	 }
	
	@Bean
	public MessageSource ms() {
		ReloadableResourceBundleMessageSource ms=new ReloadableResourceBundleMessageSource();
		ms.setBasename("messages");
		ms.setDefaultEncoding("UTF-8");
		return ms;
		
	}
	
}
