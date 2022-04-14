package QLX;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class QuanLyXeMay implements QuanLy<XeMay> {

    LinkedList<XeMay> ds = new LinkedList<XeMay>();

    @Override
    public void run() {
        boolean chon = true;
        do {
            int menu = this.chonMenu();

            switch (menu) {
                case 1:
                    this.them();
                    break;
                case 2:
                    this.sua();
                    break;
                case 3:
                    this.xoa();
                    break;
                case 4:
                    int[] dsTim = this.timKiem();
                    for(int i=0; i<dsTim.length;i++){
                        this.ds.get(dsTim[i]).toString();
                    }
                    break;
                case 5:
                    this.inTatCa();
                    break;
                case 6:
                    this.sapXep();
                    break;
                case 7:
                    System.out.println("Bye!!!");
                    System.exit(0);
                default:
                    System.out.println("Vui long chon lai!!!");
                    //System.out.println("---------------------------");
                    this.chonMenu();
            }
        }while(chon);
    }

    @Override
    public int chonMenu() {

        Scanner quet = new Scanner(System.in);
        int menu;

        System.out.println("-------------------------------------------------");
        System.out.println(" He thong quan ly xe may, vui long chon:");
        System.out.println(" 1. Them");
        System.out.println(" 2. Sua");
        System.out.println(" 3. Xoa");
        System.out.println(" 4. Tim kiem");
        System.out.println(" 5. In danh sach");
        System.out.println(" 6. Sap xep");
        System.out.println(" 7. Thoat");
        menu = quet.nextInt();
        return menu;
    }

    @Override
    public void them() {
        Scanner quet = new Scanner(System.in);
        XeMay xm = new XeMay();

        System.out.println("Nhap ten hang: ");
        xm.setHang(quet.nextLine());
        System.out.println("Nhap mau: ");
        xm.setMau(quet.nextLine());
        System.out.println("Nhap ten: ");
        xm.setTen(quet.nextLine());
        System.out.println("Nhap gia: ");
        xm.setGia(quet.nextInt());
        System.out.println("Nhap dung tich: ");
        xm.setDugTik(quet.nextInt());
        ds.add(xm);
        System.out.println("Da them 1 xe may nhu ben duoi vao danh sach:");
        System.out.println(xm.toString());
    }

    @Override
    public void sua() {

    }

    @Override
    public void xoa() {

    }

    @Override
    public int[] timKiem() {

        int temp[] = new int[20];
        int menu;

        int count = 0;
        Scanner quetInt = new Scanner(System.in);
        Scanner quetStr = new Scanner(System.in);
        boolean chon = true;

        do {
            System.out.println("-------------------------------------------------");
            System.out.println(" He thong quan ly xe may, vui long chon:");
            System.out.println(" 1. Tim theo hang");
            System.out.println(" 2. Tim theo mau");
            System.out.println(" 3. Tim theo ten");
            System.out.println(" 4. Tim theo gia");
            System.out.println(" 5. Tim theo dung tich");
            menu = quetInt.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Nhap hang: ");

                    String hang = quetStr.nextLine();
                    for (int i = 0; i < this.ds.size(); i++) {
                        if (this.ds.get(i).getHang() == hang) {
                            temp[count] = i;
                            count++;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Nhap mau: ");
                    String mau = mau = quetStr.nextLine();
                    for (int i = 0; i < this.ds.size(); i++) {
                        if (this.ds.get(i).getMau() == mau) {
                            temp[count] = i;
                            count++;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Nhap ten: ");
                    String ten = quetStr.nextLine();
                    for (int i = 0; i < this.ds.size(); i++) {
                        if (this.ds.get(i).getTen() == ten) {
                            temp[count] = i;
                            count++;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nhap gia: ");
                    int gia = quetInt.nextInt();
                    for (int i = 0; i < this.ds.size(); i++) {
                        if (this.ds.get(i).getGia() == gia) {
                            temp[count] = i;
                            count++;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Nhap dung tich: ");
                    int dugtik = quetInt.nextInt();
                    for (int i = 0; i < this.ds.size(); i++) {
                        if (this.ds.get(i).getDugTik() == dugtik) {
                            temp[count] = i;
                            count++;
                        }
                    }
                    break;
                default:
                    System.out.println("Xin vui long chon dung!!!");
                    chon = false;
            }
        } while(!chon);

        int dsTim[] = new int[count];

        for(int i=0; i< count;i++){
            dsTim[i]=temp[i];
        }

        return dsTim;
    }

    @Override
    public void inTatCa() {
        // sử dụng Iterator - hiển thị các phần tử của list
        Iterator<XeMay> iterator = this.ds.iterator();
        System.out.println("Danh sach xe may: ");
        while (iterator.hasNext()) {
            System.out.println((XeMay) iterator.next());
        }
    }

    @Override
    public void sapXep() {

    }

    @Override
    public String toString() {
        return "QuanLyXeMay{" +
                "ds=" + ds +
                '}';
    }

}
