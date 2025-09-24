public abstract class Konten {
    private String idKonten;
    private String judulKonten;
    private String namaKonten;

    public String getIdKonten() {
        return idKonten;
    }
    public void setIdKonten(String idKonten) {
        this.idKonten = idKonten;
    }
    public String getJudulKonten() {
        return judulKonten;
    }
    public void setJudulKonten(String judulKonten) {
        this.judulKonten = judulKonten;
    }
    public String getNamaKonten() {
        return namaKonten;
    }
    public void setNamaKonten(String namaKonten) {
        this.namaKonten = namaKonten;
    }

    // Metode abstrak yang harus diimplementasikan oleh kelas turunan
    public abstract void infoKonten();
}