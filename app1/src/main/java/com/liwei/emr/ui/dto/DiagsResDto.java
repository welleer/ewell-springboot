package com.liwei.emr.ui.dto;

public class DiagsResDto {
    String diag;//诊断
    String instruction;//诊断说明
    String date ;//诊断时间
    String diagtype ;//枚举值[0,1,2], 0-确诊   1-疑诊   2-待查


    public String getDiag() {
        return diag;
    }

    public void setDiag(String diag) {
        this.diag = diag;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDiagtype() {
        return diagtype;
    }

    public void setDiagtype(String diagtype) {
        this.diagtype = diagtype;
    }
}
