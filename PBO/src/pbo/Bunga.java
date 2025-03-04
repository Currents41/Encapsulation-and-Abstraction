package pbo;

/**
 *
 * @author USER
 */
public class Bunga {
    String namaBunga;
    String warna;
    int jumlahKelopak;
    boolean status; 
    
    public Bunga(String namaBunga, String warna, int jumlahKelopak, boolean status) {
        this.namaBunga = namaBunga;
        this.warna = warna;
        this.jumlahKelopak = jumlahKelopak;
        this.status = status;
    }
    
    public void displayingInfo(){
        System.out.println("Nama Bunga: " + namaBunga);
        System.out.println("Warna: " + warna);
        System.out.println("jumlah Kelopak: " + jumlahKelopak);
    }
    
    public void changeColor(String newColor){
         warna = newColor;
         System.out.println(namaBunga + " diubah warnanya menjadi " + newColor);
    }
    
    public void siramBunga(){
        System.out.println( namaBunga + " sedang disiram agar tetap segar!");
    }
    
    public void apakahMekar(boolean status){
         if(status){
             System.out.println(namaBunga + " sedang mekar!");
             System.out.println("******************************************");

         }else{
             System.out.println(namaBunga + " belum mekar!");
             System.out.println("******************************************");
         }
    }
    
    public static void main(String[] args) {
        Bunga Mawar = new Bunga ("Mawar", "Merah", 10,false);
        Mawar.displayingInfo();
        Mawar.changeColor("Putih");
        Mawar.siramBunga();
        Mawar.apakahMekar(false);
        
        Bunga Melati = new Bunga ("Melati", "Putih", 4,true);
        Melati.displayingInfo();
        Melati.changeColor("Putih");
        Melati.siramBunga();
        Melati.apakahMekar(true);
        
        Bunga Lily = new Bunga ("Lily", "Putih", 4,true);
        Lily.displayingInfo();
        Lily.changeColor("Pink");
        Lily.siramBunga();
        Lily.apakahMekar(true);
    }
}

