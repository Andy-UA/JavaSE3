package obj;

/**
 * Created by Andrew on 08.03.2017.
 */
public class OrderDrug {

    private int orderDrugID;
    private int PatientID;
    private int drugsID;
    private int medicID;
    private int pharmacyID;
    private int totalCost;

    public OrderDrug(int orderDrugID, int patientID, int drugsID, int medicID, int pharmacyID, int totalCost) {
        this.orderDrugID = orderDrugID;
        PatientID = patientID;
        this.drugsID = drugsID;
        this.medicID = medicID;
        this.pharmacyID = pharmacyID;
        this.totalCost = totalCost;
    }

    public int getOrderDrugID() {
        return orderDrugID;
    }

    public void setOrderDrugID(int orderDrugID) {
        this.orderDrugID = orderDrugID;
    }

    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int patientID) {
        PatientID = patientID;
    }

    public int getDrugsID() {
        return drugsID;
    }

    public void setDrugsID(int drugsID) {
        this.drugsID = drugsID;
    }

    public int getMedicID() {
        return medicID;
    }

    public void setMedicID(int medicID) {
        this.medicID = medicID;
    }

    public int getPharmacyID() {
        return pharmacyID;
    }

    public void setPharmacyID(int pharmacyID) {
        this.pharmacyID = pharmacyID;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }
}
