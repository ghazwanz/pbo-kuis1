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

    public Konten buatVideo(String judul, String resolusi) {
        Video video = new Video();
        video.setJudulKonten(judul);
        video.setResolusi(resolusi);
        return video;
    }

    public Konten buatArtikel(String judul, int jumlahHalaman) {
        Artikel artikel = new Artikel();
        artikel.setJudulKonten(judul);
        artikel.setJumlahHalaman(jumlahHalaman);
        return artikel;
    }

    public Konten buatKuis(String judul, int jumlahSoal) {
        Kuis kuis = new Kuis();
        kuis.setJudulKonten(judul);
        kuis.setJumlahSoal(jumlahSoal);
        return kuis;
    }

    public void infoInstruktur() {
        super.infoUser();
        System.out.println("Kursus yang dikelola:");
        for (Kursus k : kursusDikelola) {
            System.out.println("  - " + k.getNamaKursus());
        }
    }
    
}