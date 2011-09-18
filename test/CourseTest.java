import models.Course;
import models.Teacher;
import org.junit.Test;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 18-09-11
 * Time: 21:42
 * To change this template use File | Settings | File Templates.
 */
public class CourseTest extends AbstractClassMasterTest {

    @Test
    public void testCourses() {

        loadYamlData();

        List<Course> courses = Course.findAll();

        for (Course course : courses) {
            List<Teacher> teachers = course.teachers;
            for (Teacher teacher : teachers) {
                System.out.println("teacher = " + teacher);
            }
            System.out.println("course.description = " + course.description);

        }

        assertEquals(3, courses.size());

    }
}
