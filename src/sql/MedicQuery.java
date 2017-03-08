package sql;

import main.Connect;
import main.DAO;
import obj.Medic;

/**
 * Created by Andrew on 08.03.2017.
 */
public class MedicQuery implements DAO {

    @Override
    public boolean insert(Object object){
        String query = String.format("INSERT INTO MEDIC VALUES (%d, '%s', %d)",
                ((Medic) object).getMedicID(), ((Medic) object).getName(), ((Medic) object).getLicenseNumber());
        return Connect.initConnect(query);
    }

    @Override
    public boolean update(Object object, String newName) {
        String query = String.format("UPDATE MEDIC SET NAME = '%s' WHERE MEDICID = %d",
                newName, ((Medic) object).getMedicID());
        return Connect.initConnect(query);
    }

    @Override
    public boolean delete(Object object) {
        String query = String.format("DELETE FROM MEDIC WHERE MEDICID = %d",
                ((Medic) object).getMedicID());
        return Connect.initConnect(query);
    }
}
