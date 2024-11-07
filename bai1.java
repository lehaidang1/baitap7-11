import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("nhap so luong phan tu : ");
        int n = input.nextInt();
        
        int[] array = new int[n];
        
        System.out.print("Nhap phan tu  dau tien  : ");
        array[0] = input.nextInt();
        int max = array[0];
        int min = array[0];
        
        for (int i = 1; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i+1) + ": ");
            array[i] = input.nextInt();

            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Phan tu nho nhat = " + min);
        System.out.println("phan tu lon nhat  = " + max);
        input.close();
    }
}
