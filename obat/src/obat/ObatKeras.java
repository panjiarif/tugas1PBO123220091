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
public class ObatKeras extends Obat{
    
    public static String golongan = "\"Obat Keras\"\n(Lingkaran Merah dengan huruf \"K\")";

    //construktor
    ObatKeras(String nama, int dosis, boolean resep){
        super(nama,dosis,resep);
    }
    
    @Override
    void tampilkanGolongan(){
        System.out.println(golongan);
    }
}
