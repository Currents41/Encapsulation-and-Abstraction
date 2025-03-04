package Quiz;

public class Hewan {
    String nama;
    int umur;

    // Konstruktor Hewan
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Metode berbicara
    public void berbicara() {
        System.out.println("Suara hewan");
    }
}
class Anjing extends Hewan {
    public Anjing(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    public void berbicara() {
        System.out.println("Guk guk");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(nama + " telah dihapus.");
        super.finalize();
    }

    public static void main(String[] args) {
        Anjing anjing1 = new Anjing("Buddy", 3);
//        anjing1.berbicara();
        // Menghapus objek anjing untuk memicu destruktor
        anjing1 = null;
        System.gc(); // Meminta Garbage Collector menjalankan destruktor
    }
}
 
