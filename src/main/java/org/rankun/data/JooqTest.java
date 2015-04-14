/**
 * This class is generated by jOOQ
 */
package org.rankun.data;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JooqTest extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 489570797;

	/**
	 * The singleton instance of <code>jooq_test</code>
	 */
	public static final JooqTest JOOQ_TEST = new JooqTest();

	/**
	 * No further instances allowed
	 */
	private JooqTest() {
		super("jooq_test");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.rankun.data.tables.Todo.TODO,
			org.rankun.data.tables.TCity.T_CITY,
			org.rankun.data.tables.TCompany.T_COMPANY,
			org.rankun.data.tables.TProvince.T_PROVINCE,
			org.rankun.data.tables.TRecruitment.T_RECRUITMENT,
			org.rankun.data.tables.TSchool.T_SCHOOL,
			org.rankun.data.tables.TUser.T_USER);
	}
}
