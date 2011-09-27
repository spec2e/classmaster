package controllers;

import models.Document;
import play.mvc.With;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 18-09-11
 * Time: 10:30
 * To change this template use File | Settings | File Templates.
 */
@With(Secure.class)
@CRUD.For(Document.class)
public class DocumentController extends CRUD {
}
