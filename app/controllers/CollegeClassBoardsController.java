package controllers;

import models.CollegeClassDashBoard;
import play.mvc.With;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 18-09-11
 * Time: 10:27
 * To change this template use File | Settings | File Templates.
 */
@With(Secure.class)
@CRUD.For(CollegeClassDashBoard.class)
public class CollegeClassBoardsController extends CRUD {
}
