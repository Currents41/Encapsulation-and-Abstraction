package pbo;

class Hewan {
    String nama;
    String jenis;
    String suara;
    
    void TampilkanInfo() {
        System.out.println("Nama :" + nama);
        System.out.println("Jenis :" + jenis);
    }    
    void Bersuara(){
        System.out.println(nama + " Bersuara :" +suara);       
    }

public static void main(String[] args) {
        Hewan Hewan1 = new Hewan();
                
        Hewan1.nama = "Kucing";
        Hewan1.jenis = "Mamalia";
        Hewan1.suara = "Meow";
        
        Hewan Hewan2= new Hewan();
                
        Hewan2.nama = "Bebek";
        Hewan2.jenis = "Unggas";
        Hewan2.suara = "wek wek wek";
        
        System.out.println("Tampilkan info Hewan 1:");
        Hewan1.TampilkanInfo();
        Hewan1.Bersuara();
        
        System.out.println(" ");
        
        System.out.println("Tampilkan info Hewan 2:");
        Hewan2.TampilkanInfo();
        Hewan2.Bersuara();
    }
}


 
