import play.test.Fixtures;
import play.test.UnitTest;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 18-09-11
 * Time: 21:43
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractClassMasterTest extends UnitTest {

    public void loadYamlData() {

        Fixtures.deleteAllModels();
        Fixtures.loadModels(
                "yml/teachers.yml",
                "yml/students.yml",
                "yml/collegeclasses.yml",
                "yml/colleges.yml",
                "yml/courses.yml",
                "yml/schedules.yml"
        );
    }

}
