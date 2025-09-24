import java.util.ArrayList;
import java.util.List;

public class Kursus {
    private String idKursus;
    private String namaKursus;
    private Instruktur instruktur;
    private int harga;
    private List<Konten> listKonten;

    public Kursus(String idKursus, String namaKursus, Instruktur instruktur, int harga) {
        this.idKursus = idKursus;
        this.namaKursus = namaKursus;
        this.instruktur = instruktur;
        this.harga = harga;
        this.listKonten = new ArrayList<>();
    }

    public String getIdKursus() {
        return idKursus;
    }

    public String getNamaKursus() {
        return namaKursus;
    }

    public Instruktur getInstruktur() {
        return instruktur;
    }

    public int getHarga() {
        return harga;
    }

    public List<Konten> getListKonten() {
        return listKonten;
    }

    public void tambahKonten(Konten konten) {
        this.listKonten.add(konten);
    }

    public void infoKursus() {
        System.out.println("----------------------------------------");
        System.out.println("ID Kursus        : " + idKursus);
        System.out.println("Nama Kursus      : " + namaKursus);
        System.out.println("Instruktur       : " + instruktur.getName());
        System.out.println("Harga            : Rp" + harga);
        System.out.println("Jumlah Konten    : " + listKonten.size());
        System.out.println("----------------------------------------");
    }

    public void tampilkanKonten() {
        System.out.println("\nKonten dalam kursus " + namaKursus + ":");
        if (listKonten.isEmpty()) {
            System.out.println("Belum ada konten.");
        } else {
            for (Konten konten : listKonten) {
                konten.infoKonten();
                System.out.println();
            }
        }
    }
}