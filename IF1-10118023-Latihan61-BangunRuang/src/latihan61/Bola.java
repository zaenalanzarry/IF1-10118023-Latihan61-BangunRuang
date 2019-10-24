/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan61;

/**
 *
 * @author Zaenal PC
 */
public class Bola implements BangunRuang {
    private int jari_jari;
    
    public void setjari_jari(int jari_jari){
        this.jari_jari = jari_jari;
    }
    
    @Override
    public double hitungVolume (){
        return (1.33333 * 3.142857 * (Math.pow(jari_jari, 3)));
    }
    
    @Override
    public void tampilVolume(){
        System.out.printf("Volume Bola adalah %.1f ", hitungVolume());
        System.out.println("cm^3");
        System.out.println("");
    }
    
}
