package com.liwei.emr.domain.repository;

import com.liwei.emr.infrastructure.entity.oracle.Medicine;
import com.liwei.emr.infrastructure.entity.oracle.Medicine;

import java.util.List;

public interface IMedicineRepository {

    /**
     * 根据主键查询Medicine对象
     * @param clinic_no
     * @return Medicine对象
     */
    public Medicine query(String clinic_no);

    /**
     * 根据条件查询Medicine对象集合
     * @param Medicine
     * @return Medicine对象集合
     */
    public List<Medicine> queryList(Medicine Medicine);

    /**
     * 根据条件分页查询Medicine对象集合
     * @param Medicine
     * @return Medicine对象集合
     */
    public List<Medicine> queryPageList(Medicine Medicine, int start, int end);

    /**
     * 根据条件查询Medicine数据条数
     * @param Medicine
     * @return Medicine数据条数
     */
    public int count(Medicine Medicine);

    /**
     * 新增Medicine对象
     * @param Medicine
     * @return
     */
    public int insert(Medicine Medicine);

    /**
     * 修改Medicine对象
     * @param Medicine
     * @return
     */
    public int update(Medicine Medicine);

    /**
     * 根据主键Medicine对象
     * @param clinic_no
     * @return Medicine对象
     */
    public int delete(String clinic_no);


    public List<Medicine> queryListByName(String drug_name);
}
