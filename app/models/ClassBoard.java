package models;

import play.db.jpa.Model;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 14-09-11
 * Time: 22:20
 * To change this template use File | Settings | File Templates.
 */
public class ClassBoard extends AbstractClassMasterModel {

    public Schedule schedule;
    public List<Student> students;
    public List<Teacher> teachers;
    public List<Thread> threads;

}
