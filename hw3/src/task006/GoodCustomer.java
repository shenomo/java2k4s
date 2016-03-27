package task006;

/**
 * Created by zamkovoyilya on 15/02/16.
 */
public class GoodCustomer extends BaseCustomer{



    @Override
    public void increaseHappiness() {
        if(random.nextBoolean()){
            happiness++;
        }
    }

    @Override
    public void decreaseHappiness() {
        System.out.println("i am good customer");
    }

}
