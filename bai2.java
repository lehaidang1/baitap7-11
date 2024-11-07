import java.util.Scanner;
public class bai2 {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in) ;
        int max = 0 ; 
        float tb = 0 ; 
        System.out.print("Nhap so luong mang : " ) ;
        int n = input.nextInt();
        int[] array = new int[n] ;
        for(int i = 0 ; i < n ;i++) {
            System.out.print("nhap phan tu thu "+(i+1)+": ");
            array[i] = input.nextInt() ;
        }
        for(int i = 0 ; i <  n ; i++){
            max = max + array[i];

        }
        System.out.println("tong cac phan tu = " +max);
        tb = max / n ;
        System.out.println("trung binh cong cac phan tu bang " + tb);
        input.close();
        }
    }
