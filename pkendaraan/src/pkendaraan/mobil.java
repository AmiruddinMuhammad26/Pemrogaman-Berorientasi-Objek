/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkendaraan;

/**
 *
 * @author USER
 */
public class mobil {
    public String merk;
    public String type;
    public int jumlahroda;
    
    public mobil(String m, String t, int jr){
        this.merk=m;
        this.type=t;
        this.jumlahroda=jr;
    }
    
    public void tampilmobil(){
        System.out.println("Identitas Mobil");
        System.out.println("Merk : "+merk+"\n"+"Type : "+type+"\n"+"Jumlah Roda : "+jumlahroda+ "\n");
    }
}
