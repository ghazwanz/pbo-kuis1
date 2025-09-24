public class Konten {
    private String idKonten;
    private String judulKonten;
    
    // public Konten(String judulKonten ){
    //     this.judulKonten = judulKonten;
    // }

    public void setIdKonten(String idKonten) {
        this.idKonten = idKonten;
    }
    public String getIdKonten() {
        return idKonten;
    }

    public void setjudulKonten(String judulKonten) {
        this.judulKonten = judulKonten;
    }
    public String getjudulKonten() {
        return judulKonten;
    }

    public void infoKonten(){
        System.out.println("Konten : "+judulKonten);
    } 
}
