package com.Assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class MovieDemo {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MovieConfig.class);
		MovieBean movieBean = ctx.getBean(MovieBean.class);
		System.out.println("Basic assignment2");
		movieBean.setMovieId("MV123");
		movieBean.setMovieName("Bahubali");
		movieBean.setMovieActor("Prabhas");
		movieBean.getMovieActor();
	System.out.println("Movie Id:"+movieBean.getMovieId());
	System.out.println("Movie Name:"+movieBean.getMovieName());
	System.out.println("Actor Name:"+movieBean.getMovieActor());
	
	}

}
