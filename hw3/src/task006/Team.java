package task006;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by zamkovoyilya on 15/02/16.
 */
public class Team implements Teamable{

    ArrayList<Developerable> list;
    private ProjectManager manager;


    @Override
    public void addDeveloper(Developerable developerable) {
        list.add(developerable);
    }

    @Override
    public boolean removeDeveloper(Developerable developerable) {
        return list.remove(developerable);
    }

    @Override
    public Collection<Developerable> getDeveloper() {
        return list;
    }

    @Override
    public ProjectManager getProjectManager() {
        return manager;
    }

    @Override
    public void setProjectManager(ProjectManager projectManager) {
        manager = projectManager;
    }
}
