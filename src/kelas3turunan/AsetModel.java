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
public class AsetModel {
    private String jenisBarang, hargaBarang;

    public AsetModel(String jenisBarang, String hargaBarang) {
        this.jenisBarang = jenisBarang;
        this.hargaBarang = hargaBarang;
    }
    
    public void viewAset(){
        System.err.println("Jenis Barang : " + this.jenisBarang);
        System.err.println("Harga Barang : " + this.hargaBarang);
    }
}
