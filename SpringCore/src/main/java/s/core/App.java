package s.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac=new ClassPathXmlApplicationContext("s/core/hello.xml");
        Student so1=(Student) ac.getBean("s1");
        System.out.println(so1);
        
        System.out.println("roll is: "+so1.getRoll());
        System.out.println("Name is: "+so1.getName());
        System.out.println("skills is: "+so1.getSkills());
        System.out.println("Term is: "+so1.getCourses());
        
        
    }

}
