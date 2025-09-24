package DEMO;
import java.util.ArrayList;
import java.util.List;

public class Peserta extends User {
    private List<Kursus> kursusDiambil;

    public Peserta(String id, String name, String email) {
        super(id, name, email);
        this.kursusDiambil = new ArrayList<>();
    }

    public void daftarKursus(Kursus kursus) {
        kursusDiambil.add(kursus);
        System.out.println(getName() + " berhasil mendaftar kursus " + kursus.getNamaKursus());
    }

    public List<Kursus> getKursusDiambil() {
        return kursusDiambil;
    }

    public void infoPeserta() {
        super.infoUser();
        System.out.println("Kursus yang diambil:");
        if (kursusDiambil.isEmpty()) {
            System.out.println("  Belum mengambil kursus apapun.");
        } else {
            for (Kursus k : kursusDiambil) {
                System.out.println("  - " + k.getNamaKursus());
            }
        }
    }
}