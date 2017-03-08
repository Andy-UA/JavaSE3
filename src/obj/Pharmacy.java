package obj;

/**
 * Created by Andrew on 08.03.2017.
 */
public class Pharmacy {

    private int pharmacyID;
    private String Name;
    private String owner;

    public Pharmacy(int pharmacyID, String name, String owner) {
        this.pharmacyID = pharmacyID;
        Name = name;
        this.owner = owner;
    }

    public int getPharmacyID() {
        return pharmacyID;
    }

    public void setPharmacyID(int pharmacyID) {
        this.pharmacyID = pharmacyID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
