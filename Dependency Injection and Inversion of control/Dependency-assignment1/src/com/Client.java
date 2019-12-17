package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		ApplicationContext bean=new ClassPathXmlApplicationContext("com/beans.xml");
		Student student1=(Student)bean.getBean("student1");
		Student student2=(Student)bean.getBean("student2");
		System.out.println("from Dependency assignment1");
		System.out.println(student1);
		System.out.println(student2);
		
	
	}

}
