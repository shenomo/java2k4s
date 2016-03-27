package task013;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Scanner;

/**
 * Created by zamkovoyilya on 27/03/16.
 */
@Aspect
public class Class1 {

    String mail = new String();

    @Around("execution(* *..Class2.check(mail))")
    public void setMail(String mail){
        this.mail=mail;
    }


}
