package QLX;

public class XeMay extends PhuongTien {
    private int dugTik;

    public XeMay(){};

    public XeMay(int dugTik) {
        this.dugTik = dugTik;
    }

    public XeMay(String hang, String mau, String ten, int gia, int dugTik) {
        super(hang, mau, ten, gia);
        this.dugTik = dugTik;
    }

    public int getDugTik() {
        return dugTik;
    }

    public void setDugTik(int dugTik) {
        this.dugTik = dugTik;
    }

    @Override
    public String toString() {
        return "XeMay{Hang: " + getHang() +
                ", mau: " + getMau() +
                ", ten: " + getTen() +
                ", gia: " + getGia() +
                ", dugTik: " + dugTik +
                '}';
    }
}