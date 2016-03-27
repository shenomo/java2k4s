package task008;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;

/**
 * Created by zamkovoyilya on 27/03/16.
 */
@Configuration
@ComponentScan(basePackages = {"task008"})
public class Config {

    @Bean
    JFrame jFrame(){
        return new JFrame();
    }

}
