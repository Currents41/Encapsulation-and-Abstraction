package Quiz;

public class Kendaraan {
    String merek;
    int tahunPembuatan;
    
public Kendaraan(String merek, int tahunPembuatan) {
    this.merek = merek;
    this.tahunPembuatan = tahunPembuatan;
    }
}

class Mobil extends Kendaraan {
    int jumlahPintu;

    // Konstruktor Mobil (menggunakan super untuk memanggil konstruktor Kendaraan)
    public Mobil(String merek, int tahunPembuatan, int jumlahPintu) {
        super(merek, tahunPembuatan);
        this.jumlahPintu = jumlahPintu;
    }

    // Metode untuk menampilkan informasi mobil
    public String getInfoMobil() {
        return "Merek: " + merek + ", Tahun: " + tahunPembuatan + ", Jumlah Pintu: " + jumlahPintu;
    }

    public static void main(String[] args) {
        // Soal 1: Membuat objek Mobil dan menampilkan informasi
        Mobil mobil1 = new Mobil("Toyota", 2020, 4);
        System.out.println(mobil1.getInfoMobil());
    }
}