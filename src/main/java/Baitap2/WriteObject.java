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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriteObject {
    public static void main(String[] args) {
        List<SanPham> sanPhams = new ArrayList<>();
        sanPhams.add(new SanPham("SP001", "San Pham 1", 100.0f));
        sanPhams.add(new SanPham("SP002", "San Pham 2", 150.0f));
        sanPhams.add(new SanPham("SP003", "San Pham 3", 200.0f));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sanpham.bin"))) {
            oos.writeObject(sanPhams);
        } catch (IOException e) {
        }
    }
}
