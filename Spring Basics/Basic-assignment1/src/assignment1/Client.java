package assignment1	;



import java.io.File;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Resource n=new FileSystemResource(new File("src/assignment1/Beanconfig.xml"));
BeanFactory bean=new XmlBeanFactory(n);

Movie s=(Movie)bean.getBean("movieid");
      	
	System.out.println("Movie Id  :"+s.getMovieId());
	System.out.println("Movie Name:"+s.getMovieName());
    System.out.println("Actor Name:"+s.getMovieActor());
    
       
    		   
       
	}

}
