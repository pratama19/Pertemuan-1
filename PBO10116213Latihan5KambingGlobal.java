/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg10116213.latihan5.kambingglobal;

/**
 *
 * @author Win 8
 * Nama  : Mochamad Reza Pratama
 * Kelas : PBO-6K
 * NIM   : 10116213
 * 
 * Deskripsi : Program Kambing Global
 * 
 */
public class PBO10116213Latihan5KambingGlobal {
    
    /**
     * @param args the command line arguments
     */
    //inisialisasi nilai kambing
        int currentKambing = 60;
        
    
        
        public void getKambing(){
            System.out.printf("Jumlah Kambing : %d\r\n", currentKambing);
        }
        
        public void addKambing(){
            
            currentKambing = currentKambing + 5;
            
            System.out.printf("Jumlah Kambing setelah ditambah : %d\r\n", currentKambing);
            
        }
    public static void main(String[] args) {
        // TODO code application logic here
        PBO10116213Latihan5KambingGlobal kambing = new PBO10116213Latihan5KambingGlobal();
        kambing.getKambing();
        kambing.addKambing();
        kambing.getKambing();
        
        
    }
    
}
