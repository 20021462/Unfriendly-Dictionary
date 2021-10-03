package bai9;

import java.util.Scanner;

/**
 *
 * @author Ngoc Bich
 */
public class Cau1 {
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        System.out.print("Nhập số sinh viên: ");
        int n = sv.nextInt();
        sv.nextLine();
        String hoVaTen[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập sinh viên thứ " + (i + 1) + " : ");
            hoVaTen[i] = sv.nextLine();
        }
        System.out.println("Nhập tên sinh viên muốn tìm kiếm: ");
        String tk = sv.nextLine();
        boolean check = false;
        for (int i = 0; i < n; i++) {
            check = tk.equals(hoVaTen[i]);
            if (check == true) {
                System.out.println("Sinh viên bạn cần tìm xếp theo stt là: " + (i+1));
                break;
            }
        }
        if (check != true) {
            System.out.println("Danh sách đã cho không có sinh viên bạn cần tìm!");
        }
    }
}