
package laundry;
import java.util.ArrayList;
import java.util.Scanner;

public class JenisLaundry extends Petugas {
    private ArrayList<String> type = new ArrayList<String>();
    private ArrayList<Integer> price = new ArrayList<Integer>();
    private ArrayList<Integer> duration = new ArrayList<Integer>();
    Scanner input = new Scanner(System.in);

    public JenisLaundry() {
        addType("Cuci",7000,30);
        addType("Cuci -> Setrika",15000,120);
    }

    public void addType(String type, int price, int duration){
        setType(type);
        setPrice(price);
        setDuration(duration);
    }

    public void addLaundry(Petugas officer, int indexOfficer, int code){
        System.out.println("\n========== Pesan Laundry Baru ==========");
        System.out.print("Tipe Laundry baru     : ");
        String laundry = input.nextLine();
        this.type.add(laundry);
        System.out.print("Harga dari Laundry baru         : ");
        int harga = input.nextInt();
        this.price.add(harga);
        System.out.print("Durasi dari Laundry baru        : ");
        int durasi = input.nextInt();
        this.duration.add(durasi);
    }

    public void setType (String type){
        this.type.add(type);
    }
    public void setPrice (int price){
        this.price.add(price);
    }
    public void setDuration (int duration){
        this.duration.add(duration);
    }

    public String getType(int idType){
        return this.type.get(idType);
    }
    public int getPrice (int idType){
        return this.price.get(idType);
    }
    public int getDuration (int idType){
        return this.duration.get(idType);
    }

    public int getType(){
        return this.type.size();
    }
}
