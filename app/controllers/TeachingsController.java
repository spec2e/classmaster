package controllers;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 18-09-11
 * Time: 10:32
 * To change this template use File | Settings | File Templates.
 */

import models.Teaching;
import play.mvc.With;

@With(Secure.class)
@CRUD.For(Teaching.class)
public class TeachingsController extends CRUD {
}
