import org.example.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

public class BeanFactoryTest {

	@Test
	public void beanFactoryTest() {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("application.xml"));
		Person person = beanFactory.getBean("person", Person.class);
		System.out.println(person);
	}

	@Test
	public void applicationContextTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println(person);
	}

	@Test
	public void resourceTest() throws IOException {
		Resource resource = new ClassPathResource("application.xml");
		InputStream inputStream = resource.getInputStream();
	}
	
	@Test
	public void carTest() {
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("application.xml"));
		Object bean = beanFactory.getBean("car");
		System.out.println(bean);
	}

}
