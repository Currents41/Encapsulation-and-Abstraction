package Quiz;

public class AkunBank {
        double saldo;

    // Konstruktor AkunBank
    public AkunBank(double saldo) {
        this.saldo = saldo;
    }
}

class AkunTabungan extends AkunBank {
    double bunga;

    // Konstruktor AkunTabungan
    public AkunTabungan(double saldo, double bunga) {
        super(saldo);
        this.bunga = bunga;
    }

    // Metode untuk menghitung bunga yang diperoleh
    public double hitungBunga() {
        return saldo * bunga / 100;
    }
    
    public static void main(String[] args) {
        // Soal 3: Membuat objek AkunTabungan dan menghitung bunga
        AkunTabungan akun1 = new AkunTabungan(1000000, 5);
        System.out.println("Bunga yang diperoleh: " + akun1.hitungBunga());
    }
}
