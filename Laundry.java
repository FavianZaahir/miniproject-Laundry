package laundry;
import java.util.Scanner;
public class Laundry {
    public static void main(String[] args) {
        boolean progress = true;
        Transaksi transaksi = new Transaksi();
        JenisLaundry type = new JenisLaundry();
        Client client = new Client();
        Petugas petugas = new Petugas();
        Laporan report = new Laporan();
        Petugas name = new Petugas();

while (progress) {
            System.out.println("\n========== Tampilan Aplikasi ==========");
            Scanner input = new Scanner(System.in);
            System.out.println("1. Pelanggan");
            System.out.println("2. Exit");
            System.out.print("Masuk sebagai : ");
            int choice = input.nextInt();

            try {
                if (choice == 1) {
                    report.report(type);
                    transaksi.prosesInputTransaksi();
                    transaksi.prosesTransaksi(client, type);
                    report.report(name);
                    

                }

                else if (choice == 2) {
                    progress = false;

                } else if ( choice > 3){
                    System.out.println("Maaf kami belum tersedia");
                }

            } catch (Exception e) {
                System.out.println("Terdpat Exception!!\n Info : " + e.getMessage());
            }
        }
    }
    }
