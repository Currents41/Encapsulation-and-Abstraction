package pbo;

/**
 *
 * @author USER
 */
public class Mobil {
    String merk;
    String warna;
    int kecepatan = 0;
    
    public Mobil(String merk, String warna) {
        this.merk = merk;
        this.warna = warna;
    }
    
    public void start(){
        System.out.printf("Mobil %s berwarna %s sudah mulai jalan. \n", merk, warna);
    }
    
    public void  accerlerate(int tambahKecepatan) {
        kecepatan += tambahKecepatan;
        System.out.println("Kecepatan saat ini: " + kecepatan + "km/jam");
    }
    
    public void stop() {
        System.out.println("Mobil " + merk + " sudah berheti.");
        kecepatan = 0;
    }
    
    public static void main(String[] args) {
        Mobil avanza = new Mobil ("Avanza", "Hitam");
        avanza.start();
        avanza.accerlerate(30);
        avanza.stop();
    }
}
