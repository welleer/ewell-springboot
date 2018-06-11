package com.liwei.emr.infrastructure.dao.oracle;

import com.liwei.emr.infrastructure.entity.oracle.Medicine;
import com.liwei.emr.infrastructure.entity.oracle.Medicine;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MedicineMapper {


	/**
	 * 根据主键查询Medicine对象
	 * @param drug_id
	 * @return Medicine
	 */
	@Select("SELECT * FROM Medicine WHERE drug_id=#{drug_id}")
	public Medicine query(@Param("drug_id") String drug_id);
	
	/**
	 * 根据条件查询Medicine对象集合
	 * @param Medicine
	 * @return Medicine对象集合
	 */
	@SelectProvider(method = "queryList", type = MedicineProvider.class)
	public List<Medicine> queryList(Medicine Medicine);
	
	/**
	 * 根据条件分页查询Medicine对象集合
	 * @param Medicine
	 * @return Medicine对象集合
	 */
	@SelectProvider(method = "queryPageList", type = MedicineProvider.class)
	public List<Medicine> queryPageList(@Param("Medicine") Medicine Medicine, @Param("start") int start, @Param("end") int end);
	
	/**
	 * 根据条件查询Medicine数据条数
	 * @param Medicine
	 * @return Medicine数据条数
	 */
	@SelectProvider(method = "count", type = MedicineProvider.class)
	public int count(Medicine Medicine);
	
	/**
	 * 新增Medicine对象
	 * @param Medicine
	 * @return 
	 */
	@InsertProvider(method = "insert", type = MedicineProvider.class)
	public int insert(Medicine Medicine);

	/**
	 * 修改Medicine对象
	 * @param Medicine
	 * @return 
	 */
	@UpdateProvider(method = "update", type = MedicineProvider.class)
	public int update(Medicine Medicine);

	/**
	 * 根据主键Medicine对象
	 * @param drug_id
	 * @return Medicine对象
	 */
	@Delete("delete FROM Medicine WHERE drug_id=#{drug_id}")
	public int delete(@Param("drug_id") String drug_id);


	/**
	 * 根据条件查询Medicine对象集合
	 * @param drug_name
	 * @return Medicine对象集合
	 */
	@Select("SELECT * FROM Medicine WHERE drug_name like #{drug_name}||'%'")
	public List<Medicine> queryListByName(@Param("drug_name") String drug_name);
	
}
