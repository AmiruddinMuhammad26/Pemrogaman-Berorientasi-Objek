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
public class buah {
    public String nama;
    public String rasa;
    public String warna;
    public int berat;
    public double harga;
    public void setbuah(String nm){
    nama=nm;
    }
    public void setharga(double hrg){
    harga=hrg;
    }
    public String NamaBuah(){
    return nama;
    }
    public double tampilHarga(){
    return harga;
    }
    public String tampilRasa(){
    return rasa;
    }
}
