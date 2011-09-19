package models;

import javax.persistence.Entity;
import javax.persistence.Lob;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 14-09-11
 * Time: 21:51
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Document extends AbstractClassMasterModel {

    @Lob
    public byte[] document;



}
