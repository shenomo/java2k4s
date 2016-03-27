package task007;

import java.util.Collection;

/**
 * Created by user on 15.02.2016.
 */
public interface Customerable {
    /**
     * @return customer happiness from 0 to 10
     */
    int getHappiness();
    String getName();
    Collection<Projectable> getProjectables();
    void increaseHappiness();
    void decreaseHappiness();
}
