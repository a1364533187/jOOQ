/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sqlserver.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TableConstraints extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 963154428;

	/**
	 * The singleton instance of <code>INFORMATION_SCHEMA.TABLE_CONSTRAINTS</code>
	 */
	public static final org.jooq.util.sqlserver.information_schema.tables.TableConstraints TABLE_CONSTRAINTS = new org.jooq.util.sqlserver.information_schema.tables.TableConstraints();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLE_CONSTRAINTS.CONSTRAINT_CATALOG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_CATALOG = createField("CONSTRAINT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLE_CONSTRAINTS.CONSTRAINT_SCHEMA</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_SCHEMA = createField("CONSTRAINT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLE_CONSTRAINTS.CONSTRAINT_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_NAME = createField("CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLE_CONSTRAINTS.CONSTRAINT_TYPE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_TYPE = createField("CONSTRAINT_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLE_CONSTRAINTS.TABLE_CATALOG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLE_CONSTRAINTS.TABLE_SCHEMA</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLE_CONSTRAINTS.TABLE_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLE_CONSTRAINTS.IS_DEFERRABLE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_DEFERRABLE = createField("IS_DEFERRABLE", org.jooq.impl.SQLDataType.VARCHAR.length(3), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLE_CONSTRAINTS.INITIALLY_DEFERRED</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> INITIALLY_DEFERRED = createField("INITIALLY_DEFERRED", org.jooq.impl.SQLDataType.VARCHAR.length(3), this);

	/**
	 * Create a <code>INFORMATION_SCHEMA.TABLE_CONSTRAINTS</code> table reference
	 */
	public TableConstraints() {
		super("TABLE_CONSTRAINTS", org.jooq.util.sqlserver.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.TABLE_CONSTRAINTS</code> table reference
	 */
	public TableConstraints(java.lang.String alias) {
		super(alias, org.jooq.util.sqlserver.information_schema.InformationSchema.INFORMATION_SCHEMA, org.jooq.util.sqlserver.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.sqlserver.information_schema.tables.TableConstraints as(java.lang.String alias) {
		return new org.jooq.util.sqlserver.information_schema.tables.TableConstraints(alias);
	}
}
