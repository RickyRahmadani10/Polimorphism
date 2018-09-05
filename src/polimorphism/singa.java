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
class singa extends hewan{
    
    @Override
    void setNama() {
        String singa = "Diablo";
        System.out.println("Nama singa  : " +singa);
    }
    @Override
    void setSuara() {
        String suara = "Roarrrr ";
        System.out.println("Suara singa : " +suara);
    }
    void setBerat() {
        double berat = 10.0;
        System.out.println("Berat singa : " +berat+"Kg");
    }
}
