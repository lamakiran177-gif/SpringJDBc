package a.b;  

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext c=new ClassPathXmlApplicationContext("a/b/hello.xml");
       Student s=c.getBean("s1", Student.class);
        System.out.println(s);
        
    }
}
