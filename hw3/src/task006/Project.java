package task006;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/**
 * Created by zamkovoyilya on 15/02/16.
 */
public class Project implements Projectable{

    BaseCustomer baseCustomer;
    Random random;
    Teamable teamList;
    ArrayList<Userable> users = new ArrayList<Userable>();


//    public Project(BaseCustomer baseCustomer, Teamable teamList, Userable user) {
//        this.baseCustomer = baseCustomer;
//        this.teamList = teamList;
//        this.users.add(user);

    task007.GoodPM pm = new task007.GoodPM();
    Team team = new Team();
    task007.User user = new task007.User();

    public Project(task007.GoodPM pm, Team team, task007.User user) {
        this.pm = pm;
        this.team = team;
        this.user = user;
    }

//    }

    public Customerable getBaseCustomer() {
        return baseCustomer;
    }

    @Override
    public boolean fail() {
        if(random.nextBoolean()){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public void setTeam(Teamable team) {
        teamList = team;
    }

    @Override
    public Teamable getTeam() {
        return teamList;
    }

    @Override
    public boolean success() {
        if(random.nextBoolean()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Collection<Userable> getUsers() {
        return users;
    }
}
