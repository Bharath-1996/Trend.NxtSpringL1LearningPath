package com;

import java.io.File;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		
ApplicationContext factory=new ClassPathXmlApplicationContext("com/beans.xml");  
  Country country1=(Country)factory.getBean("country1");
  Country country2=(Country)factory.getBean("country2");
  System.out.println("from Dependency assignment2");
  System.out.println(country1);
  System.out.println(country2);
  

	}

}
