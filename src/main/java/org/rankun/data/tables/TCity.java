/**
 * This class is generated by jOOQ
 */
package org.rankun.data.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TCity extends org.jooq.impl.TableImpl<org.rankun.data.tables.records.TCityRecord> {

	private static final long serialVersionUID = -1113497971;

	/**
	 * The singleton instance of <code>jooq_test.t_city</code>
	 */
	public static final org.rankun.data.tables.TCity T_CITY = new org.rankun.data.tables.TCity();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.rankun.data.tables.records.TCityRecord> getRecordType() {
		return org.rankun.data.tables.records.TCityRecord.class;
	}

	/**
	 * The column <code>jooq_test.t_city.id</code>.
	 */
	public final org.jooq.TableField<org.rankun.data.tables.records.TCityRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>jooq_test.t_city.name</code>.
	 */
	public final org.jooq.TableField<org.rankun.data.tables.records.TCityRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(500).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>jooq_test.t_city.province</code>.
	 */
	public final org.jooq.TableField<org.rankun.data.tables.records.TCityRecord, java.lang.Integer> PROVINCE = createField("province", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>jooq_test.t_city</code> table reference
	 */
	public TCity() {
		this("t_city", null);
	}

	/**
	 * Create an aliased <code>jooq_test.t_city</code> table reference
	 */
	public TCity(java.lang.String alias) {
		this(alias, org.rankun.data.tables.TCity.T_CITY);
	}

	private TCity(java.lang.String alias, org.jooq.Table<org.rankun.data.tables.records.TCityRecord> aliased) {
		this(alias, aliased, null);
	}

	private TCity(java.lang.String alias, org.jooq.Table<org.rankun.data.tables.records.TCityRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.rankun.data.JooqTest.JOOQ_TEST, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.rankun.data.tables.records.TCityRecord, java.lang.Integer> getIdentity() {
		return org.rankun.data.Keys.IDENTITY_T_CITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.rankun.data.tables.records.TCityRecord> getPrimaryKey() {
		return org.rankun.data.Keys.KEY_T_CITY_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.rankun.data.tables.records.TCityRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.rankun.data.tables.records.TCityRecord>>asList(org.rankun.data.Keys.KEY_T_CITY_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.rankun.data.tables.TCity as(java.lang.String alias) {
		return new org.rankun.data.tables.TCity(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.rankun.data.tables.TCity rename(java.lang.String name) {
		return new org.rankun.data.tables.TCity(name, null);
	}
}
