package task013;

import org.aspectj.lang.annotation.Aspect;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zamkovoyilya on 27/03/16.
 */

public class Class2 {

    public void check(String mail){
        Pattern p = Pattern.compile("/.+@.+\\..+/i");
        Matcher m = p.matcher(mail);
        Boolean a = true;
        if(m.find()){
            System.out.println(a);
        }else {
            System.out.println(!a);
        }
    }

}
