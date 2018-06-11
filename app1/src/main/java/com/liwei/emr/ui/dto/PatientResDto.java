package com.liwei.emr.ui.dto;

import com.liwei.emr.constants.StatusEnum;
import com.liwei.emr.constants.StatusEnum;

public class PatientResDto {

    String clinicno;//挂单号码
    String ename;//英文名
    String cname;//中文名
    String gender;//性别
    String age;//年龄，23Y or 8M（8个月）
    String idcard;//患者卡号,
    String appointtime;//预约时间
    String state;//就诊状态码（2未接诊  1已接诊）
    String statestring;//就诊状态字符

    public void setClinicno(String clinicno) {
        this.clinicno = clinicno;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public void setAppointtime(String appointtime) {
        this.appointtime = appointtime;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setStatestring(String state) {
        this.statestring = StatusEnum.getStatus(state).getDescription();
    }

    public String getClinicno() {
        return clinicno;
    }

    public String getEname() {
        return ename;
    }

    public String getCname() {
        return cname;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public String getIdcard() {
        return idcard;
    }

    public String getAppointtime() {
        return appointtime;
    }

    public String getState() {
        return state;
    }

    public String getStatestring() {
        return statestring;
    }
}
