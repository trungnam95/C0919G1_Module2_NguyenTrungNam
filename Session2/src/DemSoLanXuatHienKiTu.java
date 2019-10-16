import java.util.Scanner;

public class DemSoLanXuatHienKiTu {
    public static void main(String[] args) {
        String name = "NaNammmm";
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao ki tu muon tim");
        String input = scanner.nextLine();
        int dem = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == input.charAt(0)) {
                System.out.println("vi tri "+i);
                dem++;
            }
        }
        System.out.println(dem);
    }
}

