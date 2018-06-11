package com.liwei.emr.infrastructure.dao.oracle;

import com.liwei.emr.infrastructure.entity.oracle.Patient;
import com.liwei.emr.infrastructure.entity.oracle.Patient;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface PatientMapper {


	/**
	 * 根据主键查询Patient对象
	 * @param clinic_no
	 * @return Patient
	 */
	@Select("SELECT * FROM PATIENT WHERE clinic_no=#{clinic_no}")
	public Patient query(@Param("clinic_no") String clinic_no);
	
	/**
	 * 根据条件查询Patient对象集合
	 * @param patient
	 * @return Patient对象集合
	 */
	@SelectProvider(method = "queryList", type = PatientProvider.class)
	public List<Patient> queryList(Patient patient);
	
	/**
	 * 根据条件分页查询Patient对象集合
	 * @param patient
	 * @return Patient对象集合
	 */
	@SelectProvider(method = "queryPageList", type = PatientProvider.class)
	public List<Patient> queryPageList(@Param("patient") Patient patient, @Param("start") int start, @Param("end") int end);
	
	/**
	 * 根据条件查询Patient数据条数
	 * @param patient
	 * @return Patient数据条数
	 */
	@SelectProvider(method = "count", type = PatientProvider.class)
	public int count(Patient patient);
	
	/**
	 * 新增Patient对象
	 * @param patient
	 * @return 
	 */
	@InsertProvider(method = "insert", type = PatientProvider.class)
	public int insert(Patient patient);

	/**
	 * 修改Patient对象
	 * @param patient
	 * @return 
	 */
	@UpdateProvider(method = "update", type = PatientProvider.class)
	public int update(Patient patient);

	/**
	 * 根据主键Patient对象
	 * @param clinic_no
	 * @return Patient对象
	 */
	@Delete("delete FROM PATIENT WHERE clinic_no=#{clinic_no}")
	public int delete(@Param("clinic_no") String clinic_no);
	
}
