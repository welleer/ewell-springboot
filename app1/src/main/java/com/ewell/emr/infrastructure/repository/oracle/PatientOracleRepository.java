package com.ewell.emr.infrastructure.repository.oracle;

import com.ewell.emr.domain.repository.IOrderRepository;
import com.ewell.emr.domain.repository.IPatientRepository;
import com.ewell.emr.infrastructure.dao.oracle.PatientMapper;
import com.ewell.emr.infrastructure.entity.oracle.Patient;
import org.springframework.beans.factory.annotation.Autowired;
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
	public List<Patient> findAll() {
		return patientMapper.findAll();
	}
}
