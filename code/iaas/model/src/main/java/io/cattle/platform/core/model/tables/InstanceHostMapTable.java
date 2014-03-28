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
public class InstanceHostMapTable extends org.jooq.impl.TableImpl<io.cattle.platform.core.model.tables.records.InstanceHostMapRecord> {

	private static final long serialVersionUID = 111022795;

	/**
	 * The singleton instance of <code>cattle.instance_host_map</code>
	 */
	public static final io.cattle.platform.core.model.tables.InstanceHostMapTable INSTANCE_HOST_MAP = new io.cattle.platform.core.model.tables.InstanceHostMapTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.cattle.platform.core.model.tables.records.InstanceHostMapRecord> getRecordType() {
		return io.cattle.platform.core.model.tables.records.InstanceHostMapRecord.class;
	}

	/**
	 * The column <code>cattle.instance_host_map.id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.InstanceHostMapRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>cattle.instance_host_map.name</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.InstanceHostMapRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.instance_host_map.kind</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.InstanceHostMapRecord, java.lang.String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>cattle.instance_host_map.uuid</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.InstanceHostMapRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.instance_host_map.description</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.InstanceHostMapRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>cattle.instance_host_map.state</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.InstanceHostMapRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.instance_host_map.created</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.InstanceHostMapRecord, java.util.Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.instance_host_map.removed</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.InstanceHostMapRecord, java.util.Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.instance_host_map.remove_time</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.InstanceHostMapRecord, java.util.Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.instance_host_map.data</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.InstanceHostMapRecord, java.util.Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB.length(65535).asConvertedDataType(new io.cattle.platform.db.jooq.converter.DataConverter()), this, "");

	/**
	 * The column <code>cattle.instance_host_map.instance_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.InstanceHostMapRecord, java.lang.Long> INSTANCE_ID = createField("instance_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.instance_host_map.host_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.InstanceHostMapRecord, java.lang.Long> HOST_ID = createField("host_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>cattle.instance_host_map</code> table reference
	 */
	public InstanceHostMapTable() {
		this("instance_host_map", null);
	}

	/**
	 * Create an aliased <code>cattle.instance_host_map</code> table reference
	 */
	public InstanceHostMapTable(java.lang.String alias) {
		this(alias, io.cattle.platform.core.model.tables.InstanceHostMapTable.INSTANCE_HOST_MAP);
	}

	private InstanceHostMapTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.InstanceHostMapRecord> aliased) {
		this(alias, aliased, null);
	}

	private InstanceHostMapTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.InstanceHostMapRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, io.cattle.platform.core.model.CattleTable.CATTLE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.cattle.platform.core.model.tables.records.InstanceHostMapRecord, java.lang.Long> getIdentity() {
		return io.cattle.platform.core.model.Keys.IDENTITY_INSTANCE_HOST_MAP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.InstanceHostMapRecord> getPrimaryKey() {
		return io.cattle.platform.core.model.Keys.KEY_INSTANCE_HOST_MAP_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.InstanceHostMapRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.InstanceHostMapRecord>>asList(io.cattle.platform.core.model.Keys.KEY_INSTANCE_HOST_MAP_PRIMARY, io.cattle.platform.core.model.Keys.KEY_INSTANCE_HOST_MAP_IDX_INSTANCE_HOST_MAP_UUID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.InstanceHostMapRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.InstanceHostMapRecord, ?>>asList(io.cattle.platform.core.model.Keys.FK_INSTANCE_HOST_MAP__INSTANCE_ID, io.cattle.platform.core.model.Keys.FK_INSTANCE_HOST_MAP__HOST_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.cattle.platform.core.model.tables.InstanceHostMapTable as(java.lang.String alias) {
		return new io.cattle.platform.core.model.tables.InstanceHostMapTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public io.cattle.platform.core.model.tables.InstanceHostMapTable rename(java.lang.String name) {
		return new io.cattle.platform.core.model.tables.InstanceHostMapTable(name, null);
	}
}
