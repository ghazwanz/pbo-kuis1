package DEMO;
import java.util.ArrayList;
import java.util.List;

public class Instruktur extends User {
    private List<Kursus> kursusDikelola;

    public Instruktur(String id, String name, String email) {
        super(id, name, email);
        this.kursusDikelola = new ArrayList<>();
    }

    public void tambahKursus(Kursus kursus) {
        kursusDikelola.add(kursus);
        System.out.println("Instruktur " + getName() + " berhasil membuat kursus: " + kursus.getNamaKursus());
    }

    public List<Kursus> getKursusDikelola() {
        return kursusDikelola;
    }

    public void infoInstruktur() {
        super.infoUser();
        System.out.println("Kursus yang dikelola:");
        for (Kursus k : kursusDikelola) {
            System.out.println("  - " + k.getNamaKursus());
        }
    }
}