package controllers;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 18-09-11
 * Time: 10:16
 * To change this template use File | Settings | File Templates.
 */

import models.Teacher;
import play.mvc.With;

@With(Secure.class)
@CRUD.For(Teacher.class)
public class TeachersController extends CRUD {
}
