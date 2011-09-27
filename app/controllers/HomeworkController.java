package controllers;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 18-09-11
 * Time: 10:30
 * To change this template use File | Settings | File Templates.
 */

import models.Homework;
import play.mvc.With;

@With(Secure.class)
@CRUD.For(Homework.class)
public class HomeworkController extends CRUD {
}
