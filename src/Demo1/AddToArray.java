package Demo1;

import java.util.Scanner;

public class AddToArray {
    public static void main(String[] args) {

        int arr[] = {2, 3, 4, 5, 6, 7};
        int newArr[] = themVaoMang(arr, 5, 10);
        System.out.println("Mang truoc khi them");
        printArray(arr);
        System.out.println("Mang sau khi them");
        printArray(newArr);

    }

    public static int[] themVaoMang(int arr[], int pos, int val) {

        int newArr[] = new int[arr.length + 1];
        for (int i = 0; i < newArr.length ; i++) {
            if (i < pos) {
                newArr[i] = arr[i];
            }
            newArr[pos] = val;
            if (i > pos) {
                newArr[i] = arr[i - 1];
            }

        }
        return newArr;
    }

    public static void printArray(int[] arr) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str = str + arr[i] + " ";
        }
        System.out.println(str);
    }
}
