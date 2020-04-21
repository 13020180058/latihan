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
public class Person {
    protected String nama;
protected String alamat;

public Person(){
System.out.println("inside person:construktor");
nama = "";
alamat = "";
}

public Person(String nama, String alamat) {
this.nama = nama;
this.alamat = alamat;
    }

public String getAlamat() {
return alamat;
    }

public void setAlamat(String alamat) {
this.alamat = alamat;
    }

public String getNama() {
return nama;
    }

public void setNama(String nama) {
this.nama = nama;
    }

}
