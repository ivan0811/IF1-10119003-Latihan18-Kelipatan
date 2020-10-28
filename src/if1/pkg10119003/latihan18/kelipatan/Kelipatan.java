/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119003.latihan18.kelipatan;

/**
 *
 * @author User
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : program ini untuk menampilkan kelipatan
 */

public class Kelipatan {
    static double kelipatan = 3.5;
    
    private static void tampilKelipatan(){
        for(int i = 0; i < 9; i++){
            kelipatan += 3.5;
            System.out.println(kelipatan);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tampilKelipatan();        
        System.out.println("Developed by : Ivan Faathirza");
    }
    
}
