package task006;

/**
 * Created by zamkovoyilya on 15/02/16.
 */
public class User implements Userable {

    @Override
    public long getId() {
        return 10;
    }

    @Override
    public String getName() {
        return "super user name";
    }

    @Override
    public int getAge() {
        return 20;
    }

    @Override
    public String getCountry() {
        return "super user country";
    }
}
