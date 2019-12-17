import java.io.File;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;



public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Resource n=new FileSystemResource(new File("src/Beans.xml"));
		 @SuppressWarnings("deprecation")
		BeanFactory bean=new XmlBeanFactory(n);

		Hello s=(Hello)bean.getBean("hello");
		 System.out.println( s.getName());     
		
	}

}
