package com.liwei.emr.infrastructure.dao.oracle;


import com.liwei.emr.infrastructure.entity.oracle.Diags;
import com.liwei.emr.utils.SqlProviderUtil;
import com.liwei.emr.infrastructure.entity.oracle.Diags;
import com.liwei.emr.utils.SqlProviderUtil;

public class DiagsProvider {


    /**
     * 新增Diags对象
     * @param diags
     * @return
     */
    public String insert(Diags diags){
        String temp=SqlProviderUtil.provideInsertNotBlank(diags, "DIAGS");
        return temp;
    }

    /**
     * 修改Diags对象
     * @param diags
     * @returnØ
     */
    public String update(Diags diags) {
        StringBuffer sql = new StringBuffer("UPDATE DIAGS ");
        sql.append(SqlProviderUtil.provideSetterNotNullWithout(diags));
        sql.append(" WHERE ");

        sql.append("clinic_no=#{clinic_no}");
        return sql.toString();
    }
}