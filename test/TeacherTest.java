import models.Person;
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
public class TeacherTest extends AbstractClassMasterTest {

    @Test
    public void loadTeachers() {

        loadYamlData();

        List<Teacher> teachers = Teacher.findAll();
        assertEquals(2, teachers.size());

        Teacher teacher = teachers.get(0);
        assertEquals("Pia Vibeke Borch", teacher.firstName);

        teacher = teachers.get(1);
        assertEquals("Annette", teacher.firstName);

        Person p = Person.findByUserName("piaborch@yahoo.dk");
        assertNotNull(p);

    }
}
