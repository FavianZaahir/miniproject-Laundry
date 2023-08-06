
package laundry;
import java.util.ArrayList;

public class Petugas implements User{
    private ArrayList<String> name = new ArrayList<String>();
    private ArrayList<String> address = new ArrayList<String>();
    private ArrayList<String> telephone = new ArrayList<String>();
    private ArrayList<Integer> position = new ArrayList<Integer>();

    Petugas (){
        this.name.add("Om Jalal");
        this.address.add("Ngalam");
        this.telephone.add("08123456780");
        this.position.add(0);
    }

    public void setName(String name) {
        this.name.add(name);
    }
    public void setAddress(String adrress) {
        this.address.add(adrress);
    }
    public void setTelephone(String telephone) {
        this.telephone.add(telephone);
    }

    public String getName(int idPetugas) {
        return this.name.get(idPetugas);}
    public String getAddress(int idPetugas) {
        return this.address.get(idPetugas);
    }
    public String getTelephone(int idPetugas) {
        return this.telephone.get(idPetugas);
    }
    public int getPetugas(){
        return this.name.size();
    } 
}
