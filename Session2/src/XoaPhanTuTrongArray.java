import java.util.Scanner;

public class XoaPhanTuTrongArray {
    public static void main(String[] args) {
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so luong phan tu muon them vao mang");
        int soLuong = scanner.nextInt();
        array = new int[soLuong];
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhap vao phan tu thu: " + (i + 1));
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("nhap vao phan tu muon xoa");
        int xoa = scanner.nextInt();
        int i, c;
        for (c = i = 0; i < soLuong; i++) {
            if (array[i] != xoa) {
                array[c] = array[i];
                c++;
            }
        }
        soLuong = c;
        System.out.println("Mảng còn lại sau khi xóa phần tử " + xoa + " là: ");
        for (i = 0; i < soLuong; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
