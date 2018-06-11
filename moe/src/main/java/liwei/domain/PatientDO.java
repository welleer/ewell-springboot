package liwei.domain;

import javax.persistence.*;

@Table(name = "PATIENT")
public class PatientDO {
    @Id
    private String CLINIC_NO;

    private String ENGLISH_NAME;

    private String CHINESE_NAME;

    private String GENDER;

    private String AGE;

    private String CARD_NUMBER;

    private String APPOINTMENT;

    private String STATUS;

    /**
     * @return CLINIC_NO
     */
    public String getCLINIC_NO() {
        return CLINIC_NO;
    }

    /**
     * @param CLINIC_NO
     */
    public void setCLINIC_NO(String CLINIC_NO) {
        this.CLINIC_NO = CLINIC_NO;
    }

    /**
     * @return ENGLISH_NAME
     */
    public String getENGLISH_NAME() {
        return ENGLISH_NAME;
    }

    /**
     * @param ENGLISH_NAME
     */
    public void setENGLISH_NAME(String ENGLISH_NAME) {
        this.ENGLISH_NAME = ENGLISH_NAME;
    }

    /**
     * @return CHINESE_NAME
     */
    public String getCHINESE_NAME() {
        return CHINESE_NAME;
    }

    /**
     * @param CHINESE_NAME
     */
    public void setCHINESE_NAME(String CHINESE_NAME) {
        this.CHINESE_NAME = CHINESE_NAME;
    }

    /**
     * @return GENDER
     */
    public String getGENDER() {
        return GENDER;
    }

    /**
     * @param GENDER
     */
    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    /**
     * @return AGE
     */
    public String getAGE() {
        return AGE;
    }

    /**
     * @param AGE
     */
    public void setAGE(String AGE) {
        this.AGE = AGE;
    }

    /**
     * @return CARD_NUMBER
     */
    public String getCARD_NUMBER() {
        return CARD_NUMBER;
    }

    /**
     * @param CARD_NUMBER
     */
    public void setCARD_NUMBER(String CARD_NUMBER) {
        this.CARD_NUMBER = CARD_NUMBER;
    }

    /**
     * @return APPOINTMENT
     */
    public String getAPPOINTMENT() {
        return APPOINTMENT;
    }

    /**
     * @param APPOINTMENT
     */
    public void setAPPOINTMENT(String APPOINTMENT) {
        this.APPOINTMENT = APPOINTMENT;
    }

    /**
     * @return STATUS
     */
    public String getSTATUS() {
        return STATUS;
    }

    /**
     * @param STATUS
     */
    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }
}