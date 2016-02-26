package hw1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by user on 15.02.2016.
 */
public abstract class BaseDeveloper implements Developerable {

    List<Projectable> projectables;

    public BaseDeveloper(){
        projectables = new ArrayList<>();
    }

    @Override
    public void removeProject(Projectable projectable) {
        projectables.remove(projectable);
    }

    @Override
    public void addProject(Projectable projectable) {
        projectables.add(projectable);
    }

    public Collection<Projectable> getProjectables() {
        return projectables;
    }

}
