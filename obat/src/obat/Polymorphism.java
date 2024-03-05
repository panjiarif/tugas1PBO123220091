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
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Obat[] O = new Obat[5];
        O[0] = new ObatBebas("Paracetamol",500,false);
        O[1] = new ObatBebasTerbatas("Cetirizine",10,false);
        O[2] = new ObatKeras("Salbutamol",4,true);
        O[3] = new Psikotropika("Diazepam",2,true);
        O[4] = new Narkotika("Codein",30,true);
        
        for(int i=0;i<5;i++){
            System.out.println("\nData Obat ke-" + (i+1));
            
            O[i].display();
            System.out.println("Dosis : " + O[i].getDosis() + " mg");
            O[i].tampilkanGolongan();
        }
        
        //mengubah nama obat dengan encapsulation (getter&setter)
        System.out.println("\n(Encapsulation)");
        O[0].display();
        System.out.println("Nama Obat diubah menjadi " + O[0].setNama("Oskadon"));
        O[0].display();

    }
    
}
