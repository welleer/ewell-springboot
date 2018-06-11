package com.liwei.emr.infrastructure.repository.oracle;

import com.liwei.emr.domain.repository.IPatientRepository;
import com.liwei.emr.infrastructure.dao.oracle.PatientMapper;
import com.liwei.emr.infrastructure.entity.oracle.Patient;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @createdate 2017年9月23日
 */
@Repository
public class PatientOracleRepository implements IPatientRepository {

	@Resource
	PatientMapper patientMapper;

	@Override
	public Patient query(String clinic_no) {
		return patientMapper.query(clinic_no);
	}

	@Override
	public List<Patient> queryList(Patient patient) {
		return patientMapper.queryList(patient);
	}

	@Override
	public List<Patient> queryPageList(Patient patient, int start, int end) {
		return patientMapper.queryPageList(patient,start,end);
	}

	@Override
	public int count(Patient patient) {
		return patientMapper.count(patient);
	}

	@Override
	public int insert(Patient patient) {
		int result=patientMapper.insert(patient);
		return result;
	}

	@Override
	public int update(Patient patient) {
		int result= patientMapper.update(patient);
		return result;
	}

	@Override
	public int delete(String clinic_no) {
		int result= patientMapper.delete(clinic_no);
		return result;
	}
}
