package obj;

/**
 * Created by Andrew on 08.03.2017.
 */
public class Patient {

    private int patientID;
    private String Name;
    private String address;

    public Patient(int patientID, String name, String address) {
        this.patientID = patientID;
        Name = name;
        this.address = address;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
