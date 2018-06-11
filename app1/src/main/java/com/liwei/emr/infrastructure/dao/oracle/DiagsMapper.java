package com.liwei.emr.infrastructure.dao.oracle;

import com.liwei.emr.infrastructure.entity.oracle.Diags;
import com.liwei.emr.infrastructure.entity.oracle.MedRec;
import com.liwei.emr.infrastructure.entity.oracle.Patient;
import com.liwei.emr.infrastructure.entity.oracle.Diags;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DiagsMapper {

    //查询医生对病人的诊断
    @Select(value = "select * from DIAGS where clinic_no = #{clinic_no}")
    public List<Diags> find(@Param("clinic_no") String clinic_no);


    /**
     * 新增Diags对象
     * @param diags
     * @return
     */
    @InsertProvider(method = "insert", type = DiagsProvider.class)
    public int insert(Diags diags);

    /**
     * 修改Diags对象
     * @param diags
     * @return
     */
    @UpdateProvider(method = "update", type = DiagsProvider.class)
    public int update(Diags diags);


    /**
     * 根据主键Patient对象
     * @param clinic_no
     * @return Patient对象
     */
    @Delete("delete FROM DIAGS WHERE clinic_no=#{clinic_no}")
    public int delete(@Param("clinic_no") String clinic_no);
}