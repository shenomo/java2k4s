import com.sun.xml.internal.rngom.parse.host.Base;

import java.util.ArrayList;

/**
 * Created by zamkovoyilya on 15/02/16.
 */
public class AndroidDeveloper extends BaseDeveloperable{

    ArrayList<String> deviceFor;
    String typeOfPC;

    @Override
    public void writeCode() {
        System.out.println("write cotlin code");
    }
}
