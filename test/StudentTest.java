import models.Address;
import models.Student;
import org.junit.Test;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 19-09-11
 * Time: 20:11
 * To change this template use File | Settings | File Templates.
 */
public class StudentTest extends AbstractClassMasterTest {

    @Test
    public void testStudents() {
        loadYamlData();

        List<Student> students = Student.findAll();
        assertEquals(2, students.size());
    }

}
