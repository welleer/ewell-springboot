package com.liwei.emr.infrastructure.entity.oracle;

public class Diags {
    String clinic_no;
    String diag;//诊断
    String instruction;//诊断说明
    String diagdate ;//诊断时间
    String diagtype ;//枚举值[0,1,2], 0-确诊   1-疑诊   2-待查

    public String getClinic_no() {
        return clinic_no;
    }

    public void setClinic_no(String clinic_no) {
        this.clinic_no = clinic_no;
    }

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

    public String getDiagdate() {
        return diagdate;
    }

    public void setDiagdate(String diagdate) {
        this.diagdate = diagdate;
    }

    public String getDiagtype() {
        return diagtype;
    }

    public void setDiagtype(String diagtype) {
        this.diagtype = diagtype;
    }
}
