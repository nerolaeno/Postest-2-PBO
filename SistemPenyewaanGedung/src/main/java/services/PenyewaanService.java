package services;

import java.util.ArrayList;
import java.util.Scanner;
import models.Penyewa;

public class PenyewaanService {
    private ArrayList<Penyewa> daftarPenyewaan = new ArrayList<>();
    private int idCounter = 1;
    private Scanner input = new Scanner(System.in);

    public void isiDummyData() {
        Penyewa p1 = new Penyewa(null, null, null, null, 0);
        p1.id = String.valueOf(idCounter++);
        p1.nama = "Na Jaemin";
        p1.jenisKegiatan = "Fansign";
        p1.tanggalSewa = "20-10-2025";
        p1.lamaSewa = 2;

        Penyewa p2 = new Penyewa(null, null, null, null, 0);
        p2.id = String.valueOf(idCounter++);
        p2.nama = "Loren";
        p2.jenisKegiatan = "Seminar";
        p2.tanggalSewa = "04-09-2025";
        p2.lamaSewa = 1;

        Penyewa p3 = new Penyewa(null, null, null, null, 0);
        p3.id = String.valueOf(idCounter++);
        p3.nama = "Inforsa";
        p3.jenisKegiatan = "Workshop";
        p3.tanggalSewa = "25-09-2025";
        p3.lamaSewa = 3;

        daftarPenyewaan.add(p1);
        daftarPenyewaan.add(p2);
        daftarPenyewaan.add(p3);
    }
    
    public void tambahPenyewaan() {
        System.out.print("Nama Penyewa: ");
        String nama = input.nextLine().trim();
        if (nama.isEmpty()) {
            System.out.println("Nama tidak boleh kosong!");
            return;
        }

        System.out.print("Jenis Kegiatan: ");
        String kegiatan = input.nextLine().trim();

        System.out.print("Tanggal Sewa (DD-MM-YYYY): ");
        String tanggal = input.nextLine().trim();

        System.out.print("Lama Sewa (hari): ");
        int lama;
        try {
            lama = Integer.parseInt(input.nextLine().trim());
            if (lama <= 0) {
                System.out.println("Lama sewa harus lebih dari 0!");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Input lama sewa harus angka!");
            return;
        }

        String id = String.valueOf(idCounter++);
        Penyewa p = new Penyewa(id, nama, kegiatan, tanggal, lama);
        daftarPenyewaan.add(p);
        System.out.println(" Data berhasil ditambahkan.");
    }

    public void tampilkanPenyewaan() {
        if (daftarPenyewaan.isEmpty()) {
            System.out.println("Belum ada data penyewaan.");
            return;
        }

        System.out.println("\nDaftar Penyewaan");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.printf("| %-5s | %-20s | %-20s | %-12s | %-10s |\n", 
                          "ID", "Nama Penyewa", "Jenis Kegiatan", "Tanggal Sewa", "Lama (hari)");
        System.out.println("------------------------------------------------------------------------------------");

        for (Penyewa p : daftarPenyewaan) {
            System.out.printf("| %-5s | %-20s | %-20s | %-12s | %-10d |\n",
                              p.id, p.nama, p.jenisKegiatan, p.tanggalSewa, p.lamaSewa);
        }

        System.out.println("------------------------------------------------------------------------------------");
    }

    public void ubahPenyewaan() {
        System.out.print("Masukkan ID penyewaan yang ingin diubah: ");
        String id = input.nextLine();

        for (Penyewa p : daftarPenyewaan) {
            if (p.id.equals(id)) {
                System.out.print("Tanggal Sewa Baru (DD-MM-YYYY): ");
                p.tanggalSewa = input.nextLine();

                System.out.print("Lama Sewa Baru (hari): ");
                try {
                    p.lamaSewa = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Input lama sewa harus angka!");
                    return;
                }
                System.out.println("Data berhasil diubah.");
                return;
            }
        }
        System.out.println("Data dengan ID tersebut tidak ditemukan.");
    }

    public void hapusPenyewaan() {
        System.out.print("Masukkan ID penyewaan yang ingin dihapus: ");
        String id = input.nextLine();

        for (int i = 0; i < daftarPenyewaan.size(); i++) {
            if (daftarPenyewaan.get(i).id.equals(id)) {
                daftarPenyewaan.remove(i);
                System.out.println("Data berhasil dihapus.");
                return;
            }
        }
        System.out.println("Data dengan ID tersebut tidak ditemukan.");
    }

    public void cariPenyewaan() {
        System.out.print("Masukkan nama penyewa yang dicari: ");
        String keyword = input.nextLine().toLowerCase();

        boolean ditemukan = false;
        for (Penyewa p : daftarPenyewaan) {
            if (p.nama.toLowerCase().contains(keyword)) {
                tampilkanDetail(p);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada penyewaan dengan nama tersebut.");
        }
    }

    private void tampilkanDetail(Penyewa p) {
        System.out.println("----------------------------");
        System.out.println("ID Penyewaan : " + p.id);
        System.out.println("Nama Penyewa : " + p.nama);
        System.out.println("Jenis Kegiatan : " + p.jenisKegiatan);
        System.out.println("Tanggal Sewa : " + p.tanggalSewa);
        System.out.println("Lama Sewa    : " + p.lamaSewa + " hari");
        System.out.println("----------------------------");
    }
}
