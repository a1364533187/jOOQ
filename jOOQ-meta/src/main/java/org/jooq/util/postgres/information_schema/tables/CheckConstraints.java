/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CheckConstraints extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1406564791;

	/**
	 * The singleton instance of <code>information_schema.check_constraints</code>
	 */
	public static final org.jooq.util.postgres.information_schema.tables.CheckConstraints CHECK_CONSTRAINTS = new org.jooq.util.postgres.information_schema.tables.CheckConstraints();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>information_schema.check_constraints.constraint_catalog</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_CATALOG = createField("constraint_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>information_schema.check_constraints.constraint_schema</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_SCHEMA = createField("constraint_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>information_schema.check_constraints.constraint_name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_NAME = createField("constraint_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>information_schema.check_constraints.check_clause</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CHECK_CLAUSE = createField("check_clause", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Create a <code>information_schema.check_constraints</code> table reference
	 */
	public CheckConstraints() {
		super("check_constraints", org.jooq.util.postgres.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	/**
	 * Create an aliased <code>information_schema.check_constraints</code> table reference
	 */
	public CheckConstraints(java.lang.String alias) {
		super(alias, org.jooq.util.postgres.information_schema.InformationSchema.INFORMATION_SCHEMA, org.jooq.util.postgres.information_schema.tables.CheckConstraints.CHECK_CONSTRAINTS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.postgres.information_schema.tables.CheckConstraints as(java.lang.String alias) {
		return new org.jooq.util.postgres.information_schema.tables.CheckConstraints(alias);
	}
}
