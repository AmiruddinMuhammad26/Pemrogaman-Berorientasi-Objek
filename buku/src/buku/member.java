/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buku;

/**
 *
 * @author USER
 */
public class member {
    public String Pengarang;
    public  String Judul;
    public String Penerbit;
    public String Tahun;
    
    public member(String pengarang, String judul, String penerbit, String tahun){
        this.Pengarang=pengarang;
        this.Judul=judul;
        this.Penerbit=penerbit;
        this.Tahun=tahun;
    }
    
    public void tampilmember(){
        System.out.println("Data-data buku perpustakaan");
        System.out.println("Pengarang Buku : "+Pengarang+ "\n" + "Judul Buku : "+Judul+ "\n" + "Penerbit Buku : "+Penerbit+ "\n" + "Tahun Buku : "+Tahun+ "\n");
    } 
}
