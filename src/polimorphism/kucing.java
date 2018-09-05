/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphism;

/**
 *
 * @author WINDOWS 10
 */
class kucing extends hewan{
    
    @Override
    void setNama() {
        String kucing = "Carberus";
        System.out.println("Nama kucing  : " +kucing);
    }
    @Override
    void setSuara() {
        String suara = "Miauw meow meong";
        System.out.println("Suara kucing : " +suara);
    }
    void setBerat() {
        double berat = 2.0;
        System.out.println("Berat kucing : " +berat+"Kg");
    }
}
