package task007;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/**
 * Created by zamkovoyilya on 15/02/16.
 */
public abstract class BaseCustomer implements Customerable {

    Random random;
    int happiness;
    ArrayList<Projectable> projectables;


    @Override
    public int getHappiness() {
        return happiness;
    }

    @Override
    public String getName() {
        return "i am super customer";
    }

    public Collection<Projectable> getProjectables() {
        return projectables;
    }




}
