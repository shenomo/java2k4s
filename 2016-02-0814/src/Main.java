import static java.lang.Integer.*;

/**
 * Created by user on 28.01.2016.
 */
public class Main {

    public static void main(String[] args) {
        Project project = new Project();
        Project project1 = new Project();
        GoodPM goodPM = new GoodPM();
        BadPM badPM = new BadPM();
        Customerable badCustomer = new BadCustomer();
        Customerable goodCustomer = new GoodCustomer();
        Team team = new Team();
        Team team1 = new Team();
        User user = new User();
        User user1 = new User();
        Developerable iosDeveloperable = new IosDeveloperable();
        Developerable androidDeveloper = new AndroidDeveloper();

        project.setTeam(team);
        project1.setTeam(team1);

        project.baseCustomer = (BaseCustomer) badCustomer;
        project1.baseCustomer = (BaseCustomer) goodCustomer;

        goodPM.manageProject(project);
        badPM.manageProject(project1);

        iosDeveloperable.writeCode();
        androidDeveloper.writeCode();

        project.users.add(user);
        project1.users.add(user1);


    }
}
