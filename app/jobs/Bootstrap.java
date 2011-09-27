package jobs;

import play.jobs.Job;
import play.jobs.OnApplicationStart;
import play.test.Fixtures;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 27-09-11
 * Time: 19:11
 * To change this template use File | Settings | File Templates.
 */
@OnApplicationStart
public class Bootstrap extends Job {

    @Override
    public void doJob() throws Exception {
        Fixtures.loadModels(
                "yml/teachers.yml",
                "yml/students.yml",
                "yml/courses.yml",
                "/yml/schedules.yml",
                "yml/collegeclasses.yml",
                "yml/colleges.yml"
        );
    }
}
