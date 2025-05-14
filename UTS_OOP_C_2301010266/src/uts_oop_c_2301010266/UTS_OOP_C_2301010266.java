package uts_oop_c_2301010266;

import java.util.Scanner;

/**
 *
 * @author Florentina Minovela Nasa
 * Tanggal : 14 Mei 2025
 */
public class UTS_OOP_C_2301010266 {
    static MenuKue[] data = new MenuKue[100];
    static int jumlahData = 0;
    static Scanner input = new Scanner(System.in);
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== MENU TOKO KUE BAKEDREAM ===");
            System.out.println("1. Tambah Menu Kue");
            System.out.println("2. Tampilkan Menu");
            System.out.println("3. Ubah Menu Kue");
            System.out.println("4. Hapus Menu Kue");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1: tambahData(); break;
                case 2: tampilData(); break;
                case 3: ubahData(); break;
                case 4: hapusData(); break;
                case 5: System.out.println("Keluar..."); break;
                default: System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }
    
    static void tambahData() {
        System.out.print("Kode Menu: ");
        String kode = input.nextLine();
        System.out.print("Nama Kue: ");
        String nama = input.nextLine();
        System.out.print("Harga Jual: ");
        double harga = input.nextDouble();
        input.nextLine();
        System.out.print("Deskripsi: ");
        String deskripsi = input.nextLine();

        data[jumlahData] = new MenuKue(kode, nama, harga, deskripsi);
        jumlahData++;
        System.out.println("Menu berhasil ditambahkan!");
    }
    
    static void tampilData() {
        if (jumlahData == 0) {
            System.out.println("Belum ada menu.");
            return;
        }
        for (int i = 0; i < jumlahData; i++) {
            System.out.println((i + 1) + ". " + data[i]);
        }
    }
    
    static void ubahData() {
        tampilData();
        System.out.print("Pilih nomor menu yang akan diubah: ");
        int index = input.nextInt() - 1;
        input.nextLine();
        if (index >= 0 && index < jumlahData) {
            System.out.print("Kode Baru: ");
            String kode = input.nextLine();
            System.out.print("Nama Baru: ");
            String nama = input.nextLine();
            System.out.print("Harga Baru: ");
            double harga = input.nextDouble();
            input.nextLine();
            System.out.print("Deskripsi Baru: ");
            String deskripsi = input.nextLine();

            data[index].setKode(kode);
            data[index].setNama(nama);
            data[index].setHarga(harga);
            data[index].setDeskripsi(deskripsi);
            System.out.println("Menu berhasil diubah.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }
    
    static void hapusData() {
        tampilData();
        System.out.print("Pilih nomor menu yang akan dihapus: ");
        int index = input.nextInt() - 1;
        input.nextLine();
        if (index >= 0 && index < jumlahData) {
            for (int i = index; i < jumlahData - 1; i++) {
                data[i] = data[i + 1];
            }
            jumlahData--;
            System.out.println("Menu berhasil dihapus.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }
    
}
