import play.db.jpa.JPA;
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
        Fixtures.loadModels("yml/classmaster.yml");
        /*
        Fixtures.loadModels(
                "yml/teachers.yml",
                "yml/students.yml",
                "yml/courses.yml",
                "yml/schedules.yml",
                "yml/collegeclasses.yml",
                "yml/colleges.yml"
        );*/
        JPA.em().flush();
    }

}
