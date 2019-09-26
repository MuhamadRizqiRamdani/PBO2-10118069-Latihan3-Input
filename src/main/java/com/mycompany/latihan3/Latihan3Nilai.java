/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.latihan3;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Muhamad Rizqi Ramdani
 * KELAS    : PBO2
 * NIM      : 10118069
 * Deskripsi program : Program ini berisi program untuk memasukkan nama
 */
public class Latihan3Nilai {
    public static void main(String[] args) {
        System.out.print("Masukkan Nama Anda: ");
        Scanner scanner = new Scanner(System.in);
                
        String nama = scanner.next();
        System.out.println("Nama Anda Adalah "+nama);
        
    }
}
