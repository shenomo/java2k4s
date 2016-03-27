package task007;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import task006.*;
import task006.BadCustomer;
import task006.Project;
import task006.Team;

/**
 * Created by zamkovoyilya on 19/03/16.
 */
@Configuration
@ComponentScan(basePackages = {"task007"})
public class Config {

    @Autowired
    task007.GoodPM pm = new GoodPM();

    @Autowired
    Team team = new Team();

    @Autowired
    User user = new User();

    @Bean
    Project project(){
        return new Project(pm, team, user);
    }

}
