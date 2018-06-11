package com.liwei.emr.constants;

/**
 * 状态类型常量
 */
public enum StatusEnum {


	/**
	 * 病人列表--全部
	 */
	PATIENT_STATUS_ALL("0","全部"),

	/**
	 * 病人列表--待接诊
	 */
	PATIENT_STATUS_UNCLINICED("1", "待接诊"),

	/**
	 * 病人列表--已接诊
	 */
	PATIENT_STATUS_CLINICED("2", "已接诊");

	private String code;

	private String description;

	StatusEnum(String code, String description) {
		this.code = code;
		this.description = description;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	public static StatusEnum getStatus(String code) throws IllegalArgumentException {
		if(StatusConstant.PATIENT_STATUS_ALL.equals(code)) {
			return PATIENT_STATUS_ALL;
		} else if(StatusConstant.PATIENT_STATUS_UNCLINICED.equals(code)) {
			return PATIENT_STATUS_UNCLINICED;
		} else if(StatusConstant.PATIENT_STATUS_CLINICED.equals(code)) {
			return PATIENT_STATUS_CLINICED;
		} else {
			throw new IllegalArgumentException("Can not find : "+code);
		}
	}

}
