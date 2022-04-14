package QLX;

public abstract class PhuongTien {
    private String hang;
    private String mau;
    private String ten;
    private int gia;

    public PhuongTien(){}

    public PhuongTien(String hang, String mau, String ten, int gia) {
        this.hang = hang;
        this.mau = mau;
        this.ten = ten;
        this.gia = gia;
    }

    public String getHang() {
        return hang;
    }

    public String getMau() {
        return mau;
    }

    public String getTen() {
        return ten;
    }

    public int getGia() {
        return gia;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

}
