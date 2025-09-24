public class Video extends Konten{
    private String judulVideo;
    private String resolusi;
    
    public void setjudulVideo(String newValue){
        judulVideo = newValue;
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
    
    public void infoVideo(){
        super.infoKonten();
        System.out.println("Judul Video : " + judulVideo);
        System.out.println("Resolusi Video : "+ resolusi);
    }

    // public String infoVideo(){
    //     String info ="";
    //     info += "Judul Video : "+judulVideo+"\n";
    //     info += "+-----------------------+";
    //     info += "|                       |";
    //     info += "|  {"+ super.getNamaKonten()+"}; |";
    //     info += "|                       |";
    //     info += "+-----------------------+";
    //     info += "Resolusi : "+resolusi+"\n";
    //     return info;
    // }
}
