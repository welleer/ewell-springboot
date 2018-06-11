package com.liwei.emr.domain.repository;

import com.liwei.emr.infrastructure.entity.oracle.Tablet;
import com.liwei.emr.infrastructure.entity.oracle.Tablet;

import java.util.List;

public interface ITabletRepository {

    /**
     * 根据主键查询Tablet对象
     * @param clinic_no
     * @return Tablet对象
     */
    public Tablet query(String tablet_id);

    /**
     * 根据条件查询Tablet对象集合
     * @param Tablet
     * @return Tablet对象集合
     */
    public List<Tablet> queryList(Tablet Tablet);

    /**
     * 根据条件分页查询Tablet对象集合
     * @param Tablet
     * @return Tablet对象集合
     */
    public List<Tablet> queryPageList(Tablet Tablet, int start, int end);

    /**
     * 根据条件查询Tablet数据条数
     * @param Tablet
     * @return Tablet数据条数
     */
    public int count(Tablet Tablet);

    /**
     * 新增Tablet对象
     * @param Tablet
     * @return
     */
    public int insert(Tablet Tablet);

    /**
     * 修改Tablet对象
     * @param Tablet
     * @return
     */
    public int update(Tablet Tablet);

    /**
     * 根据主键Tablet对象
     * @param tablet_id
     * @return Tablet对象
     */
    public int delete(String tablet_id);


}
