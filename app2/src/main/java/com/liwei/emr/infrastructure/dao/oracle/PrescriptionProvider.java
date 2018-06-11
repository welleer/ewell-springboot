package com.liwei.emr.infrastructure.dao.oracle;

import com.liwei.emr.infrastructure.entity.oracle.Prescription;
import com.liwei.emr.utils.SqlProviderUtil;
import com.liwei.emr.infrastructure.entity.oracle.Prescription;

import java.util.Map;


public class PrescriptionProvider {

	/**
	 * 根据条件查询Prescription对象集合
	 * @param Prescription
	 * @return String
	 */
	public String queryList(Prescription Prescription){
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT *");
		sql.append(" FROM Prescription WHERE ");
		sql.append(SqlProviderUtil.provideConditionNotBlank(Prescription));
		sql.append(" order by clinic_no ");
		return sql.toString();
	}
	
	/**
	 * 根据条件分页查询Prescription对象集合，默认以clinic_no转换数字后排序
	 * @param map
	 * @return String
	 */
	public String queryPageList(Map<String, Object> map) {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT *");
		sql.append(" FROM Prescription WHERE ");
		sql.append(SqlProviderUtil.provideConditionNotBlank(map.get("Prescription")));
		sql.append("order by clinic_no");
		return SqlProviderUtil.getPaginationSql(sql.toString().replace("#{", "#{Prescription."));
	}
	
	/**
	 * 根据条件查询Prescription数据条数
	 * @param Prescription
	 * @return String
	 */
	public String count(Prescription Prescription){
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT *");
		sql.append(" FROM Prescription WHERE ");
		sql.append(SqlProviderUtil.provideConditionNotBlank(Prescription));
		return SqlProviderUtil.getCountSql(sql.toString());
	}
	
	/**
	 * 新增Prescription对象
	 * @param Prescription
	 * @return 
	 */
	public String insert(Prescription Prescription){
		String temp=SqlProviderUtil.provideInsertNotBlank(Prescription, "Prescription");
		return temp;
	}

	/**
	 * 修改Prescription对象
	 * @param Prescription
	 * @return 
	 */
	public String update(Prescription Prescription) {
		StringBuffer sql = new StringBuffer("UPDATE Prescription ");
		sql.append(SqlProviderUtil.provideSetterNotNullWithout(Prescription));
		sql.append(" WHERE ");
			
			sql.append("clinic_no=#{clinic_no}");
		return sql.toString();
	}
}
