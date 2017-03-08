package sql;

import main.Connect;
import main.DAO;
import obj.Patient;

/**
 * Created by Andrew on 08.03.2017.
 */
public class PatientQuery implements DAO{

    @Override
    public boolean insert(Object object){
        String query = String.format("INSERT INTO PATIENT VALUES (%d, '%s', '%s')",
                ((Patient) object).getPatientID(), ((Patient) object).getName(), ((Patient) object).getAddress());
        return Connect.initConnect(query);
    }

    @Override
    public boolean update(Object object, String newName) {
        String query = String.format("UPDATE PATIENT SET NAME = '%s' WHERE PATIENTID = %d",
                newName, ((Patient) object).getPatientID());
        return Connect.initConnect(query);
    }

    @Override
    public boolean delete(Object object) {
        String query = String.format("DELETE FROM PATIENT WHERE PATIENTID = %d",
                ((Patient) object).getPatientID());
        return Connect.initConnect(query);
    }
}
