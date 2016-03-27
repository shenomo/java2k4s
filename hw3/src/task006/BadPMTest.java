package task006;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zamkovoyilya on 24/02/16.
 */
public class BadPMTest {

    @Test
    public void testGetName() throws Exception {
        BadPM bd = new BadPM();
        assertEquals("I am so bad :(", bd.getName());
    }

    @Test
    public void testManageProject() throws Exception {
        BadPM badPM = new BadPM();
        Project project = new Project();
        project.baseCustomer = new GoodCustomer();
        int happiness = project.baseCustomer.getHappiness();
        badPM.manageProject(project);
        assertEquals(happiness - 1, project.baseCustomer.getHappiness());
    }

    @Test
    public void testCallCustomer() throws Exception {
        //use random, impossible to do
    }
}