import java.util.Scanner;
public class bai3 {
    public static void main(String[] args ){
        java.util.Scanner input = new Scanner (System.in) ;
        System.out.print("nhap so luong  phan tu mang : ");
        int n = input.nextInt();
        System.out.print("nhap so nguyen can tim trong mang : ");
        int a = input.nextInt();
        int dem = 0;
        int[] array = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("nhap gia tri thu " + (i+1) + " :" );
            array[i] = input.nextInt();
        }
        for(int i = 0 ; i < n ; i ++){
            if (array[i] == a ){
                dem++;
            }
        }
        System.out.println(" so lan ma so " + a + " xaut hien trong mang  la " + dem + " lan");
        input.close();
    }
}
