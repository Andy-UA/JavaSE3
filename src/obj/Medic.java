package obj;

/**
 * Created by Andrew on 08.03.2017.
 */
public class Medic {

    private int medicID;
    private String Name;
    private int licenseNumber;

    public Medic(int medicID, String name, int licenseNumber) {
        this.medicID = medicID;
        Name = name;
        this.licenseNumber = licenseNumber;
    }

    public int getMedicID() {
        return medicID;
    }

    public void setMedicID(int medicID) {
        this.medicID = medicID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
}
