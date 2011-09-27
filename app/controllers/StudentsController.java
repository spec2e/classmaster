package controllers;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 18-09-11
 * Time: 10:21
 * To change this template use File | Settings | File Templates.
 */

import models.Student;
import play.mvc.With;

@With(Secure.class)
@CRUD.For(Student.class)
public class StudentsController extends CRUD {
}
