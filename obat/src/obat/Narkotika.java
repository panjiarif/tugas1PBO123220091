/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obat;

/**
 *
 * @author ACER
 */
public class Narkotika extends Obat{
    
    public static String golongan = "\"Narkotika\"\n(Lingkaran Putih dengan tanda \"+\")";

    //construktor
    Narkotika(String nama, int dosis, boolean resep){
        super(nama,dosis,resep);
    }
    
    @Override
    void tampilkanGolongan(){
        System.out.println(golongan);
    }
}
