package hw1;

import java.util.Collection;

/**
 * Created by user on 15.02.2016.
 */
public interface Teamable {
    void addDeveloper(Developerable developerable);
    boolean removeDeveloper(Developerable developerable);
    Collection<Developerable> getDeveloper();
    ProjectManager getProjectManager();
    void setProjectManager(ProjectManager projectManager);
}
