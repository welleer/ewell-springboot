package com.liwei.emr.infrastructure.dao.oracle;

import com.liwei.emr.infrastructure.entity.oracle.Medicine;
import com.liwei.emr.utils.SqlProviderUtil;
import com.liwei.emr.infrastructure.entity.oracle.Medicine;

import java.util.Map;


public class MedicineProvider {

	/**
	 * 根据条件查询Medicine对象集合
	 * @param Medicine
	 * @return String
	 */
	public String queryList(Medicine Medicine){
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT *");
		sql.append(" FROM Medicine WHERE ");
		sql.append(SqlProviderUtil.provideConditionNotBlank(Medicine));
		sql.append(" order by drug_id ");
		return sql.toString();
	}
	
	/**
	 * 根据条件分页查询Medicine对象集合，默认以clinic_no转换数字后排序
	 * @param map
	 * @return String
	 */
	public String queryPageList(Map<String, Object> map) {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT *");
		sql.append(" FROM Medicine WHERE ");
		sql.append(SqlProviderUtil.provideConditionNotBlank(map.get("Medicine")));
		sql.append("order by drug_id");
		return SqlProviderUtil.getPaginationSql(sql.toString().replace("#{", "#{Medicine."));
	}
	
	/**
	 * 根据条件查询Medicine数据条数
	 * @param Medicine
	 * @return String
	 */
	public String count(Medicine Medicine){
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT *");
		sql.append(" FROM Medicine WHERE ");
		sql.append(SqlProviderUtil.provideConditionNotBlank(Medicine));
		return SqlProviderUtil.getCountSql(sql.toString());
	}
	
	/**
	 * 新增Medicine对象
	 * @param Medicine
	 * @return 
	 */
	public String insert(Medicine Medicine){
		String temp=SqlProviderUtil.provideInsertNotBlank(Medicine, "Medicine");
		return temp;
	}

	/**
	 * 修改Medicine对象
	 * @param Medicine
	 * @return 
	 */
	public String update(Medicine Medicine) {
		StringBuffer sql = new StringBuffer("UPDATE Medicine ");
		sql.append(SqlProviderUtil.provideSetterNotNullWithout(Medicine));
		sql.append(" WHERE ");
			
			sql.append("drug_id=#{drug_id}");
		return sql.toString();
	}
}
