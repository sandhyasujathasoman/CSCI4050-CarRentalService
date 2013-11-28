/**
 * This class is generated by jOOQ
 */
package edu.uga.csci4050.group3.jooq.rentalservice.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User extends org.jooq.impl.TableImpl<edu.uga.csci4050.group3.jooq.rentalservice.tables.records.UserRecord> {

	private static final long serialVersionUID = 2032106688;

	/**
	 * The singleton instance of <code>rentalservice.USER</code>
	 */
	public static final edu.uga.csci4050.group3.jooq.rentalservice.tables.User USER = new edu.uga.csci4050.group3.jooq.rentalservice.tables.User();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<edu.uga.csci4050.group3.jooq.rentalservice.tables.records.UserRecord> getRecordType() {
		return edu.uga.csci4050.group3.jooq.rentalservice.tables.records.UserRecord.class;
	}

	/**
	 * The column <code>rentalservice.USER.id</code>. 
	 */
	public final org.jooq.TableField<edu.uga.csci4050.group3.jooq.rentalservice.tables.records.UserRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>rentalservice.USER.uid</code>. 
	 */
	public final org.jooq.TableField<edu.uga.csci4050.group3.jooq.rentalservice.tables.records.UserRecord, java.lang.String> UID = createField("uid", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rentalservice.USER.username</code>. 
	 */
	public final org.jooq.TableField<edu.uga.csci4050.group3.jooq.rentalservice.tables.records.UserRecord, java.lang.String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rentalservice.USER.password</code>. 
	 */
	public final org.jooq.TableField<edu.uga.csci4050.group3.jooq.rentalservice.tables.records.UserRecord, java.lang.String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rentalservice.USER.email</code>. 
	 */
	public final org.jooq.TableField<edu.uga.csci4050.group3.jooq.rentalservice.tables.records.UserRecord, java.lang.String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rentalservice.USER.first_name</code>. 
	 */
	public final org.jooq.TableField<edu.uga.csci4050.group3.jooq.rentalservice.tables.records.UserRecord, java.lang.String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rentalservice.USER.last_name</code>. 
	 */
	public final org.jooq.TableField<edu.uga.csci4050.group3.jooq.rentalservice.tables.records.UserRecord, java.lang.String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rentalservice.USER.role</code>. 
	 */
	public final org.jooq.TableField<edu.uga.csci4050.group3.jooq.rentalservice.tables.records.UserRecord, java.lang.String> ROLE = createField("role", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rentalservice.USER.license</code>. 
	 */
	public final org.jooq.TableField<edu.uga.csci4050.group3.jooq.rentalservice.tables.records.UserRecord, java.lang.String> LICENSE = createField("license", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rentalservice.USER.dateofbirth</code>. 
	 */
	public final org.jooq.TableField<edu.uga.csci4050.group3.jooq.rentalservice.tables.records.UserRecord, java.lang.Short> DATEOFBIRTH = createField("dateofbirth", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>rentalservice.USER.street_address</code>. 
	 */
	public final org.jooq.TableField<edu.uga.csci4050.group3.jooq.rentalservice.tables.records.UserRecord, java.lang.String> STREET_ADDRESS = createField("street_address", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rentalservice.USER.state</code>. 
	 */
	public final org.jooq.TableField<edu.uga.csci4050.group3.jooq.rentalservice.tables.records.UserRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rentalservice.USER.country</code>. 
	 */
	public final org.jooq.TableField<edu.uga.csci4050.group3.jooq.rentalservice.tables.records.UserRecord, java.lang.String> COUNTRY = createField("country", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rentalservice.USER.zipcode</code>. 
	 */
	public final org.jooq.TableField<edu.uga.csci4050.group3.jooq.rentalservice.tables.records.UserRecord, java.lang.Short> ZIPCODE = createField("zipcode", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>rentalservice.USER.city</code>. 
	 */
	public final org.jooq.TableField<edu.uga.csci4050.group3.jooq.rentalservice.tables.records.UserRecord, java.lang.String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * Create a <code>rentalservice.USER</code> table reference
	 */
	public User() {
		super("USER", edu.uga.csci4050.group3.jooq.rentalservice.Rentalservice.RENTALSERVICE);
	}

	/**
	 * Create an aliased <code>rentalservice.USER</code> table reference
	 */
	public User(java.lang.String alias) {
		super(alias, edu.uga.csci4050.group3.jooq.rentalservice.Rentalservice.RENTALSERVICE, edu.uga.csci4050.group3.jooq.rentalservice.tables.User.USER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<edu.uga.csci4050.group3.jooq.rentalservice.tables.records.UserRecord, java.lang.Integer> getIdentity() {
		return edu.uga.csci4050.group3.jooq.rentalservice.Keys.IDENTITY_USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<edu.uga.csci4050.group3.jooq.rentalservice.tables.records.UserRecord> getPrimaryKey() {
		return edu.uga.csci4050.group3.jooq.rentalservice.Keys.KEY_USER_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<edu.uga.csci4050.group3.jooq.rentalservice.tables.records.UserRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<edu.uga.csci4050.group3.jooq.rentalservice.tables.records.UserRecord>>asList(edu.uga.csci4050.group3.jooq.rentalservice.Keys.KEY_USER_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public edu.uga.csci4050.group3.jooq.rentalservice.tables.User as(java.lang.String alias) {
		return new edu.uga.csci4050.group3.jooq.rentalservice.tables.User(alias);
	}
}