package QLX;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String chon = "chon dung";
        int menu;

        do {
            System.out.println("Vui long chon he thong quan ly phuong tien");
            System.out.println(" 1. Quan ly xe may");
            System.out.println(" 2. Quan ly o to");
            System.out.println(" 3. Thoat");

            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    QuanLyXeMay qlxm = new QuanLyXeMay();
                    qlxm.run();
                case 2:
                case 3:
                    System.out.println("Tam biet!!!");
                    System.exit();
                default:
                    System.out.println("Xin vui long chon dung!!!");
                    System.out.println("--------------------------");
                    chon = "chon sai";
            }
        }while(chon == "chon sai");
    }
}
