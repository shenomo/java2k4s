package task006;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zamkovoyilya on 24/02/16.
 */
public class BaseDeveloperTest {

    BaseDeveloper baseDeveloper = new BaseDeveloper() {
        @Override
        public void writeCode() {

        }
    };
    Project project = new Project();

    @Test
    public void testAddAndRemoveProject() throws Exception {
        baseDeveloper.addProject(project);
        assertTrue(baseDeveloper.getProjectables().contains(project));
        baseDeveloper.removeProject(project);
        assertFalse(baseDeveloper.getProjectables().contains(project));
    }

    @Test
    public void testGetProjectables() throws Exception {
        baseDeveloper.addProject(project);
        assertEquals(baseDeveloper.getProjectables().size(), 1);
        baseDeveloper.addProject(project);
        assertEquals(baseDeveloper.getProjectables().size(), 2);
    }
}