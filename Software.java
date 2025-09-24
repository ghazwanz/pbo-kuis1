import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Software {
    private List<User> listUser = new ArrayList<>();
    private List<Kursus> listKursus = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public Software() {
        // Data dummy untuk demonstrasi
        Instruktur andi = new Instruktur("1", "Andi", "andi@edutech.com");
        Instruktur budi = new Instruktur("2", "Budi", "budi@edutech.com");
        Peserta peserta1 = new Peserta("3", "Siswa A", "siswaA@mail.com");

        listUser.add(andi);
        listUser.add(budi);
        listUser.add(peserta1);

        Kursus matematika = new Kursus("K-01", "Matematika Dasar", andi, 100000);
        Kursus fisika = new Kursus("K-02", "Fisika Modern", budi, 150000);

        matematika.tambahKonten(buatVideo("Video Pengantar", "1080p"));
        matematika.tambahKonten(buatArtikel("Artikel Aljabar", 5));
        matematika.tambahKonten(buatKuis("Kuis Bab 1", 10));

        fisika.tambahKonten(buatVideo("Video Fisika Kuantum", "4K"));
        fisika.tambahKonten(buatArtikel("Artikel Relativitas", 8));
        fisika.tambahKonten(buatKuis("Kuis Bab 2", 15));

        listKursus.add(matematika);
        listKursus.add(fisika);

        andi.tambahKursus(matematika);
        budi.tambahKursus(fisika);
    }
