import java.util.Scanner;

public class DemoSoftware {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        
        do {
            System.out.println("== LOGIN USER ==");
            System.out.println("1. Murid \n2. Instruktur \n0. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    menuMurid();
                    break;
                case 2:
                    menuInstrukur();
                    break;
                case 0:
                    System.out.println("Bye!");

                    return;
            
                default:
                    System.out.println("Pilih yang bener Kocag!\n");

            }
        } while (true);

    }

    static void menuMurid(){
        int harga = 0;
        int pembayaran = 0;
        
        do {
            System.out.println("== Kursus ==");
            System.out.println("1. Matematika \n2. Fisika \n3. Informatika \n0. Back");
            System.out.print("Pilih Kursus: ");
            int pilihKursus = sc.nextInt();
            switch (pilihKursus) {
                case 1:
                    System.out.println("Matematika");
                    pembayaran += harga;
                    break;
                case 2:
                    System.out.println("Fisika");
                    pembayaran += harga;
                    break;
                case 3:
                    System.out.println("Informatika");
                    pembayaran += harga;
                    break;
                case 0:
                    return;
                
                default:
                    System.out.println("pilih yang benar kocag");
            }
        } while (true);
    }

    static void menuInstrukur(){

    }
}


