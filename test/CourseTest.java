import models.Course;
import models.Student;
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

        List<Course> courses = Course.getCourses();
        assertEquals(3, courses.size());

        Course course = courses.get(0);
        List<Teacher> teachers = course.teachers;
        assertEquals(1, teachers.size());
        List<Student> students = course.students;
        assertEquals(2, students.size());
        assertEquals("Annette", course.description.author.firstName);
        assertEquals("Velkommen til matematik", course.description.title);

        course = courses.get(1);
        teachers = course.teachers;
        assertEquals(1, teachers.size());
        students = course.students;
        assertEquals(2, students.size());
        assertEquals("Pia Vibeke Borch", course.description.author.firstName);
        assertEquals("Velkommen til Fransk", course.description.title);

        course = courses.get(2);
        teachers = course.teachers;
        assertEquals(2, teachers.size());
        assertEquals("Pia Vibeke Borch", course.description.author.firstName);
        assertEquals("Velkommen til dansk", course.description.title);

    }

}
