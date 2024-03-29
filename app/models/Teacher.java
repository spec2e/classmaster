package models;

import play.db.jpa.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 14-09-11
 * Time: 21:47
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Teacher extends Person {

    @ManyToMany(mappedBy = "teachers", cascade = CascadeType.ALL)
    public List<Course> courses;
    @OneToMany
    public List<Assignment> publishedAssignments;
    @OneToMany
    public List<Assignment> assignmentDrafts;

    @Override
    public String toString() {

        return super.toString() + "\n Teacher{" +
                "courses=" + courses +
                ", publishedAssignments=" + publishedAssignments +
                ", assignmentDrafts=" + assignmentDrafts +
                '}';
    }
}
