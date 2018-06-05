/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelas3turunan;

/**
 *
 * @author iav
 */
public class KTPModel {
    private String nik, nama,  ttl, jk, alamat, agama, status_kawin, pekerjaan, kewarganegaraan;

    public KTPModel(String nik, String nama, String ttl, String jk, String alamat, String agama, String status_kawin, String pekerjaan, String kewarganegaraan) {
        this.nama = nama;
        this.nik = nik;
        this.ttl = ttl;
        this.jk = jk;
        this.alamat = alamat;
        this.agama = agama;
        this.status_kawin = status_kawin;
        this.pekerjaan = pekerjaan;
        this.kewarganegaraan = kewarganegaraan;
    }
    
    public void viewKtp(){
            System.err.println("nama : " + this.nama);
            System.err.println("nik : " + this.nik);
            System.err.println("ttl : " + this.ttl);
            System.err.println("jeniskelamin : " + this.jk);
            System.err.println("alamat : " + this.alamat);
            System.err.println("agama : " + this.agama);
            System.err.println("status_kawin : " + this.status_kawin);
            System.err.println("pekerjaan : " + this.pekerjaan);
            System.err.println("kewarganegaraan : " + this.kewarganegaraan);
    }
}
