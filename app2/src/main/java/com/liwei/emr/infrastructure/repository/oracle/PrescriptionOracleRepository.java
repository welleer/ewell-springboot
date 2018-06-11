package com.liwei.emr.infrastructure.repository.oracle;

import com.liwei.emr.domain.repository.IPrescriptionRepository;
import com.liwei.emr.infrastructure.dao.oracle.PrescriptionMapper;
import com.liwei.emr.infrastructure.entity.oracle.Prescription;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @createdate 2017年9月23日
 */
@Repository
public class PrescriptionOracleRepository implements IPrescriptionRepository {

	@Resource
	PrescriptionMapper PrescriptionMapper;

	@Override
	public List<Prescription> query(String clinic_no) {
		return PrescriptionMapper.query(clinic_no);
	}

	@Override
	public List<Prescription> queryList(Prescription Prescription) {
		return PrescriptionMapper.queryList(Prescription);
	}

	@Override
	public List<Prescription> queryPageList(Prescription Prescription, int start, int end) {
		return PrescriptionMapper.queryPageList(Prescription,start,end);
	}

	@Override
	public int count(Prescription Prescription) {
		return PrescriptionMapper.count(Prescription);
	}

	@Override
	public int insert(Prescription Prescription) {
		int result=PrescriptionMapper.insert(Prescription);
		return result;
	}

	@Override
	public int update(Prescription Prescription) {
		int result= PrescriptionMapper.update(Prescription);

		return result;
	}

	@Override
	public int delete(String clinic_no) {
		int result= PrescriptionMapper.delete(clinic_no);
		return result;
	}


	@Override
	public int updatePresc(List<Prescription> list,String clinic_no) {
		int result= PrescriptionMapper.delete(clinic_no);
		for(Prescription p : list) {
			p.setClinic_no(clinic_no);
			int result2 = PrescriptionMapper.insert(p);
		}

		return result;
	}

}
