package com.mwt.oes;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.MultipartConfigElement;

@SpringBootApplication
@Configuration
@MapperScan("com.mwt.oes.dao")//与dao层的@Mapper二选一写上即可(主要作用是扫包)
public class OesApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(OesApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(OesApplication.class, args);
	}

	/**
	 * 文件上传配置
	 * @return
	 */
	@Bean
	public MultipartConfigElement multipartConfigElement() {
		MultipartConfigFactory factory = new MultipartConfigFactory();
		//单个文件最大10MB
		factory.setMaxFileSize("10240KB"); //KB,MB
		/// 设置总上传数据总大小100MB
		factory.setMaxRequestSize("102400KB");
		return factory.createMultipartConfig();
	}

}
