package main;

//import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;


//import sun.misc.Resource;


public class SmsStarter {

    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        //Resource resource = new FileSystemResource(".//src//resources//spring.xml");
        //BeanFactory factory = new XmlBeanFactory(resource);
        
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
        context.start();
        
        //load the bean from spring
	sms.listAllStudents();
	sms.registerStudent((Student) context.getBean("student1"));
     
	sms.listAllStudents();
    }
}