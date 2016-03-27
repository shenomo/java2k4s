package task007;

import java.util.Random;

/**
 * Created by user on 15.02.2016.
 */
public class BadPM implements ProjectManager {

    Random random = new Random();

    @Override
    public String getName() {
        return "I am so bad :(";
    }

    @Override
    public void manageProject(Projectable projectable) {
        projectable.getBaseCustomer().decreaseHappiness();
    }

    @Override
    public void callCustomer(Customerable customer) {
        if (random.nextBoolean()) {
            customer.increaseHappiness();
        } else {
            customer.decreaseHappiness();
        }
    }
}
