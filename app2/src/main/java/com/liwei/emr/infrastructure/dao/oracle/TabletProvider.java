package com.liwei.emr.infrastructure.dao.oracle;

import com.liwei.emr.infrastructure.entity.oracle.Tablet;
import com.liwei.emr.utils.SqlProviderUtil;
import com.liwei.emr.infrastructure.entity.oracle.Tablet;

import java.util.Map;


public class TabletProvider {

	/**
	 * 根据条件查询Tablet对象集合
	 * @param Tablet
	 * @return String
	 */
	public String queryList(Tablet Tablet){
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT *");
		sql.append(" FROM Tablet WHERE ");
		sql.append(SqlProviderUtil.provideConditionNotBlank(Tablet));
		sql.append(" order by tablet_id ");
		return sql.toString();
	}
	
	/**
	 * 根据条件分页查询Tablet对象集合，默认以clinic_no转换数字后排序
	 * @param map
	 * @return String
	 */
	public String queryPageList(Map<String, Object> map) {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT *");
		sql.append(" FROM Tablet WHERE ");
		sql.append(SqlProviderUtil.provideConditionNotBlank(map.get("Tablet")));
		sql.append("order by tablet_id");
		return SqlProviderUtil.getPaginationSql(sql.toString().replace("#{", "#{Tablet."));
	}
	
	/**
	 * 根据条件查询Tablet数据条数
	 * @param Tablet
	 * @return String
	 */
	public String count(Tablet Tablet){
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT *");
		sql.append(" FROM Tablet WHERE ");
		sql.append(SqlProviderUtil.provideConditionNotBlank(Tablet));
		return SqlProviderUtil.getCountSql(sql.toString());
	}
	
	/**
	 * 新增Tablet对象
	 * @param Tablet
	 * @return 
	 */
	public String insert(Tablet Tablet){
		String temp=SqlProviderUtil.provideInsertNotBlank(Tablet, "Tablet");
		return temp;
	}

	/**
	 * 修改Tablet对象
	 * @param Tablet
	 * @return 
	 */
	public String update(Tablet Tablet) {
		StringBuffer sql = new StringBuffer("UPDATE Tablet ");
		sql.append(SqlProviderUtil.provideSetterNotNullWithout(Tablet));
		sql.append(" WHERE ");
			
			sql.append("tablet_id=#{tablet_id}");
		return sql.toString();
	}
}
