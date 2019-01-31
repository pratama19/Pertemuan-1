/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg10116213.latihan6.kambingstatic;

import java.io.PrintStream;

/**
 *
 * @author Win 8
 * Nama  : Mochamad Reza Pratama
 * Kelas : PBO-6K
 * NIM   : 10116213
 * 
 * Deskripsi : 
 */
public class PBO10116213Latihan6Kambingstatic {

    //nama pemilik kambing
    public static final String namaPemilik = "Paindra";

    
    
    public static void main(String[] args) {
        // TODO code application logic here
        mamalia.jumlahkambing = 5000;
        PrintStream printf = System.out.printf("%s memiliki kambing sebanyak %d\r\n", namaPemilik, mamalia.jumlahkambing);

    }

    class mamalia {
       public static int jumlahkambing;
    }
    
    }

        
    


        
    
    

