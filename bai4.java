import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class bai4 {
    public static void main(String[] args ){
        java.util.Scanner input = new Scanner (System.in) ;
        System.out.print("nhap so luong phan tu mang : ");
        int n = input.nextInt();
        int[] array = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("nhap phan tu thu "+(i + 1)+" : ");
            array[i] = input.nextInt();
        }
         Arrays.sort(array);// câu lệnh sắp xếp tăng dần;
        for(int i = 0; i < n ; i ++){
            System.out.print(array[i] + "  ");
        } 
        input.close();
    }
}
