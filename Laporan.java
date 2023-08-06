
package laundry;
public class Laporan {
    public void Laporan(Client client){
        int x = client.getClient();

        System.out.println("\n========== Info Client ==========\n");
        for(int i=0;i < x;i++){
            System.out.println("Yang Terhormat Bapak/Ibu : "+client.getName(i) +
                    "\nDengan Alamat            : " + client.getAddress(i) +
                    "\nNomor Telp.              : " + client.getTelephone(i));
        }
    }

    public void report(JenisLaundry type){
        int x =  type.getType();

        System.out.println("\n========== Info Laundry ==========\n");
        for(int i=0;i < x;i++){
            System.out.println("Jenis                   : " + type.getType(i) +
                               "\nHarga                   : " + type.getPrice(i) +
                               " Rupiah\nDurasi                  : " + type.getDuration(i) +
                               " Menit");
            System.out.println("--------------------------------------------------");
        }
    }

    public void report(Petugas name){
        int i = 0;                                                            
        System.out.println("--------------------------------------------------");
        System.out.print("\nPETUGAS : ");
            System.out.println("\t" + name.getName(i));
            System.out.println("\t\t" + name.getAddress(i));
            System.out.println("\t\t" + name.getTelephone(i));
        System.out.println("--------------------------------------------------");
        System.out.println("\n ------- TERIMA KASIH TELAH BERKUNJUNG ------- \n\n\n");
}
}
