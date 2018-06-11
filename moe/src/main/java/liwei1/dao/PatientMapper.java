package liwei1.dao;

import java.util.List;
import liwei1.model.Patient;

public interface PatientMapper {
    int deleteByPrimaryKey(String clinicNo);

    int insert(Patient record);

    Patient selectByPrimaryKey(String clinicNo);

    List<Patient> selectAll();

    int updateByPrimaryKey(Patient record);
}