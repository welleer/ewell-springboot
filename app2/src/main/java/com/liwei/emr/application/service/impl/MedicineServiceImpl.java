package com.liwei.emr.application.service.impl;

import com.liwei.emr.application.service.IMedicineService;
import com.liwei.emr.domain.repository.IMedicineRepository;
import com.liwei.emr.domain.repository.ITabletRepository;
import com.liwei.emr.infrastructure.entity.oracle.Medicine;
import com.liwei.emr.infrastructure.entity.oracle.Tablet;
import com.liwei.emr.infrastructure.entity.oracle.Medicine;
import com.liwei.emr.infrastructure.entity.oracle.Tablet;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class MedicineServiceImpl implements IMedicineService {

    @Autowired
    IMedicineRepository MedicineRepository;
    @Autowired
    ITabletRepository tabletRepository;


    @Override
    public List<Map<String,Object>> queryByNameLikeAs(String keyword) {
        List<Map<String,Object>> resList = new ArrayList<>();
        List<Medicine> list = MedicineRepository.queryListByName(keyword);
        for(Medicine m : list){
            Map<String,Object> temp = new HashMap<>();
            temp.put("drugname",m.getDrug_name());
            temp.put("alias",m.getAlias());
            temp.put("therapeuticclass",m.getTherapeutic_class());
            String[] t_str = m.getTablet_ids().split(",");
            if(t_str.length > 0){
                List<Map<String,Object>> tempList = new ArrayList<>();
                for(String s : t_str){
                    Tablet tablet = tabletRepository.query(s);
                    Map<String,Object> t = new HashMap<>();
                    t.put("tablet_id",tablet.getTablet_id());
                    t.put("intro",tablet.getIntro());
                    t.put("dose",tablet.getDose());
                    t.put("route",tablet.getRoute());
                    t.put("freq",tablet.getFreq());
                    tempList.add(t);
                }
                temp.put("tablet",tempList);
            }
            resList.add(temp);
        }
        return resList;
    }
}
