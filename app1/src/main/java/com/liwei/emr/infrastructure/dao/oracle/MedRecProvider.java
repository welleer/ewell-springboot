package com.liwei.emr.infrastructure.dao.oracle;


import com.liwei.emr.infrastructure.entity.oracle.MedRec;
import com.liwei.emr.utils.SqlProviderUtil;
import com.liwei.emr.infrastructure.entity.oracle.MedRec;
import com.liwei.emr.utils.SqlProviderUtil;

public class MedRecProvider {

    /**
     * 修改MedRec对象
     * @param medRec
     * @return
     */
    public String update(MedRec medRec) {
        StringBuffer sql = new StringBuffer("UPDATE MEDICALRECORDS ");
        sql.append(SqlProviderUtil.provideSetterNotNullWithout(medRec,"diags"));
        sql.append(" WHERE ");

        sql.append("clinic_no=#{clinic_no}");
        return sql.toString();
    }
}