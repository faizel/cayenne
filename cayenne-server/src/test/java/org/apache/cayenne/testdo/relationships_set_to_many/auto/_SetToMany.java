package org.apache.cayenne.testdo.relationships_set_to_many.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Set;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.ExpressionFactory;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.SetProperty;
import org.apache.cayenne.testdo.relationships_set_to_many.SetToManyTarget;

/**
 * Class _SetToMany was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _SetToMany extends BaseDataObject {

    private static final long serialVersionUID = 1L; 

    public static final NumericProperty<Integer> ID_PK_PROPERTY = PropertyFactory.createNumeric(ExpressionFactory.dbPathExp("ID"), Integer.class);
    public static final String ID_PK_COLUMN = "ID";

    public static final SetProperty<SetToManyTarget> TARGETS = PropertyFactory.createSet("targets", SetToManyTarget.class);


    protected Object targets;

    public void addToTargets(SetToManyTarget obj) {
        addToManyTarget("targets", obj, true);
    }

    public void removeFromTargets(SetToManyTarget obj) {
        removeToManyTarget("targets", obj, true);
    }

    @SuppressWarnings("unchecked")
    public Set<SetToManyTarget> getTargets() {
        return (Set<SetToManyTarget>)readProperty("targets");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "targets":
                return this.targets;
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
            case "targets":
                this.targets = val;
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
        out.writeObject(this.targets);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.targets = in.readObject();
    }

}
