package com.liwei.emr.infrastructure.entity.oracle;

import java.util.List;

public class MedRec {
    String clinic_no;
    String chief_complaint ;//主诉
    String history_of_present ;//现病史
    String history_marriage ;//婚育史
    String history_personal ;//既往个人史
    String physical_exam ;//体格检查
    List<Diags> diags;

    public String getClinic_no() {
        return clinic_no;
    }

    public void setClinic_no(String clinic_no) {
        this.clinic_no = clinic_no;
    }

    public String getChief_complaint() {
        return chief_complaint;
    }

    public void setChief_complaint(String chief_complaint) {
        this.chief_complaint = chief_complaint;
    }

    public String getHistory_of_present() {
        return history_of_present;
    }

    public void setHistory_of_present(String history_of_present) {
        this.history_of_present = history_of_present;
    }

    public String getHistory_marriage() {
        return history_marriage;
    }

    public void setHistory_marriage(String history_marriage) {
        this.history_marriage = history_marriage;
    }

    public String getHistory_personal() {
        return history_personal;
    }

    public void setHistory_personal(String history_personal) {
        this.history_personal = history_personal;
    }

    public String getPhysical_exam() {
        return physical_exam;
    }

    public void setPhysical_exam(String physical_exam) {
        this.physical_exam = physical_exam;
    }

    public List<Diags> getDiags() {
        return diags;
    }

    public void setDiags(List<Diags> diags) {
        this.diags = diags;
    }
}
