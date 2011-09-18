package models;

import play.db.jpa.GenericModel;
import play.db.jpa.Model;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 17-09-11
 * Time: 08:29
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class AbstractClassMasterModel extends GenericModel {

    public boolean deleted;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    public Long id;

    public Long getId() {
        return id;
    }

    @Override
    public Object _key() {
        return getId();
    }

}
