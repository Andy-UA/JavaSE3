package sql;

import main.Connect;
import main.DAO;
import obj.Pharmacy;


/**
 * Created by Andrew on 08.03.2017.
 */
public class PharmacyQuery implements DAO{

    @Override
    public boolean insert(Object object){
        String query = String.format("INSERT INTO PHARMACY VALUES (%d, '%s', '%s')",
                ((Pharmacy) object).getPharmacyID(), ((Pharmacy) object).getName(), ((Pharmacy) object).getOwner());
        return Connect.initConnect(query);
    }

    @Override
    public boolean update(Object object, String newName) {
        String query = String.format("UPDATE PHARMACY SET NAME = '%s' WHERE PHARMACYID = %d",
                newName, ((Pharmacy) object).getPharmacyID());
        return Connect.initConnect(query);
    }

    @Override
    public boolean delete(Object object) {
        String query = String.format("DELETE FROM PATIENT WHERE PHARMACYID = %d",
                ((Pharmacy) object).getPharmacyID());
        return Connect.initConnect(query);
    }
}
