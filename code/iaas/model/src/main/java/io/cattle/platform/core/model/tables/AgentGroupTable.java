/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AgentGroupTable extends org.jooq.impl.TableImpl<io.cattle.platform.core.model.tables.records.AgentGroupRecord> {

	private static final long serialVersionUID = -379172941;

	/**
	 * The singleton instance of <code>cattle.agent_group</code>
	 */
	public static final io.cattle.platform.core.model.tables.AgentGroupTable AGENT_GROUP = new io.cattle.platform.core.model.tables.AgentGroupTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.cattle.platform.core.model.tables.records.AgentGroupRecord> getRecordType() {
		return io.cattle.platform.core.model.tables.records.AgentGroupRecord.class;
	}

	/**
	 * The column <code>cattle.agent_group.id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AgentGroupRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>cattle.agent_group.name</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AgentGroupRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.agent_group.account_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AgentGroupRecord, java.lang.Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.agent_group.kind</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AgentGroupRecord, java.lang.String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>cattle.agent_group.uuid</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AgentGroupRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.agent_group.description</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AgentGroupRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>cattle.agent_group.state</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AgentGroupRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.agent_group.created</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AgentGroupRecord, java.util.Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.agent_group.removed</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AgentGroupRecord, java.util.Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.agent_group.remove_time</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AgentGroupRecord, java.util.Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.agent_group.data</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AgentGroupRecord, java.util.Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB.length(65535).asConvertedDataType(new io.cattle.platform.db.jooq.converter.DataConverter()), this, "");

	/**
	 * Create a <code>cattle.agent_group</code> table reference
	 */
	public AgentGroupTable() {
		this("agent_group", null);
	}

	/**
	 * Create an aliased <code>cattle.agent_group</code> table reference
	 */
	public AgentGroupTable(java.lang.String alias) {
		this(alias, io.cattle.platform.core.model.tables.AgentGroupTable.AGENT_GROUP);
	}

	private AgentGroupTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.AgentGroupRecord> aliased) {
		this(alias, aliased, null);
	}

	private AgentGroupTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.AgentGroupRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, io.cattle.platform.core.model.CattleTable.CATTLE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.cattle.platform.core.model.tables.records.AgentGroupRecord, java.lang.Long> getIdentity() {
		return io.cattle.platform.core.model.Keys.IDENTITY_AGENT_GROUP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.AgentGroupRecord> getPrimaryKey() {
		return io.cattle.platform.core.model.Keys.KEY_AGENT_GROUP_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.AgentGroupRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.AgentGroupRecord>>asList(io.cattle.platform.core.model.Keys.KEY_AGENT_GROUP_PRIMARY, io.cattle.platform.core.model.Keys.KEY_AGENT_GROUP_IDX_AGENT_GROUP_UUID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.AgentGroupRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.AgentGroupRecord, ?>>asList(io.cattle.platform.core.model.Keys.FK_AGENT_GROUP__ACCOUNT_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.cattle.platform.core.model.tables.AgentGroupTable as(java.lang.String alias) {
		return new io.cattle.platform.core.model.tables.AgentGroupTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public io.cattle.platform.core.model.tables.AgentGroupTable rename(java.lang.String name) {
		return new io.cattle.platform.core.model.tables.AgentGroupTable(name, null);
	}
}
