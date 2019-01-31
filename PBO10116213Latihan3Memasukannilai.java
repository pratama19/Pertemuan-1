/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg10116213.latihan3.memasukannilai;

import java.util.Scanner;

/**
 *
 * @author Win 8
 * Nama  : Mochamad Reza Pratama
 * Kelas : PBO-6K
 * NIM   : 10116213
 * 
 * Deskripsi : Profaram input dari keyboard
 */
public class PBO10116213Latihan3Memasukannilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukan Nama Anda\t : ");
        String name = scanner.nextLine();
        
        System.out.println("Nama anda adalah\t : "+ name);
        
    }
    
}
