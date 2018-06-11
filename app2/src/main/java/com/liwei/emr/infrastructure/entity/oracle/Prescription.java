package com.liwei.emr.infrastructure.entity.oracle;

public class Prescription {
    String clinic_no;
    String tablet_id;
    String create_date;
    String alias;
    String drug_name;
    String dose;
    String route;
    String freq;

    public String getClinic_no() {
        return clinic_no;
    }

    public void setClinic_no(String clinic_no) {
        this.clinic_no = clinic_no;
    }

    public String getTablet_id() {
        return tablet_id;
    }

    public void setTablet_id(String tablet_id) {
        this.tablet_id = tablet_id;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDrug_name() {
        return drug_name;
    }

    public void setDrug_name(String drug_name) {
        this.drug_name = drug_name;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getFreq() {
        return freq;
    }

    public void setFreq(String freq) {
        this.freq = freq;
    }
}
