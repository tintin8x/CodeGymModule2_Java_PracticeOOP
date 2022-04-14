package Demo2;

public class NewOPP {
    public static void main(String[] args) {

    }

    class SinhVien{
        private String  maSV;
        private String ten;
        private int tuoi;

        public SinhVien(String maSV, String ten, int tuoi) {
            this.maSV = maSV;
            this.ten = ten;
            this.tuoi = tuoi;
        }

        public String getMaSV() {
            return maSV;
        }

        public String getTen() {
            return ten;
        }

        public int getTuoi() {
            return tuoi;
        }

        public void setMaSV(String maSV) {
            this.maSV = maSV;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public void setTuoi(int tuoi) {
            this.tuoi = tuoi;
        }
    }

    class QuanLySinhVien{
        private SinhVien[] dsSV;

        public QuanLySinhVien(SinhVien[] dsSV) {
            this.dsSV = dsSV;
        }

        public void them(SinhVien sv){
            //if(this.dsSV)
        }

        public void sua(String maSV){

        }

        public void xoa(String maSV){

        }

        public void tim(String maSV){

        }
    }
}
