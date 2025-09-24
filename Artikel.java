public class Artikel extends Konten {
    private int jumlahHalaman;

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    @Override
    public void infoKonten() {
        System.out.println("Tipe Konten    : Artikel");
        System.out.println("Judul Artikel  : " + getJudulKonten());
        System.out.println("Jumlah Halaman : " + jumlahHalaman);
    }
}