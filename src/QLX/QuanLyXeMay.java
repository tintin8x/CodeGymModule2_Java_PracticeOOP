package QLX;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class QuanLyXeMay implements QuanLy<XeMay> {

    LinkedList<XeMay> ds = new LinkedList<XeMay>();

    @Override
    public void run() {
        int menu = this.chonMenu();
        switch (menu){
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
                this.timKiem();
                break;
            case 5:
                this.inTatCa();
                break;
            case 6:
                this.sapXep();
                break;
            case 7:
                System.out.println("Hello!!!");
                System.exit();

        }
    }

    @Override
    public int chonMenu() {

        Scanner quet = new Scanner(System.in);
        String chon = "chon dung";
        int menu;

        do {
            System.out.println(" He thong quan ly xe may, vui long chon:");
            System.out.println(" 1. them");
            System.out.println(" 2. Sua");
            System.out.println(" 3. Xoa");
            System.out.println(" 4. Tim kiem");
            System.out.println(" 5. In danh sach");
            System.out.println(" 6. Sap xep");
            System.out.println(" 7. Quay lai");
            menu = quet.nextInt();
        } while (chon == "chon sai");

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
    public void timKiem() {

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
