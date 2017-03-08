package sql;

import main.*;
import obj.*;


/**
 * Created by Andrew on 06.03.2017.
 */
public class DrugsQuery implements DAO {

    @Override
    public boolean insert(Object object){
        String query = String.format("INSERT INTO DRUGS VALUES (%d, '%s', %d)",
        ((Drugs) object).getDrugsID(), ((Drugs) object).getName(), ((Drugs) object).getBarcode());
        return Connect.initConnect(query);
    }

    @Override
    public boolean update(Object object, String newName) {
        String query = String.format("UPDATE DRUGS SET NAME = '%s' WHERE DrugsID = %d",
                newName, ((Drugs) object).getDrugsID());
        return Connect.initConnect(query);
    }

    @Override
    public boolean delete(Object object) {
        String query = String.format("DELETE FROM DRUGS WHERE DRUGSID = %d",
                ((Drugs) object).getDrugsID());
        return Connect.initConnect(query);
    }
}
