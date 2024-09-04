package baitap1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class ReadTextFile {
    public static void main(String[] args) {
        List<SanPham> sanPhams = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("sanpham.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                SanPham sp = new SanPham(parts[0], parts[1], Float.parseFloat(parts[2]));
                sanPhams.add(sp);
            }
        } catch (IOException e) {
        }

        for (SanPham sp : sanPhams) {
            System.out.println(sp);
        }
    }
}
