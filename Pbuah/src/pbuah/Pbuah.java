/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbuah;

/**
 *
 * @author USER
 */
public class Pbuah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        buah buahku=new buah();
        buahku.setbuah("Jeruk");
        buahku.setharga(18000);
        System.out.println("Buah:"+buahku.NamaBuah());
        System.out.println("Harga:"+buahku.tampilHarga());
     }
 }
 