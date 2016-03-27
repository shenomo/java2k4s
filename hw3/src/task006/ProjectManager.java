package task006;

/**
 * Created by user on 15.02.2016.
 */
public interface ProjectManager {
    String getName();
    void manageProject(Projectable projectable);
    void callCustomer(Customerable customer);

}