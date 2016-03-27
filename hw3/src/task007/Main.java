package task007;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import task006.*;

/**
 * Created by user on 28.01.2016.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac =
                new AnnotationConfigApplicationContext(Config.class);

        task007.Project project = (Project) ac.getBean("project");


    }
}
