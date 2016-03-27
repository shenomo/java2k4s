package task007;

/**
 * Created by zamkovoyilya on 15/02/16.
 */
public class BadCustomer extends BaseCustomer {



    @Override
    public void decreaseHappiness() {
        if(random.nextBoolean()){
            happiness--;
        }
    }

    task007.GoodPM pm = new GoodPM();

    public BadCustomer(task007.GoodPM pm) {
        this.pm = pm;
    }


    @Override
    public void increaseHappiness() {
        if(random.nextBoolean()){
            happiness++;
        }
    }


}
