package models;

import play.db.jpa.Model;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 14-09-11
 * Time: 22:05
 * To change this template use File | Settings | File Templates.
 */
public class Course extends AbstractClassMasterModel {

    public String courseName;
    public List<Teacher> teachers;
    public List<Student> students;
    public Message description;



}