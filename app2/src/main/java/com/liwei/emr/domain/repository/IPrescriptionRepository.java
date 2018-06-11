package com.liwei.emr.domain.repository;

import com.liwei.emr.infrastructure.entity.oracle.Prescription;
import com.liwei.emr.infrastructure.entity.oracle.Prescription;

import java.util.List;

public interface IPrescriptionRepository {

    /**
     * 根据主键查询Prescription对象
     * @param clinic_no
     * @return Prescription对象
     */
    public List<Prescription> query(String clinic_no);

    /**
     * 根据条件查询Prescription对象集合
     * @param Prescription
     * @return Prescription对象集合
     */
    public List<Prescription> queryList(Prescription Prescription);

    /**
     * 根据条件分页查询Prescription对象集合
     * @param Prescription
     * @return Prescription对象集合
     */
    public List<Prescription> queryPageList(Prescription Prescription, int start, int end);

    /**
     * 根据条件查询Prescription数据条数
     * @param Prescription
     * @return Prescription数据条数
     */
    public int count(Prescription Prescription);

    /**
     * 新增Prescription对象
     * @param Prescription
     * @return
     */
    public int insert(Prescription Prescription);

    /**
     * 修改Prescription对象
     * @param Prescription
     * @return
     */
    public int update(Prescription Prescription);

    /**
     * 根据主键Prescription对象
     * @param clinic_no
     * @return Prescription对象
     */
    public int delete(String clinic_no);


    public int updatePresc(List<Prescription> list, String clinic_no);
}
