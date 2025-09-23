public class Video {
    private String judulVideo;
    private String resolusi;
    private Konten konten;

    Video(String judulVideo , String resolusi){
        this.judulVideo = judulVideo;
        this.resolusi =  resolusi;
    }

    public void setJudulVideo(String judulVideo) {
        this.judulVideo = judulVideo;
    }
    public String getJudulVideo() {
        return judulVideo;
    }

    public void setResolusi(String resolusi) {
        this.resolusi = resolusi;
    }
    public String getResolusi() {
        return resolusi;
    }

    public String infoVideo(){
        String info ="";
        info += "Judul Video : "+judulVideo+"\n";
        info += "+-----------------------+";
        info += "|                       |";
        info += "|  {"+ konten.getNamaKonten()+"}; |";
        info += "|                       |";
        info += "+-----------------------+";
        info += "Resolusi : "+resolusi+"\n";
        return info;
    }
}
