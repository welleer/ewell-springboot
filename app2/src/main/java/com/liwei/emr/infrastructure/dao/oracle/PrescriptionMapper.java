package com.liwei.emr.infrastructure.dao.oracle;

import com.liwei.emr.infrastructure.entity.oracle.Prescription;
import com.liwei.emr.infrastructure.entity.oracle.Prescription;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PrescriptionMapper {


	/**
	 * 根据主键查询Prescription对象
	 * @param clinic_no
	 * @return Prescription
	 */
	@Select("SELECT * FROM Prescription WHERE clinic_no=#{clinic_no}")
	public List<Prescription> query(@Param("clinic_no") String clinic_no);
	
	/**
	 * 根据条件查询Prescription对象集合
	 * @param Prescription
	 * @return Prescription对象集合
	 */
	@SelectProvider(method = "queryList", type = PrescriptionProvider.class)
	public List<Prescription> queryList(Prescription Prescription);
	
	/**
	 * 根据条件分页查询Prescription对象集合
	 * @param Prescription
	 * @return Prescription对象集合
	 */
	@SelectProvider(method = "queryPageList", type = PrescriptionProvider.class)
	public List<Prescription> queryPageList(@Param("Prescription") Prescription Prescription, @Param("start") int start, @Param("end") int end);
	
	/**
	 * 根据条件查询Prescription数据条数
	 * @param Prescription
	 * @return Prescription数据条数
	 */
	@SelectProvider(method = "count", type = PrescriptionProvider.class)
	public int count(Prescription Prescription);
	
	/**
	 * 新增Prescription对象
	 * @param Prescription
	 * @return 
	 */
	@InsertProvider(method = "insert", type = PrescriptionProvider.class)
	public int insert(Prescription Prescription);

	/**
	 * 修改Prescription对象
	 * @param Prescription
	 * @return 
	 */
	@UpdateProvider(method = "update", type = PrescriptionProvider.class)
	public int update(Prescription Prescription);

	/**
	 * 根据主键Prescription对象
	 * @param clinic_no
	 * @return Prescription对象
	 */
	@Delete("delete FROM Prescription WHERE clinic_no=#{clinic_no}")
	public int delete(@Param("clinic_no") String clinic_no);


}
