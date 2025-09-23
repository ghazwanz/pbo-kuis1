public class Konten {
    private String namaKonten;
    private Video video;
    private Artikel artikel;
    private Kuis kuis;

    Konten(String namaKonten , Video video , Artikel artikel , Kuis kuis){
        this.namaKonten = namaKonten;
        this.video = video;
        this.artikel = artikel;
        this.kuis = kuis;
    }

    public void setNamaKonten(String namaKonten) {
        this.namaKonten = namaKonten;
    }
    public String getNamaKonten() {
        return namaKonten;
    }
}
