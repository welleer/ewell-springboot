package com.liwei.emr.infrastructure.repository.oracle;

import com.liwei.emr.domain.repository.IMedRecRepository;
import com.liwei.emr.infrastructure.dao.oracle.DiagsMapper;
import com.liwei.emr.infrastructure.dao.oracle.MedRecMapper;
import com.liwei.emr.infrastructure.entity.oracle.Diags;
import com.liwei.emr.infrastructure.entity.oracle.MedRec;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @createdate 2017年9月23日
 */
@Repository
public class MedRecOracleRepository implements IMedRecRepository {

    @Resource
    MedRecMapper medRecMapper;
    @Resource
    DiagsMapper diagsMapper;

	@Override
	public MedRec find(String clinic_no) {
        MedRec medRec = medRecMapper.find(clinic_no);
        List<Diags> diagsList = diagsMapper.find(clinic_no);
        medRec.setDiags(diagsList);
		return medRec;
	}

    @Override
    public int update(MedRec medRec) {
        int result= medRecMapper.update(medRec);
        diagsMapper.delete(medRec.getClinic_no());
        for(Diags d : medRec.getDiags()) {
            int result2 = diagsMapper.insert(d);
        }

        return result;
    }
}
