package android.example.gyk401;

public class Diet {

    private int imageId;
    private String yiyecekAdi;
    private String calori;

    public Diet(int imageId, String yiyecekAdi, String calori) {
        this.imageId = imageId;
        this.yiyecekAdi = yiyecekAdi;
        this.calori = calori;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getYiyecekAdi() {
        return yiyecekAdi;
    }

    public void setYiyecekAdi(String yiyecekAdi) {
        this.yiyecekAdi = yiyecekAdi;
    }

    public String getCalori() {
        return calori;
    }

    public void setCalori(String calori) {
        this.calori = calori;
    }
}
