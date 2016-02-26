package hw1;

/**
 * Created by user on 15.02.2016.
 */
public class GoodPM implements ProjectManager {

    private String name = "I am good manager!";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void manageProject(Projectable projectable) {
        projectable.getBaseCustomer().increaseHappiness();
    }

    @Override
    public void callCustomer(Customerable customer) {
        customer.increaseHappiness();
    }
}
