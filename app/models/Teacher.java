package models;

import play.db.jpa.Model;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 14-09-11
 * Time: 21:47
 * To change this template use File | Settings | File Templates.
 */
public class Teacher extends Model {

    public List<Subject> teachingSubjects;
    public List<Homework> publishedHomework;
    public List<Homework> homeworkDrafts;


}
