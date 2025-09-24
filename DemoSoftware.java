import java.util.Scanner;

public class DemoSoftware {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Kursus menu = new Kursus();
        int pilihan;
        
        do {
            System.out.println("== LOGIN USER ==");
            System.out.println("1. Murid \n2. Instruktur \n0. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    menu.menuKursus();
                    break;
                case 2:
                    // menu.menuInstrukur();
                    break;
                case 0:
                    System.out.println("Bye!");

                    return;
            
                default:
                    System.out.println("Pilih yang bener Kocag!\n");

            }
        } while (true);

    }
}


