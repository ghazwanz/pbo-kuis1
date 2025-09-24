import java.util.Scanner;

public class Kursus {
    Scanner sc = new Scanner(System.in);
    String namaKursus;
    int harga;

// Bagian INSTRUKTOR
    public void setNamaKursus(String namaKursus) {
        this.namaKursus = namaKursus;
    }
    public String getNamaKursus() {
        return namaKursus;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int getHarga() {
        return harga;
    }
//

// Menu Peserta & Instruktro
void infoKursus(){
    System.out.println("Kursus: "+namaKursus);
    System.out.println("Harga: "+harga);
    System.out.println();
}





// Menu Peserta
    public void menuKursus(){
        do {
            System.out.println("== Kursus ==");
            System.out.println("1. Matematika \n2. Fisika \n3. Informatika \n0. Back");
            System.out.print("Pilih Kursus: ");
            int pilihKursus = sc.nextInt();

            //ini nanti sepertinya pake fori, untuk 3 kursus ini
            switch (pilihKursus) {
                case 1:
                    setNamaKursus("Matematika");
                    // System.out.print("Set Harga: ");
                    // int harga = sc.nextInt();
                    setHarga(1000000);
                    infoKursus();
                    break;

                case 2:
                    setNamaKursus("Fisika");
                    // System.out.print("Set Harga: ");
                    // int harga = sc.nextInt();
                    setHarga(1000000);
                    infoKursus();
                    break;
                    
                case 3:
                    setNamaKursus("Informatika");
                    // System.out.print("Set Harga: ");
                    // int harga = sc.nextInt();
                    setHarga(1000000);
                    infoKursus();
                    break;

                case 0:
                    return;
                
                default:
                    System.out.println("pilih yang benar kocag");
            }
        } while (true);
    }
}