package kelas3turunan;
/**
 *
 * @author iav
 */
public class ViewMain {
    public static void main(String[] args) {
       KTPModel kTPModel = new KTPModel("812739872894732", "Ade Fajr Ariav", "30 Juli 199", "Laki - Laki", "Kab. Semarang", "ISLAM", "Belum Kawin", "Mahasiswa", "WNI");
       AsetModel asetModel = new AsetModel("Rumah magrong", "Rp. 999.999.999.999");
       PekerjaanModel pekerjaanModel = new PekerjaanModel("Junior Mobile", "Programmer", "2017", "2 tahun", "Ngoding");
       kTPModel.viewKtp();
       pekerjaanModel.viewPekerjaan();
       asetModel.viewAset();
       
    }
}