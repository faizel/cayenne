package org.apache.cayenne.testdo.inheritance_flat.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.testdo.inheritance_flat.Group;

/**
 * Class _GroupProperties was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _GroupProperties extends CayenneDataObject {

    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String ID_PROPERTY = "id";
    public static final String GROUP_PROPERTY = "group";

    public static final String ID_PK_COLUMN = "id";

    public void setDescription(String description) {
        writeProperty(DESCRIPTION_PROPERTY, description);
    }
    public String getDescription() {
        return (String)readProperty(DESCRIPTION_PROPERTY);
    }

    public void setId(Long id) {
        writeProperty(ID_PROPERTY, id);
    }
    public Long getId() {
        return (Long)readProperty(ID_PROPERTY);
    }

    public void setGroup(Group group) {
        setToOneTarget(GROUP_PROPERTY, group, true);
    }

    public Group getGroup() {
        return (Group)readProperty(GROUP_PROPERTY);
    }


}