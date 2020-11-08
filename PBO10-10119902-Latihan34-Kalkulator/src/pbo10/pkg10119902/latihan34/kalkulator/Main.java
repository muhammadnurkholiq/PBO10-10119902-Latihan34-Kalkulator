/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10.pkg10119902.latihan34.kalkulator;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA    : Muhammad Nurkholiq
 * KELAS   : PBO10K
 * NIM     : 10119902
 * Deskripsi Program : Program Ini Berisi Program Untuk Menampilkan Kalkulator
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        
        System.out.print("Masukan Angka Ke-1 : ");
        kalkulator.value1 = scanner.nextDouble();
        
        System.out.print("Masukan Angka Ke-2 : ");
        kalkulator.value2 = scanner.nextDouble();
        
        System.out.println();
        System.out.printf("Hasil Pertambahan : %.1f\n", kalkulator.tambahBilangan());
        System.out.printf("Hasil Pengurangan : %.1f\n", kalkulator.kurangBilangan());
        System.out.printf("Hasil Perkalian : %.1f\n", kalkulator.kaliBilangan());
        System.out.printf("Hasil Pembagian : %.2f\n", kalkulator.bagiBilangan());
        System.out.printf("Hasil Sisa : %.1f\n", kalkulator.sisaBilangan());
    }
    
}