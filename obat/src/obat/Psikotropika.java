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
public class Psikotropika extends Obat{
    
    public static String golongan = "\"Psikotropika\"\n(Lingkaran Merah dengan huruf \"K\")";

    //construktor
    Psikotropika(String nama, int dosis, boolean resep){
        super(nama,dosis,resep);
    }
    
    @Override
    void tampilkanGolongan(){
        System.out.println(golongan);
    }
}
