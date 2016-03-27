package task007;

import java.util.Collection;

public interface Projectable {
    Customerable getBaseCustomer();
    boolean fail();
    void setTeam(Teamable team);
    Teamable getTeam();
    boolean success();
    Collection<Userable> getUsers();
}
