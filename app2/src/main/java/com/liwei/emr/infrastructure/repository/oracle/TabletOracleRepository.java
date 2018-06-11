package com.liwei.emr.infrastructure.repository.oracle;

import com.liwei.emr.domain.repository.ITabletRepository;
import com.liwei.emr.infrastructure.dao.oracle.TabletMapper;
import com.liwei.emr.infrastructure.entity.oracle.Tablet;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @createdate 2017年9月23日
 */
@Repository
public class TabletOracleRepository implements ITabletRepository {

	@Resource
	TabletMapper TabletMapper;

	@Override
	public Tablet query(String clinic_no) {
		return TabletMapper.query(clinic_no);
	}

	@Override
	public List<Tablet> queryList(Tablet Tablet) {
		return TabletMapper.queryList(Tablet);
	}

	@Override
	public List<Tablet> queryPageList(Tablet Tablet, int start, int end) {
		return TabletMapper.queryPageList(Tablet,start,end);
	}

	@Override
	public int count(Tablet Tablet) {
		return TabletMapper.count(Tablet);
	}

	@Override
	public int insert(Tablet Tablet) {
		int result=TabletMapper.insert(Tablet);
		return result;
	}

	@Override
	public int update(Tablet Tablet) {
		int result= TabletMapper.update(Tablet);

		return result;
	}

	@Override
	public int delete(String clinic_no) {
		int result= TabletMapper.delete(clinic_no);
		return result;
	}


}
