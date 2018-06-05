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
public class PekerjaanModel {
    private String namaPekerjaan, jenisPekerjaan, awalMasuk, periode, bagian;

    public PekerjaanModel(String namaPekerjaan, String jenisPekerjaan, String awalMasuk, String periode, String bagian) {
        this.namaPekerjaan = namaPekerjaan;
        this.jenisPekerjaan = jenisPekerjaan;
        this.awalMasuk = awalMasuk;
        this.periode = periode;
        this.bagian = bagian;
    }    
    
    public void viewPekerjaan(){
         System.err.println("Nama Pekerjaan : " + this.namaPekerjaan);
         System.err.println("Jenis Pekerjaan : " + this.jenisPekerjaan);
         System.err.println("Awal Masuk Pekerjaan : " + this.awalMasuk);
         System.err.println("Periode Pekerjaan : " + this.periode);
         System.err.println("Bagian Pekerjaan : " + this.bagian);
    }
}
