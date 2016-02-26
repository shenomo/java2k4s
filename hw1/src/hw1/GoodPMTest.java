package hw1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zamkovoyilya on 24/02/16.
 */
public class GoodPMTest {

    GoodPM pm = new GoodPM();

    BaseCustomer baseCustomer = new BaseCustomer() {
        @Override
        public void increaseHappiness() {
            happiness++;
        }

        @Override
        public void decreaseHappiness() {
            happiness--;
        }
    };

    @Test
    public void testGetName() throws Exception {
        assertEquals("I am good manager!", pm.getName());
    }

    @Test
    public void testManageProject() throws Exception {
        Project project = new Project();
        project.baseCustomer = baseCustomer;
        int happiness = project.baseCustomer.getHappiness();
        pm.manageProject(project);
        assertEquals(happiness + 1, project.baseCustomer.getHappiness());
    }

    @Test
    public void testCallCustomer() throws Exception {
        int happinessBefore = baseCustomer.getHappiness();
        pm.callCustomer(baseCustomer);
        assertEquals(happinessBefore + 1, baseCustomer.getHappiness());
    }
}