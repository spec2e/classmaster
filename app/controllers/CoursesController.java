package controllers;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 18-09-11
 * Time: 10:28
 * To change this template use File | Settings | File Templates.
 */

import models.Course;
import play.mvc.With;

@With(Secure.class)
@CRUD.For(Course.class)
public class CoursesController extends CRUD {
}
