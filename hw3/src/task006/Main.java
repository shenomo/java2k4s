package task006;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by user on 28.01.2016.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");

        Project project = (Project) ac.getBean("IOSproject");


    }
}
