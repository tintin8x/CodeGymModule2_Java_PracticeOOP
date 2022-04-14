package Demo1;

import java.util.Scanner;

public class Demo2DArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so hang:");
        int m = scanner.nextInt();
        System.out.println("Nhap so cot:");
        int n = scanner.nextInt();

        float arr[][] = inputArray(m,n);
        printArray(arr);

    }


    public static float[][] inputArray(int m, int n){
        float arr[][] = new float[m][n];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println("Nhap phan tu toa do hang " + i + ", cot " + j);
                arr[i][j] = scanner.nextFloat();
            }
        }
        return arr;
    }
    public static void printArray(float[][] arr){
        System.out.println("Mang vua duoc tao:");
        for(int i=0;i<arr.length;i++){
            String str = "";
            for(int j=0;j<arr[i].length;j++){
                str = str + arr[i][j] + " ";
            }
            System.out.println(str);
        }
    }
}
