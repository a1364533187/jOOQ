/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.derby.sys.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.derby.sys.Keys;
import org.jooq.meta.derby.sys.Sys;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Syschecks extends TableImpl<Record> {

    private static final long serialVersionUID = -1008578696;

    /**
     * The reference instance of <code>SYS.SYSCHECKS</code>
     */
    public static final Syschecks SYSCHECKS = new Syschecks();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>SYS.SYSCHECKS.CONSTRAINTID</code>.
     */
    public final TableField<Record, String> CONSTRAINTID = createField(DSL.name("CONSTRAINTID"), SQLDataType.CHAR(36).nullable(false), this, "");

    /**
     * The column <code>SYS.SYSCHECKS.CHECKDEFINITION</code>.
     */
    public final TableField<Record, String> CHECKDEFINITION = createField(DSL.name("CHECKDEFINITION"), SQLDataType.LONGVARCHAR.nullable(false), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<Record, Object> REFERENCEDCOLUMNS = createField(DSL.name("REFERENCEDCOLUMNS"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"org.apache.derby.catalog.ReferencedColumns\"").nullable(false), this, "");

    private Syschecks(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Syschecks(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>SYS.SYSCHECKS</code> table reference
     */
    public Syschecks(String alias) {
        this(DSL.name(alias), SYSCHECKS);
    }

    /**
     * Create an aliased <code>SYS.SYSCHECKS</code> table reference
     */
    public Syschecks(Name alias) {
        this(alias, SYSCHECKS);
    }

    /**
     * Create a <code>SYS.SYSCHECKS</code> table reference
     */
    public Syschecks() {
        this(DSL.name("SYSCHECKS"), null);
    }

    public <O extends Record> Syschecks(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, SYSCHECKS);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public List<ForeignKey<Record, ?>> getReferences() {
        return Arrays.<ForeignKey<Record, ?>>asList(Keys.SYNTHETIC_FK_SYSCHECKS__SYNTHETIC_PK_SYSCONSTRAINTS);
    }

    public Sysconstraints sysconstraints() {
        return new Sysconstraints(this, Keys.SYNTHETIC_FK_SYSCHECKS__SYNTHETIC_PK_SYSCONSTRAINTS);
    }

    @Override
    public Syschecks as(String alias) {
        return new Syschecks(DSL.name(alias), this);
    }

    @Override
    public Syschecks as(Name alias) {
        return new Syschecks(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Syschecks rename(String name) {
        return new Syschecks(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Syschecks rename(Name name) {
        return new Syschecks(name, null);
    }
}
