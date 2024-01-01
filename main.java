import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner masuktotal=new Scanner (System.in);
        int paket = 0;
        int reguler = 15000, premium = 25000, vip = 100000;
        int gold= 150000, silver=200000;
        int harga, diskon, waktu, uang, kembali;
        int metode;
        int bank, ovo, gopay, dana, cash;

        System.out.println("=========================================");
        System.out.println("|| SELAMAT DATANG DI Pan's BARBERSHOP ||");
        System.out.println("=========================================");
        System.out.println();
        System.out.println("DAPATKAN DISKON 30% UNTUK POTONGP PERTAMA KALI DI Pan's BARBERSHOP!!!");
        System.out.println();
        System.out.println("DAFTAR HARGA PAKET POTONG DI HOTMAN BARBERSHOP \n1. Reguler = Rp.35.000,-\n2. Premium = Rp.75.000,-\n3. VIP = Rp.100.000,-" +
                "\n4. Gold = Rp.150.000, -\n5. Silver = Rp.200.000, -");

        System.out.print("Masukan Paket yang akan dipilih = ");
        paket = masuktotal.nextInt();

        switch (paket){
            case 1: System.out.println("Anda akan memesan paket nomor " +paket);
                System.out.println();
                System.out.print("Silahkan Masukan Berapa Paket yang anda pilih = ");
                waktu = masuktotal.nextInt();
                harga = waktu*15000;
                System.out.println("Harga = Rp."+harga+",-");
                if(waktu>=4){
                    diskon=((harga*15)/100);
                    System.out.println("diskon = Rp."+diskon+",-");
                    harga = (harga-diskon);
                    System.out.println("Total harga = Rp."+harga+",-");
                }
                System.out.println("Pilih Metode Pemabayaran");
                System.out.println("1. Bank");
                System.out.println("2. Dana");
                System.out.println("3. Gopay");
                System.out.println("4. Cash");
                System.out.print    ("Masukan Metode Pembayaran yang dipilih = " );
                metode = masuktotal.nextInt();
                System.out.println("Pilihan anda adalah " +paket);
                System.out.print("Masukan Uang yang diberikan Rp.");
                uang = masuktotal.nextInt();
                kembali=(uang-harga);
                System.out.println("Kembalian Anda = Rp."+kembali+",-");
                System.out.println();
                System.out.println("TerimaKasih Atas Pemesanan Anda");
                break;

            case 2: System.out.println("Anda akan memesan paket nomor " +paket);
                System.out.println();
                System.out.print("Silahkan Masukan berapa paket yang anda pilih = ");
                waktu = masuktotal.nextInt();
                harga = waktu*25000;
                System.out.println("Harga = Rp."+harga+",-");
                if(waktu>=4){
                    diskon=((harga*15)/100);
                    System.out.println("diskon = Rp."+diskon+",-");
                    harga = (harga-diskon);
                    System.out.println("Total harga = Rp."+harga+",-");
                }
                System.out.println("Pilih Metode Pemabayaran");
                System.out.println("1. Bank");
                System.out.println("2. Dana");
                System.out.println("3. Gopay");
                System.out.println("4. Cash");
                System.out.println("Masukan Metode Pembayaran yang dipilih : ");
                metode = masuktotal.nextInt();
                System.out.println("Pilihan anda adalah " +paket);
                System.out.print("Masukan Uang yang diberikan Rp.");
                uang = masuktotal.nextInt();
                kembali=(uang-harga);
                System.out.println("Kembalian Anda = Rp."+kembali+",-");
                System.out.println();
                System.out.println("TerimaKasih Atas Pemesanan Anda");
                break;

            case 3:
                System.out.println("Anda akan memesan kamar Kelas " +paket);
                System.out.println();
                System.out.print("Silahkan Masukan Berapa Paket Yang Anda Pilih = ");
                waktu = masuktotal.nextInt();
                harga = waktu*100000;
                System.out.println("Harga = Rp."+harga+",-");
                if(waktu>=4){
                    diskon=((harga*15)/100);
                    System.out.println("diskon = Rp."+diskon+",-");
                    harga = (harga-diskon);
                    System.out.println("Total harga = Rp."+harga+",-");
                }
                System.out.println("Pilih Metode Pemabayaran");
                System.out.println("1. Bank");
                System.out.println("2. Dana");
                System.out.println("3. Gopay");
                System.out.println("4. Cash");
                System.out.print("Masukan Metode Pembayaran yang dipilih : ");
                metode = masuktotal.nextInt();
                System.out.println("Pilihan anda adalah " +paket);
                System.out.print("Masukan Uang yang diberikan Rp.");
                uang = masuktotal.nextInt();
                kembali=(uang-harga);
                System.out.println("Kembalian Anda = Rp."+kembali+",-");
                System.out.println();
                System.out.println("TerimaKasih Atas Pemesanan Anda");
                break;

            case 4: System.out.println("Anda akan memesan paket nomor " +paket);
                System.out.println();
                System.out.print("Silahkan Masukan Berapa Paket yang anda pilih = ");
                waktu = masuktotal.nextInt();
                harga = waktu*150000;
                System.out.println("Harga = Rp."+harga+",-");
                if(waktu>=4){
                    diskon=((harga*15)/100);
                    System.out.println("diskon = Rp."+diskon+",-");
                    harga = (harga-diskon);
                    System.out.println("Total harga = Rp."+harga+",-");
                }
                System.out.println("Pilih Metode Pemabayaran");
                System.out.println("1. Bank");
                System.out.println("2. Dana");
                System.out.println("3. Gopay");
                System.out.println("4. Cash");
                System.out.print("Masukan Metode Pembayaran yang dipilih = " );
                metode = masuktotal.nextInt();
                System.out.println("Pilihan anda adalah = " +paket);
                System.out.print("Masukan Uang yang diberikan Rp.");
                uang = masuktotal.nextInt();
                kembali=(uang-harga);
                System.out.println("Kembalian Anda = Rp."+kembali+",-");
                System.out.println();
                System.out.println("TerimaKasih Atas Pemesanan Anda");
                break;

            case 5: System.out.println("Anda akan memesan paket nomor " +paket);
                System.out.println();
                System.out.print("Silahkan Masukan Berapa Paket yang anda pilih = ");
                waktu = masuktotal.nextInt();
                harga = waktu*200000;
                System.out.println("Harga = Rp."+harga+",-");
                if(waktu>=4){
                    diskon=((harga*15)/100);
                    System.out.println("diskon = Rp."+diskon+",-");
                    harga = (harga-diskon);
                    System.out.println("Total harga = Rp."+harga+",-");
                }
                System.out.println("Pilih Metode Pemabayaran");
                System.out.println("1. Bank");
                System.out.println("2. Dana");
                System.out.println("3. Gopay");
                System.out.println("4. Cash");
                System.out.print("Masukan Metode Pembayaran yang dipilih = " );
                metode = masuktotal.nextInt();
                System.out.println("Pilihan anda adalah = " +paket);
                System.out.print("Masukan Uang yang diberikan Rp.");
                uang = masuktotal.nextInt();
                kembali=(uang-harga);
                System.out.println("Kembalian Anda = Rp."+kembali+",-");
                System.out.println();
                System.out.println("TerimaKasih Atas Pemesanan Anda");
                break;
        }
    }
}
