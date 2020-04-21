/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pewarisan_inheritance.java;

/**
 *
 * @author ASUS-PC
 */

    public class Mahasiswa extends Person{
    private int nim;
    private String jurusan;

    public Mahasiswa() {
    }

    public Mahasiswa(int nim, String nama,String jurusan, String alamat) {
        this.nim = nim;
        this.jurusan = jurusan;
        super.nama = nama;
        super.alamat =  alamat;
    }

    public static void main(String[] args) {
               Mahasiswa mhs = new Mahasiswa();
        System.out.println("Nim = "+mhs.nim);
        System.out.println("Nama = "+mhs.nama);
        System.out.println("Jurusan = "+mhs.jurusan);
        System.out.println("Alamat = "+mhs.alamat);

        Mahasiswa mahasiswa1 = new Mahasiswa(105410249,"biyono","TI","wonosobo");
        System.out.println("Nim = "+mahasiswa1.nim);
        System.out.println("Nama = "+mahasiswa1.nama);
        System.out.println("Jurusan = "+mahasiswa1.jurusan);
        System.out.println("Alamat = "+mahasiswa1.alamat);
    }

    }
    

