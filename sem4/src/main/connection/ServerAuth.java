package main.connection;

import main.entities.enums.Role;

import java.util.Base64;

/**
 * Created by zamkovoyilya on 27/05/16.
 */
public class ServerAuth {
    private static String loginPass;

    private static Role role;

    private ServerConnection server = new ServerConnection();

    static String getLoginPass() {
        return loginPass;
    }

    public static Role getRole() {
        return role;
    }

    public boolean tryAuth(String login, String pass) {
        save(login, pass);

        try {
            Role role = server.getRole();
            ServerAuth.role = role;
            System.out.println(role);
            return true;
        } catch (MyException e) {
            System.out.println(e.getStatusCode());
        } catch (Exception exc) {
            exc.printStackTrace();
        }

        return false;
    }

    private void save(String login, String pass) {
//        Basic YWRtaW46YWRtaW4=
        byte[] bytes = (login + ":" + pass).getBytes();
        loginPass = "Basic " + Base64.getEncoder().encodeToString(bytes);
    }
}