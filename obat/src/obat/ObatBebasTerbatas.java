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
public class ObatBebasTerbatas extends Obat{
    
    public static String golongan = "\"Obat Bebas Terbatas\"\n(Lingkaran Biru)";
    
    //construktor
    ObatBebasTerbatas(String nama, int dosis, boolean resep){
        super(nama, dosis, resep);
    }
    
    void tampilkanGolongan(){
        System.out.println(golongan);
    }
}
