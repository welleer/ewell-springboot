package com.liwei.emr.infrastructure.entity.oracle;

public class Medicine {
    String drug_id;
    String drug_name;//药品名
    String alias;//药品别名
    String therapeutic_class;//治疗类别
    String tablet_ids;

    public String getDrug_id() {
        return drug_id;
    }

    public void setDrug_id(String drug_id) {
        this.drug_id = drug_id;
    }

    public String getDrug_name() {
        return drug_name;
    }

    public void setDrug_name(String drug_name) {
        this.drug_name = drug_name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getTherapeutic_class() {
        return therapeutic_class;
    }

    public void setTherapeutic_class(String therapeutic_class) {
        this.therapeutic_class = therapeutic_class;
    }

    public String getTablet_ids() {
        return tablet_ids;
    }

    public void setTablet_ids(String tablet_ids) {
        this.tablet_ids = tablet_ids;
    }
}
