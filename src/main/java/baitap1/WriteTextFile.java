package baitap1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class WriteTextFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (FileWriter writer = new FileWriter("sanpham.txt")) {
            for (int i = 0; i < 3; i++) {
                System.out.print("Nhập mã số sản phẩm: ");
                String maso = scanner.nextLine();
                System.out.print("Nhập tên sản phẩm: ");
                String ten = scanner.nextLine();
                System.out.print("Nhập giá sản phẩm: ");
                float gia = scanner.nextFloat();
                scanner.nextLine(); // Đọc ký tự dòng mới

                SanPham sp = new SanPham(maso, ten, gia);
                writer.write(sp.toString() + "\n");
            }
        } catch (IOException e) {
        }
    }
}
