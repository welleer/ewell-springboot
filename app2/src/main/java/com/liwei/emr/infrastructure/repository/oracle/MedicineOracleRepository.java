package com.liwei.emr.infrastructure.repository.oracle;

import com.liwei.emr.domain.repository.IMedicineRepository;
import com.liwei.emr.infrastructure.dao.oracle.MedicineMapper;
import com.liwei.emr.infrastructure.entity.oracle.Medicine;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @createdate 2017年9月23日
 */
@Repository
public class MedicineOracleRepository implements IMedicineRepository {

	@Resource
	MedicineMapper MedicineMapper;

	@Override
	public Medicine query(String drug_id) {
		return MedicineMapper.query(drug_id);
	}

	@Override
	public List<Medicine> queryList(Medicine Medicine) {
		return MedicineMapper.queryList(Medicine);
	}

	@Override
	public List<Medicine> queryPageList(Medicine Medicine, int start, int end) {
		return MedicineMapper.queryPageList(Medicine,start,end);
	}

	@Override
	public int count(Medicine Medicine) {
		return MedicineMapper.count(Medicine);
	}

	@Override
	public int insert(Medicine Medicine) {
		int result=MedicineMapper.insert(Medicine);
		return result;
	}

	@Override
	public int update(Medicine Medicine) {
		int result= MedicineMapper.update(Medicine);
		return result;
	}

	@Override
	public int delete(String drug_id) {
		int result= MedicineMapper.delete(drug_id);
		return result;
	}

	@Override
	public List<Medicine> queryListByName(String drug_name) {
		return MedicineMapper.queryListByName(drug_name);
	}
}
