package controllers;

import models.CollegeClass;
import play.mvc.With;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 18-09-11
 * Time: 10:26
 * To change this template use File | Settings | File Templates.
 */
@With(Secure.class)
@CRUD.For(CollegeClass.class)
public class CollegeClassesController extends CRUD {
}
