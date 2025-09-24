package DEMO;
public class Kuis extends Konten {
    private int jumlahSoal;

    public void setJumlahSoal(int jumlahSoal) {
        this.jumlahSoal = jumlahSoal;
    }

    public int getJumlahSoal() {
        return jumlahSoal;
    }

    @Override
    public void infoKonten() {
        System.out.println("Tipe Konten    : Kuis");
        System.out.println("Judul Kuis     : " + getJudulKonten());
        System.out.println("Jumlah Soal    : " + jumlahSoal);
    }
}