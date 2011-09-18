import models.Teacher;
import org.junit.Test;
import play.test.Fixtures;
import play.test.UnitTest;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 18-09-11
 * Time: 11:22
 * To change this template use File | Settings | File Templates.
 */
public class TeacherTest extends UnitTest {

    @Test
    public void loadTeachers() {
        Fixtures.loadModels("data.yml");

        List<Teacher> teachers = Teacher.findAll();

        assertEquals(2, teachers.size());

    }
}
