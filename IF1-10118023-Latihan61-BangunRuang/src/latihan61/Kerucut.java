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
public class Kerucut extends LuasAlas implements BangunRuang{
    private int jari_jari;
    private int tinggi;
    
    public void setjari_jari(int jari_jari){
        this.jari_jari = jari_jari;
    }
    
    @Override
    public double alas(){
        return 3.142857 * Math.pow(jari_jari, 2);
    }
    
    public void setTinggi (int tinggi){
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return (alas() * tinggi) / 3;
    }
    
    @Override
    public void tampilVolume() {
        System.out.printf("Volume Kerucut adalah %.0f ", hitungVolume());
        System.out.println("cm^3");
        System.out.println("");
    }

    
    
    
}
