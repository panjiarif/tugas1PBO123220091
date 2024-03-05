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
public abstract class Obat{

    private String nama;
    private int  dosis;
    private boolean harusResep;
    
    Obat(String nama, int dosis, boolean harusResep){
        this.nama = nama;
        this.dosis = dosis;
        this.harusResep = harusResep;
//        this.jumlahData++;
    }
    
    public void display(){
        System.out.println("Nama obat : " + this.nama);
        if(this.harusResep){
            System.out.println("Harus dengan resep dokter");
        }else{
            System.out.println("Boleh tanpa resep dokter");
        }
    }
    
    public int getDosis(){
        return this.dosis;
    }
    
    public String setNama(String namaBaru){
        this.nama = namaBaru;
        return this.nama;
    }
    
    abstract void tampilkanGolongan();

}
