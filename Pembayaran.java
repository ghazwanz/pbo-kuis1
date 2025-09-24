public class Pembayaran {
    int total = 0;
    Kursus harga;

    public void setHarga(Kursus harga) {
        this.harga = harga;
    }
    
    public void hitungBiayaTotal(){
        total += harga.getHarga();
    }

    
    void menuPembayaran(){
        System.out.println("== Menu Pembayaran ==");
        hitungBiayaTotal();
        System.out.println("Tagihan: " + total);
    }
}
