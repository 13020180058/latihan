/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasku;

/**
 *
 * @author ASUS-PC
 */
public class Mahasiswa {
    private int nrp;
    private String nama; 
    public Mahasiswa (int nrp, String nama){
     this.nrp = nrp;
     this.nama = nama;
    }
    public int getNrp(){
     return nrp;
    }
    public String getNama(){
     return nama;
 }

}
