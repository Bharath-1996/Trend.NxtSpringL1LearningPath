package com.Assignment2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;




@Configuration
public class MovieConfig {

	@Bean
 public MovieBean movieBean(){
	      return new MovieBean();
	   }

}
