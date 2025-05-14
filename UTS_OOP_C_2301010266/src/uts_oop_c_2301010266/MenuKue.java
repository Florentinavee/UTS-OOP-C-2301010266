package uts_oop_c_2301010266;

/**
 *
 * @author Florentina Minovela Nasa
 * Tanggal : 14 Mei 2025
 */
public class MenuKue {
    private String kode;
    private String nama;
    private double harga;
    private String deskripsi;
    
    public MenuKue(String kode, String nama, double harga, String deskripsi) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.deskripsi = deskripsi;
    }
    
    public MenuKue() {
        this.kode = "";
        this.nama = "";
        this.harga = 0;
        this.deskripsi = "";
    }
    
    public String getKode() {
        return kode;
    }
    
    public void setKode(String kode){
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public String getDeskripsi() {
        return deskripsi;
    }
    
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    
    @Override
    public String toString() {
        return "Kode: " + kode + ", Nama: " + nama + ", Harga: Rp. " + harga + ", Keterangan: " + deskripsi;
    }
}
