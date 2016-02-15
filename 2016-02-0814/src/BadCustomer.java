/**
 * Created by zamkovoyilya on 15/02/16.
 */
public class BadCustomer extends BaseCustomer{



    @Override
    public void decreaseHappiness() {
        if(random.nextBoolean()){
            happiness--;
        }
    }


    @Override
    public void increaseHappiness() {
        if(random.nextBoolean()){
            happiness++;
        }
    }


}
