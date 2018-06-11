package com.liwei.emr.infrastructure.entity.oracle;

public class Tablet {
    String tablet_id;
    String intro;//20 MG BD'
    String dose;//剂量
    String route;//用药途径
    String freq;//用药频次

    public String getTablet_id() {
        return tablet_id;
    }

    public void setTablet_id(String tablet_id) {
        this.tablet_id = tablet_id;
    }


    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
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
