package DEMO;
public class Video extends Konten {
    private String resolusi;

    public void setResolusi(String resolusi) {
        this.resolusi = resolusi;
    }

    public String getResolusi() {
        return resolusi;
    }

    @Override
    public void infoKonten() {
        System.out.println("Tipe Konten    : Video");
        System.out.println("Judul Video    : " + getJudulKonten());
        System.out.println("Resolusi       : " + resolusi);
    }
}