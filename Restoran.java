import java.util.*;

class Menu {
    private String nama;
    private int harga;

    Menu (String nama, int harga){
        this.nama = nama;
        this.harga = harga;
        System.out.println("Objek " + this.nama + " Running..");
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getHarga(){
        return harga;
    }
    public String getNama(){
        return nama;
    }

    public String ToString () {
        return nama + "\t[" + harga + "]";
    }
}                     /*Mendefinisikan kelas Menu dan beberapa atribut dan metodenya seperti constructor, getter, dan setter.*/
class Makanan extends Menu{
    Makanan (String nama, int harga){
        super (nama, harga);
    }
}      /*Membuat subclass Makanan dan Minuman yang merupakan turunan dari kelas Menu*/
class Minuman extends Menu {
    Minuman (String nama, int harga){
        super (nama, harga);
    }
}     /*Membuat subclass Makanan dan Minuman yang merupakan turunan dari kelas Menu*/
class Pelanggan{
    private String nama;
    Pelanggan (String nama){
        this.nama= nama;
        System.out.println("Object "+ this.nama + "Running..");
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    public String ToString(){
        return "Pembeli : " + this.nama;
    }
}                 /*Membuat kelas Pelanggan dengan atribut dan metodenya seperti constructor, getter, dan setter.*/
class Owner {}                       /*Membuat beberapa kelas kosong Owner, Admin, dan Kasir.*/
class Admin{}                        /*Membuat beberapa kelas kosong Owner, Admin, dan Kasir.*/
class Kasir{}                        /*Membuat beberapa kelas kosong Owner, Admin, dan Kasir.*/


public class Restoran {                                                             /*Membuat kelas Restoran yang berisi method main.*/
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);                                       /*Membuat objek scanner untuk menerima input dari pengguna.*/
        System.out.println("Oleh : ");                                              /*Menampilkan identitas pembuat program pada output*/
        System.out.println("1. Dias Norman (22082010134)");                         /*Menampilkan identitas pembuat program pada output*/
        System.out.println("2. Krisna Eko Prasetyo (22082010149)");                  /*Menampilkan identitas pembuat program pada output*/
        System.out.println("3. Hisyam Abiyansah G. (22082010161)");                  /*Menampilkan identitas pembuat program pada output*/
        System.out.println("4. M. Farhan Hidayatulloh (22082010141)");               /*Menampilkan identitas pembuat program pada output*/
        int pilihOperasi = 0;
        do {                                                                        //Membuat perulangan do-while untuk menampilkan menu utama dan meminta user untuk memilih operasi.
            System.out.println();
            System.out.println("=====RESTORAN SEAFOOD=====");
            for (int i = 0; i < operasi.length; i++) {                               //Menampilkan menu operasi menggunakan perulangan for dan array.
                System.out.println((i + 1) + ". " + operasi[i]);
            }
            System.out.println("4. Exit");
            System.out.print("pilih operasi : ");
            pilihOperasi = scn.nextInt();
            switch (pilihOperasi) {                                                   //Membuat menu operasi dan switch case untuk setiap opsi yang dipilih
                                                                                      // oleh pengguna pada kelas Owner, Admin, dan Kasir.
                case 1:
                    int pilihOwner = 0;
                    do {                                                              // Membuat perulangan do-while pada setiap operasi yang dipilih oleh pengguna
                        System.out.println();
                        System.out.println("SELAMAT DATANG OWNER");
                        System.out.println("1. Laporan penjualan\n2. Data menu terfavorit\n3. Exit");
                        System.out.print("Pilih : ");
                        pilihOwner = scn.nextInt();
                        switch (pilihOwner) {                                                  // dengan menggunakan percabangan switch case
                            case 1:                                                            // isi program yang akan dijalankan sesuai dengan apa
                                System.out.println("===DATA LAPORAN PENJUALAN===");            // yang akan dipilih oleh user dan akan menjalankan suatu
                                break;                                                         // perintah tertentu
                            case 2:
                                System.out.println("===DATA MENU TERFAVORIT===");
                                break;
                            case 3:
                                System.out.println("TERIMAKASIH OWNER");                        //Menampilkan pesan terimakasih pada setiap kelas dan perulangan.
                        }
                    } while (pilihOwner != 3);
                    break;

                case 2:
                    int pilihAdmin = 0;
                    do {
                        System.out.println();
                        System.out.println("SELAMAT DATANG ADMIN");
                        System.out.println("1. Lihat Menu\n2. Tambah Menu\n3. Ubah Menu\n4. Hapus Menu\n5. Exit");
                        System.out.print("Pilih : ");
                        pilihAdmin = scn.nextInt();
                        switch (pilihAdmin) {                                                // dengan menggunakan percabangan switch case
                            case 1:                                                          // isi program yang akan dijalankan sesuai dengan apa
                                System.out.println("--DATA MENU--");                         // yang akan dipilih oleh user dan akan menjalankan suatu
                                break;                                                       // perintah tertentu
                            case 2:
                                System.out.println();

                                break;
                            case 3:
                                System.out.println();
                                break;
                            case 4:
                                System.out.println();
                                break;
                            case 5:
                                System.out.println("TERIMAKASIH ADMIN!");                     //Menampilkan pesan terimakasih pada setiap kelas dan perulangan.
                        }
                    } while (pilihAdmin != 5);
                    break;
                case 3:
                    int pilihKasir = 0;
                    do {
                        System.out.println();
                        System.out.println("SELAMAT DATANG KASIR");
                        System.out.println("1. Layani Pesanan\n2. Pembayaran\n3. Exit");
                        System.out.print("Pilih : ");
                        pilihKasir = scn.nextInt();
                        switch (pilihKasir) {
                            case 1:
                                System.out.println();
                                System.out.println("== LAYANI PESANAN ==");                          //dengan menggunakan percabangan switch case
                                break;                                                               // isi program yang akan dijalankan sesuai dengan apa
                            case 2:                                                                  // yang akan dipilih oleh user dan akan menjalankan suatu
                                System.out.println("== LAYANAN PEMBAYARAN ==");                      // perintah tertentu
                                break;
                            case 3:
                                System.out.println("TERIMAKASIH KASIR!");                            //Menampilkan pesan terimakasih pada setiap kelas dan perulangan.

                        }

                    } while (pilihKasir != 3);
             }


        }while(pilihOperasi != 4);
        System.out.println("TERIMAKASIH!");                                                     //Menampilkan pesan terimakasih pada output setelah pengguna memilih untuk keluar dari program
    }



    static String[] operasi = {"Owner", "Admin", "Kasir"};                                      // menyimpan data array yang akan dipanggil nantinya

}