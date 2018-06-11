package com.liwei.emr.infrastructure.dao.oracle;

import com.liwei.emr.infrastructure.entity.oracle.Tablet;
import com.liwei.emr.infrastructure.entity.oracle.Tablet;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TabletMapper {


	/**
	 * 根据主键查询Tablet对象
	 * @param tablet_id
	 * @return Tablet
	 */
	@Select("SELECT * FROM Tablet WHERE tablet_id=#{tablet_id}")
	public Tablet query(@Param("tablet_id") String tablet_id);
	
	/**
	 * 根据条件查询Tablet对象集合
	 * @param Tablet
	 * @return Tablet对象集合
	 */
	@SelectProvider(method = "queryList", type = TabletProvider.class)
	public List<Tablet> queryList(Tablet Tablet);
	
	/**
	 * 根据条件分页查询Tablet对象集合
	 * @param Tablet
	 * @return Tablet对象集合
	 */
	@SelectProvider(method = "queryPageList", type = TabletProvider.class)
	public List<Tablet> queryPageList(@Param("Tablet") Tablet Tablet, @Param("start") int start, @Param("end") int end);
	
	/**
	 * 根据条件查询Tablet数据条数
	 * @param Tablet
	 * @return Tablet数据条数
	 */
	@SelectProvider(method = "count", type = TabletProvider.class)
	public int count(Tablet Tablet);
	
	/**
	 * 新增Tablet对象
	 * @param Tablet
	 * @return 
	 */
	@InsertProvider(method = "insert", type = TabletProvider.class)
	public int insert(Tablet Tablet);

	/**
	 * 修改Tablet对象
	 * @param Tablet
	 * @return 
	 */
	@UpdateProvider(method = "update", type = TabletProvider.class)
	public int update(Tablet Tablet);

	/**
	 * 根据主键Tablet对象
	 * @param tablet_id
	 * @return Tablet对象
	 */
	@Delete("delete FROM Tablet WHERE tablet_id=#{tablet_id}")
	public int delete(@Param("tablet_id") String tablet_id);


}
