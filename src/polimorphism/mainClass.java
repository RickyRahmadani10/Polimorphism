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
public class mainClass extends overloadingMethod{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String [] args) {
        overloadingMethod ovm = new overloadingMethod();
        System.out.println(ovm.hitung(1.5, 2.5));
        System.out.println(ovm.hitung(5, 5));
    }
    
    @Override
    double hitung(double nilai1, double nilai2) {
        return nilai1 + nilai2;
    }
}
