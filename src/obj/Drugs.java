package obj;

/**
 * Created by Andrew on 06.03.2017.
 */
public class Drugs {

    public int drugsID;
    public String name;
    public int barcode;

    public Drugs(){

    }

    public Drugs(int drugsID, String name, int barcode) {
        this.drugsID = drugsID;
        this.name = name;
        this.barcode = barcode;
    }

    public int getDrugsID() {
        return drugsID;
    }

    public void setDrugsID(int drugsID) {
        this.drugsID = drugsID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }
}
