package controllers;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 18-09-11
 * Time: 10:26
 * To change this template use File | Settings | File Templates.
 */

import models.College;
import play.mvc.With;

@With(Secure.class)
@CRUD.For(College.class)
public class CollegesController extends CRUD {
}
