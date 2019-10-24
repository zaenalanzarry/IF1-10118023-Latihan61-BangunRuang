/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan61;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : Bangun Ruang
 */

public class Latihan61 {

    public static void main(String[] args) {
        
        //Bola
        Bola bola = new Bola();
        bola.setjari_jari(7);
        bola.tampilVolume();
        
        //Tabung
        Tabung tabung = new Tabung();
        tabung.setjari_jari(10);
        tabung.setTinggi(21);
        tabung.tampilVolume();
        
        //Kerucut
        Kerucut kerucut = new Kerucut();
        kerucut.setjari_jari(14);
        kerucut.setTinggi(9);
        kerucut.tampilVolume();
        
    }
    
}
