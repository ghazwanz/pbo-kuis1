package DEMO;
public class Pembayaran {
    private Kursus kursusDibeli;
    private Peserta pembeli;

    public Pembayaran(Peserta pembeli, Kursus kursusDibeli) {
        this.pembeli = pembeli;
        this.kursusDibeli = kursusDibeli;
    }

    public void prosesPembayaran() {
        System.out.println("\n== Proses Pembayaran ==");
        System.out.println("Pembeli     : " + pembeli.getName());
        System.out.println("Kursus      : " + kursusDibeli.getNamaKursus());
        System.out.println("Harga       : Rp" + kursusDibeli.getHarga());
        System.out.println("Status      : Berhasil");
        System.out.println("---------------------------------");
    }
}