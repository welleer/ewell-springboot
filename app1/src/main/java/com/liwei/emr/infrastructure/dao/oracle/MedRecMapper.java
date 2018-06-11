package com.liwei.emr.infrastructure.dao.oracle;

import com.liwei.emr.infrastructure.entity.oracle.MedRec;
import com.liwei.emr.infrastructure.entity.oracle.Patient;
import com.liwei.emr.infrastructure.entity.oracle.MedRec;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MedRecMapper {
    //查询病人病历
    @Select(value = "select * from MEDICALRECORDS where clinic_no = #{clinic_no}")
    public MedRec find(@Param("clinic_no") String clinic_no);


    /**
     * 修改MedRec对象
     * @param medRec
     * @return
     */
    @UpdateProvider(method = "update", type = MedRecProvider.class)
    public int update(MedRec medRec);

}