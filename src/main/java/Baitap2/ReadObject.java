package Baitap2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
import baitap1.SanPham;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sanpham.bin"))) {
            @SuppressWarnings("unchecked")
            List<SanPham> sanPhams = (List<SanPham>) ois.readObject();

            for (SanPham sp : sanPhams) {
                System.out.println(sp);
            }
        } catch (IOException | ClassNotFoundException e) {
        }
    }
}
