
package laundry;

import java.util.ArrayList;

public class Client implements User{
    private ArrayList<String> name = new ArrayList<String>();
    private ArrayList<String> address = new ArrayList<String>();
    private ArrayList<String> telephone = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public Client() {
        addClient("Muhammad Favian","Jln Tumbal Negara no 81","08117212007");
        addClient("Naura Fania Zaahir","Jln Palazzo Raya no. 50","08134567890");
        addClient("Muhammad Al Ghazali Zuhdi","Jln Oja Selatan no. 69","08123456709");
        
    }

    public void addClient(String name, String address, String telephone){
        setName(name);
        setAddress(address);
        setTelephone(telephone);
    }

    public void setName (String name){
        this.name.add(name);
    }
    public void setAddress (String address){
        this.address.add(address);
    }
    public void setTelephone (String telephone){
        this.telephone.add(telephone);
    }

    public String getName(int idClient){
        return this.name.get(idClient);
    }
    public String getAddress (int idClient){
        return this.address.get(idClient);
    }
    public String getTelephone (int idClient){
        return this.telephone.get(idClient);
    }
    public int getClient(){
        return this.name.size();
    }

    public int getSaldo(){
        return this.saldo.size();
    }
}
