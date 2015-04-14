/**
 * This class is generated by jOOQ
 */
package org.rankun.data.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * 学校
 * 
 * 一个有独立教务管理的就是一个学校
 * 
 * 用不同教务管理的不是同一个学校
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TSchoolRecord extends org.jooq.impl.UpdatableRecordImpl<org.rankun.data.tables.records.TSchoolRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = 1439385766;

	/**
	 * Setter for <code>jooq_test.t_school.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>jooq_test.t_school.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>jooq_test.t_school.name</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>jooq_test.t_school.name</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>jooq_test.t_school.province</code>.
	 */
	public void setProvince(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>jooq_test.t_school.province</code>.
	 */
	public java.lang.Integer getProvince() {
		return (java.lang.Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.rankun.data.tables.TSchool.T_SCHOOL.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.rankun.data.tables.TSchool.T_SCHOOL.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.rankun.data.tables.TSchool.T_SCHOOL.PROVINCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getProvince();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSchoolRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSchoolRecord value2(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSchoolRecord value3(java.lang.Integer value) {
		setProvince(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSchoolRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.Integer value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TSchoolRecord
	 */
	public TSchoolRecord() {
		super(org.rankun.data.tables.TSchool.T_SCHOOL);
	}

	/**
	 * Create a detached, initialised TSchoolRecord
	 */
	public TSchoolRecord(java.lang.Integer id, java.lang.String name, java.lang.Integer province) {
		super(org.rankun.data.tables.TSchool.T_SCHOOL);

		setValue(0, id);
		setValue(1, name);
		setValue(2, province);
	}
}