package com.liwei.emr.domain.repository;

import com.liwei.emr.infrastructure.entity.oracle.Patient;
import com.liwei.emr.infrastructure.entity.oracle.Patient;

import java.util.List;

public interface IPatientRepository {

    /**
     * 根据主键查询Patient对象
     * @param drug_id
     * @return Patient对象
     */
    public Patient query(String drug_id);

    /**
     * 根据条件查询Patient对象集合
     * @param patient
     * @return Patient对象集合
     */
    public List<Patient> queryList(Patient patient);

    /**
     * 根据条件分页查询Patient对象集合
     * @param patient
     * @return Patient对象集合
     */
    public List<Patient> queryPageList(Patient patient,int start,int end);

    /**
     * 根据条件查询Patient数据条数
     * @param patient
     * @return Patient数据条数
     */
    public int count(Patient patient);

    /**
     * 新增Patient对象
     * @param patient
     * @return
     */
    public int insert(Patient patient);

    /**
     * 修改Patient对象
     * @param patient
     * @return
     */
    public int update(Patient patient);

    /**
     * 根据主键Patient对象
     * @param drug_id
     * @return Patient对象
     */
    public int delete(String drug_id);

}
