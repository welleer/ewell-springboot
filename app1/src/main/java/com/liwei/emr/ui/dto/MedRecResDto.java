package com.liwei.emr.ui.dto;

import java.util.List;

public class MedRecResDto {
    String chiefcomplaint ;//主诉
    String historyofpresent ;//现病史
    String historymarriage ;//婚育史
    String historypersonal ;//既往个人史
    String physicalexam ;//体格检查
    List<DiagsResDto> diags;

    public String getChiefcomplaint() {
        return chiefcomplaint;
    }

    public void setChiefcomplaint(String chiefcomplaint) {
        this.chiefcomplaint = chiefcomplaint;
    }

    public String getHistoryofpresent() {
        return historyofpresent;
    }

    public void setHistoryofpresent(String historyofpresent) {
        this.historyofpresent = historyofpresent;
    }

    public String getHistorymarriage() {
        return historymarriage;
    }

    public void setHistorymarriage(String historymarriage) {
        this.historymarriage = historymarriage;
    }

    public String getHistorypersonal() {
        return historypersonal;
    }

    public void setHistorypersonal(String historypersonal) {
        this.historypersonal = historypersonal;
    }

    public String getPhysicalexam() {
        return physicalexam;
    }

    public void setPhysicalexam(String physicalexam) {
        this.physicalexam = physicalexam;
    }

    public List<DiagsResDto> getDiags() {
        return diags;
    }

    public void setDiags(List<DiagsResDto> diags) {
        this.diags = diags;
    }
}
