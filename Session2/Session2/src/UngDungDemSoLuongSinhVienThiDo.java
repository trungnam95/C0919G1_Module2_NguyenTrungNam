import java.util.Scanner;

public class UngDungDemSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arraySinhVien;
        System.out.println("nhap vao so luong sinh vien muon them diem");
        int soLuong=scanner.nextInt();
        while (soLuong>30){
            System.out.println("nhap so luong <=30");
            soLuong=scanner.nextInt();
        }
        arraySinhVien=new int[soLuong];
        for (int i = 0; i <arraySinhVien.length ; i++) {
            System.out.println("nhap vao diem sinh vien thu: "+(i+1)+" :");
            arraySinhVien[i]=scanner.nextInt();
        }
        System.out.println("Danh Sach diem cua sinh vien la:");
        int dem=0;
        for (int i = 0; i <arraySinhVien.length ; i++) {
            System.out.println(arraySinhVien[i]+"\t");
            if(arraySinhVien[i]>=5 && arraySinhVien[i]<=10){
                dem++;
            }
        }
        System.out.println("so luong sinh vien dat trong ki thi: "+dem);
    }
}
