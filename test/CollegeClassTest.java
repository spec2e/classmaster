import models.CollegeClass;
import models.Student;
import models.Teacher;
import org.junit.Test;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 26-09-11
 * Time: 20:29
 * To change this template use File | Settings | File Templates.
 */
public class CollegeClassTest extends AbstractClassMasterTest {

    @Test
    public void testCollegeClass() throws Exception {

        loadYamlData();

        List<CollegeClass> ccList = CollegeClass.findAll();
        assertEquals(1, ccList.size());
        for (CollegeClass collegeClass : ccList) {
            List<Teacher> teachers = collegeClass.teachers;
            assertEquals(2, teachers.size());
            List<Student> students = collegeClass.students;
            assertEquals(2, students.size());
        }
    }
}
