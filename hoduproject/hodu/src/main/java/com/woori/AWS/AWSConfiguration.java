package com.woori.AWS;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

@Configuration
@EnableWebMvc
public class AWSConfiguration implements WebMvcConfigurer {


	
	@Bean
	public AmazonS3 AwsS3Client() {
		AmazonS3 s3Builder = AmazonS3ClientBuilder.standard()
							.withRegion(Regions.AP_NORTHEAST_2)
							.build();
		return s3Builder;
	}
}
