/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tugas01;

/**
 *
 * @author danielrorrr
 */
import java.util.Scanner;
public class Tugas01 {
     public static void main(String[] args) {
        Scanner inputan = new Scanner (System.in);
        int jarak, panjangpaket, lebarpaket,tinggipaket, volumepaket, totalpengiriman;
                System.out.print("masukkan jarak tujuan anda :");
             jarak = inputan.nextInt ();
             if  (jarak <= 10 ){
             System.out.println("biaya anda adalah 4.250 rupiah ");
                       }else {
             System.out.println("biaya anda adalah 6.000 rupiah");
             }
                
                
                System.out.print("masukkan panjang paket anda :");
                panjangpaket = inputan.nextInt();
                System.out.println("masukkan lebar paket anda :");
                lebarpaket = inputan.nextInt();
                System.out.println("masukkan tinggi paket anda :");
                tinggipaket = inputan.nextInt();
                volumepaket = tinggipaket*lebarpaket*panjangpaket;
                System.out.println("volume paket anda adalah " + volumepaket);
                if (volumepaket > 100 ){
                System.out.println("karena volume paket anda melebihi 100 maka ada biaya tambahan sebesar 50.000 rupiah");
                }
                System.out.println("Total pengiriman anda adalah :"+ volumepaket + jarak);
                
                 
          
                
                 
    }
    
}