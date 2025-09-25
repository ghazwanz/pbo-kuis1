import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Software {
    private List<User> listUser = new ArrayList<>();
    private List<Kursus> listKursus = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public Software() {
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

    private Konten buatVideo(String judul, String resolusi) {
        Video video = new Video();
        video.setJudulKonten(judul);
        video.setResolusi(resolusi);
        return video;
    }

    private Konten buatArtikel(String judul, int jumlahHalaman) {
        Artikel artikel = new Artikel();
        artikel.setJudulKonten(judul);
        artikel.setJumlahHalaman(jumlahHalaman);
        return artikel;
    }

    private Konten buatKuis(String judul, int jumlahSoal) {
        Kuis kuis = new Kuis();
        kuis.setJudulKonten(judul);
        kuis.setJumlahSoal(jumlahSoal);
        return kuis;
    }

    public void run() {
        System.out.println("-----------------------------------------");
        System.out.println(" Selamat Datang di EduTech Platform ");
        System.out.println("-----------------------------------------");
        int pilihan;

        do {
            System.out.println("\n== MENU UTAMA ==");
            System.out.println("1. Login sebagai Peserta");
            System.out.println("2. Login sebagai Instruktur");
            System.out.println("0. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    menuPeserta();
                    break;
                case 2:
                    menuInstruktur();
                    break;
                case 0:
                    System.out.println("Terima kasih, sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }

    private void menuPeserta() {
        System.out.println("\n== LOGIN PESERTA ==");
        System.out.print("Masukkan ID Anda: ");
        String idPeserta = sc.nextLine();
        
        Peserta peserta = null;
        for (User user : listUser) {
            if (user instanceof Peserta && user.getId().equals(idPeserta)) {
                peserta = (Peserta) user;
                break;
            }
        }

        if (peserta == null) {
            System.out.println("ID Peserta tidak ditemukan.");
            return;
        }

        System.out.println("Selamat datang, " + peserta.getName() + "!");
        int pilihan;
        do {
            System.out.println("\n== MENU PESERTA ==");
            System.out.println("1. Lihat Daftar Kursus");
            System.out.println("2. Daftar Kursus Baru");
            System.out.println("3. Lihat Kursus yang Diambil");
            System.out.println("0. Kembali ke Menu Utama");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    lihatDaftarKursus();
                    break;
                case 2:
                    daftarKursus(peserta);
                    break;
                case 3:
                    lihatKursusDiambil(peserta);
                    break;
                case 0:
                    System.out.println("Kembali...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }

    private void menuInstruktur() {
        System.out.println("\n== LOGIN INSTRUKTUR ==");
        System.out.print("Masukkan ID Anda: ");
        String idInstruktur = sc.nextLine();

        Instruktur instruktur = null;
        for (User user : listUser) {
            if (user instanceof Instruktur && user.getId().equals(idInstruktur)) {
                instruktur = (Instruktur) user;
                break;
            }
        }

        if (instruktur == null) {
            System.out.println("ID Instruktur tidak ditemukan.");
            return;
        }

        System.out.println("Selamat datang, " + instruktur.getName() + "!");
        int pilihan;
        do {
            System.out.println("\n== MENU INSTRUKTUR ==");
            System.out.println("1. Lihat Kursus yang Dikelola");
            System.out.println("2. Tambah Kursus");
            System.out.println("3. Tambah Konten ke Kursus");
            System.out.println("0. Kembali ke Menu Utama");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    lihatKursusDikelola(instruktur);
                    break;
                case 2:
                    tambahKursus(instruktur);
                    break;
                case 3:
                    tambahKontenKeKursus(instruktur);
                    break;
                case 0:
                    System.out.println("Kembali...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }

    private void lihatDaftarKursus() {
        System.out.println("\n== DAFTAR KURSUS TERSEDIA ==");
        if (listKursus.isEmpty()) {
            System.out.println("Tidak ada kursus tersedia saat ini.");
            return;
        }
        for (Kursus kursus : listKursus) {
            kursus.infoKursus();
        }
    }

    private void daftarKursus(Peserta peserta) {
        lihatDaftarKursus();
        System.out.print("Masukkan ID Kursus yang ingin Anda daftar: ");
        String idKursus = sc.nextLine();

        Kursus kursusPilihan = null;
        for (Kursus kursus : listKursus) {
            if (kursus.getIdKursus().equalsIgnoreCase(idKursus)) {
                kursusPilihan = kursus;
                break;
            }
        }

        if (kursusPilihan != null) {
            if (peserta.getKursusDiambil().contains(kursusPilihan)) {
                System.out.println("Anda sudah terdaftar di kursus ini.");
            } else {
                peserta.daftarKursus(kursusPilihan);
                Pembayaran pembayaran = new Pembayaran(peserta, kursusPilihan);
                pembayaran.prosesPembayaran();
            }
        } else {
            System.out.println("ID Kursus tidak ditemukan.");
        }
    }

    private void lihatKursusDiambil(Peserta peserta) {
        System.out.println("\n== KURSUS YANG DIAMBIL ==");
        List<Kursus> kursusDiambil = peserta.getKursusDiambil();
        if (kursusDiambil.isEmpty()) {
            System.out.println("Anda belum mengambil kursus apapun.");
        } else {
            for (Kursus kursus : kursusDiambil) {
                kursus.infoKursus();
                kursus.tampilkanKonten();
            }
        }
    }
    
    private void lihatKursusDikelola(Instruktur instruktur) {
        System.out.println("\n== KURSUS YANG DIKELOLA ==");
        List<Kursus> kursusDikelola = instruktur.getKursusDikelola();
        if (kursusDikelola.isEmpty()) {
            System.out.println("Anda belum mengelola kursus apapun.");
        } else {
            for (Kursus kursus : kursusDikelola) {
                kursus.infoKursus();
                kursus.tampilkanKonten();
            }
        }
    }

    private void tambahKontenKeKursus(Instruktur instruktur) {
        System.out.println("\n== TAMBAH KONTEN ==");
        System.out.print("Masukkan ID Kursus yang ingin ditambahkan konten: ");
        String idKursus = sc.nextLine();

        Kursus kursusPilihan = null;
        for (Kursus kursus : listKursus) {
            if (kursus.getIdKursus().equalsIgnoreCase(idKursus) && kursus.getInstruktur().getId().equals(instruktur.getId())) {
                kursusPilihan = kursus;
                break;
            }
        }

        if (kursusPilihan == null) {
            System.out.println("Kursus tidak ditemukan atau Anda tidak memiliki izin untuk mengelolanya.");
            return;
        }

        System.out.println("Pilih jenis konten yang ingin ditambahkan:");
        System.out.println("1. Video");
        System.out.println("2. Artikel");
        System.out.println("3. Kuis");
        System.out.print("Pilihan: ");
        int jenisKonten = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukkan judul konten: ");
        String judul = sc.nextLine();
        
        switch (jenisKonten) {
            case 1:
                System.out.print("Masukkan resolusi video: ");
                String resolusi = sc.nextLine();
                Video videoBaru = new Video();
                videoBaru.setJudulKonten(judul);
                videoBaru.setResolusi(resolusi);
                kursusPilihan.tambahKonten(videoBaru);
                System.out.println("Video berhasil ditambahkan!");
                break;
            case 2:
                System.out.print("Masukkan jumlah halaman artikel: ");
                int halaman = sc.nextInt();
                sc.nextLine();
                Artikel artikelBaru = new Artikel();
                artikelBaru.setJudulKonten(judul);
                artikelBaru.setJumlahHalaman(halaman);
                kursusPilihan.tambahKonten(artikelBaru);
                System.out.println("Artikel berhasil ditambahkan!");
                break;
            case 3:
                System.out.print("Masukkan jumlah soal kuis: ");
                int soal = sc.nextInt();
                sc.nextLine();
                Kuis kuisBaru = new Kuis();
                kuisBaru.setJudulKonten(judul);
                kuisBaru.setJumlahSoal(soal);
                kursusPilihan.tambahKonten(kuisBaru);
                System.out.println("Kuis berhasil ditambahkan!");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    private void tambahKursus(Instruktur instruktur) {
        System.out.println("\n== TAMBAH Kursus ==");
        System.out.print("Masukkan ID Kursus: ");
        String idKursus = sc.nextLine();
        
        System.out.print("Masukkan Nama Kursus: ");
        String namaKursus = sc.nextLine();

        System.out.print("Masukkan Harga Kursus: ");
        int hargaKursus = sc.nextInt();

        Kursus kursus = new Kursus(idKursus, namaKursus, instruktur, hargaKursus);
        instruktur.tambahKursus(kursus);
        listKursus.add(kursus);
    }
}
