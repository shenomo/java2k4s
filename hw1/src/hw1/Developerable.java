package hw1;

import java.util.Collection;

/**
 * Created by user on 15.02.2016.
 */
public interface Developerable {
    void removeProject(Projectable projectable);
    void addProject(Projectable projectable);
    Collection<Projectable> getProjectables();
    void writeCode();
}
