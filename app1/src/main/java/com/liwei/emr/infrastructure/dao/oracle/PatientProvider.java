package com.liwei.emr.infrastructure.dao.oracle;

import com.liwei.emr.infrastructure.entity.oracle.Patient;
import com.liwei.emr.utils.SqlProviderUtil;
import com.liwei.emr.infrastructure.entity.oracle.Patient;
import com.liwei.emr.utils.SqlProviderUtil;

import java.util.Map;


public class PatientProvider {

	/**
	 * 根据条件查询Patient对象集合
	 * @param patient
	 * @return String
	 */
	public String queryList(Patient patient){
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT *");
		sql.append(" FROM PATIENT WHERE ");
		sql.append(SqlProviderUtil.provideConditionNotBlank(patient));
		sql.append(" order by clinic_no ");
		return sql.toString();
	}
	
	/**
	 * 根据条件分页查询Patient对象集合，默认以clinic_no转换数字后排序
	 * @param map
	 * @return String
	 */
	public String queryPageList(Map<String, Object> map) {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT *");
		sql.append(" FROM PATIENT WHERE ");
		sql.append(SqlProviderUtil.provideConditionNotBlank(map.get("patient")));
		sql.append("order by clinic_no");
		return SqlProviderUtil.getPaginationSql(sql.toString().replace("#{", "#{patient."));
	}
	
	/**
	 * 根据条件查询Patient数据条数
	 * @param patient
	 * @return String
	 */
	public String count(Patient patient){
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT *");
		sql.append(" FROM PATIENT WHERE ");
		sql.append(SqlProviderUtil.provideConditionNotBlank(patient));
		return SqlProviderUtil.getCountSql(sql.toString());
	}
	
	/**
	 * 新增Patient对象
	 * @param patient
	 * @return 
	 */
	public String insert(Patient patient){
		String temp=SqlProviderUtil.provideInsertNotBlank(patient, "PATIENT");
		return temp;
	}

	/**
	 * 修改Patient对象
	 * @param patient
	 * @return 
	 */
	public String update(Patient patient) {
		StringBuffer sql = new StringBuffer("UPDATE PATIENT ");
		sql.append(SqlProviderUtil.provideSetterNotNullWithout(patient));
		sql.append(" WHERE ");
			
			sql.append("clinic_no=#{clinic_no}");
		return sql.toString();
	}
}
