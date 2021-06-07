package org.apache.cayenne.testdo.generated.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.apache.cayenne.testdo.generated.GeneratedColumnTestEntity;

/**
 * Class _GeneratedColumnDep was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _GeneratedColumnDep extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String GENERATED_COLUMN_FK_PK_COLUMN = "GENERATED_COLUMN_FK";

    public static final StringProperty<String> NAME = PropertyFactory.createString("name", String.class);
    public static final EntityProperty<GeneratedColumnTestEntity> TO_MASTER = PropertyFactory.createEntity("toMaster", GeneratedColumnTestEntity.class);

    protected String name;

    protected Object toMaster;

    public void setName(String name) {
        beforePropertyWrite("name", this.name, name);
        this.name = name;
    }

    public String getName() {
        beforePropertyRead("name");
        return this.name;
    }

    public void setToMaster(GeneratedColumnTestEntity toMaster) {
        setToOneTarget("toMaster", toMaster, true);
    }

    public GeneratedColumnTestEntity getToMaster() {
        return (GeneratedColumnTestEntity)readProperty("toMaster");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "name":
                return this.name;
            case "toMaster":
                return this.toMaster;
            default:
                return super.readPropertyDirectly(propName);
        }
    }

    @Override
    public void writePropertyDirectly(String propName, Object val) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch (propName) {
            case "name":
                this.name = (String)val;
                break;
            case "toMaster":
                this.toMaster = val;
                break;
            default:
                super.writePropertyDirectly(propName, val);
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        writeSerialized(out);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        readSerialized(in);
    }

    @Override
    protected void writeState(ObjectOutputStream out) throws IOException {
        super.writeState(out);
        out.writeObject(this.name);
        out.writeObject(this.toMaster);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.name = (String)in.readObject();
        this.toMaster = in.readObject();
    }

}
