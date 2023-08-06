
package laundry;
import java.util.ArrayList;
import java.util.Scanner;

public class Transaksi extends Client{
    private ArrayList<Integer> idClient = new ArrayList<Integer>();
    private ArrayList<Integer> idType = new ArrayList<Integer>();
    private ArrayList<Integer> many = new ArrayList<Integer>();

    int globalTemp = 0;
    int hasil = 0;
    int saldo = getSaldo();

    Scanner input = new Scanner(System.in);

    public void prosesInputTransaksi() {
        System.out.print("ID Client     : ");
        int idTemp = input.nextInt();
        idTemp -= 1;
        System.out.print("Jenis Laundry : ");
        int jenisTemp = input.nextInt();
        jenisTemp -= 1;
        System.out.print("Berat laundry : ");
        int beratTemp = input.nextInt();
        System.out.print("Saldo anda    : ");
        saldo = input.nextInt();
        this.idClient.add(idTemp);
        this.idType.add(jenisTemp);
        this.many.add(beratTemp);
    }

    public void prosesTransaksi(Client client, JenisLaundry type) {
        System.out.println("\n========== Nota ==========");
        System.out.println("Yang Terhormat Bapak/Ibu : " + client.getName(idClient.get(0)) +
                "\nDengan Alamat            : " + client.getAddress(idClient.get(0)) +
                "\nNomor Telp.              : " + client.getTelephone(idClient.get(0)) +
                "\nSaldo Anda               : " + saldo);
        System.out.println("Mengambil Jenis          : " + type.getType(idType.get(0)) +
                "\nDengan Harga             : " + (type.getPrice(idType.get(0)) * this.many.get(0)) +
                " Rupiah\nDurasi                   : " + (type.getDuration(idType.get(0)) * this.many.get(0)) + " Menit");
        globalTemp = (type.getPrice(idType.get(0)) * this.many.get(0));
        hasil = saldo - globalTemp;
 
        if (hasil >= 0) {
            System.out.println("--------------------------------------------------");
            System.out.println("\nSaldo Anda Menjadi       : " +hasil);
        }

        if (hasil < 0 ) {
            System.out.println("--------------------------------------------------");
            System.out.println("Yang Terhormat Bapak/Ibu : " + client.getName(idClient.get(0)) +
                    "\nMohon maaf saldo anda Tidak Cukup" );
        }
    }
}