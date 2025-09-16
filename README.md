# Postest 2 Praktikum PBO | Sistem penyewaan gedung

Nama : Alvionej Resna Lawrend Pandiangan

NIM  : 2409116073

## Deskripsi Program
Program Sistem Penyewaan Gedung merupakan aplikasi sederhana yang meniru fungsi dasar dari sistem pengelolaan penyewaan gedung serbaguna. Program ini memungkinkan user untuk melakukan operasi dasar seperti menambahkan data penyewaan gedung, menampilkan daftar penyewaan yang telah tercatat, mengubah data penyewaan yang sudah ada, serta menghapus data penyewaan dari sistem. Setiap data penyewaan berisi informasi seperti nama penyewa, jenis kegiatan, tanggal penyewaan, dan lama sewa dalam hitungan hari. Program ini dibuat menggunakan bahasa pemrograman Java

# Output Program

### Menu Utama
Pada saat User pertama kali menjalankan program dan masuk ke program, User akan dihadapkan dengan menu seperti gambar ini.

![alt text](image.png)

### 1. Tambah Penyewaan

Jika pengguna memilih menu ini, program akan meminta input berupa nama penyewa, jenis kegiatan, tanggal sewa, dan lama sewa dalam hitungan hari. Setelah semua data dimasukkan, sistem akan menambahkan data penyewaan baru ke daftar dan menampilkan pesan konfirmasi bahwa data berhasil ditambahkan.

![alt text](image-1.png)

### 2. Lihat Semua Penyewaan

Menu ini digunakan untuk menampilkan semua data penyewaan yang sudah tercatat. Data akan ditampilkan dalam bentuk tabel yang memuat kolom ID, Nama Penyewa, Jenis Kegiatan, Tanggal Sewa, dan Lama Sewa (hari). Jika belum ada data, program akan menampilkan pesan bahwa data masih kosong.

![alt text](image-2.png)

### 3. Ubah Data Penyewaan

Menu ini memungkinkan pengguna mengubah data penyewaan yang sudah ada. Program akan meminta input ID penyewaan yang ingin diubah. Jika ID ditemukan, pengguna dapat memasukkan data baru seperti nama penyewa, jenis kegiatan, tanggal sewa, atau lama sewa. Setelah selesai, program menampilkan pesan konfirmasi bahwa data berhasil diubah.

![alt text](image-3.png)

### 4. Hapus Data Penyewaan

Jika pengguna memilih menu ini, program akan meminta input ID penyewaan yang ingin dihapus. Jika ID ditemukan, data tersebut akan dihapus dari daftar penyewaan, dan program menampilkan pesan konfirmasi bahwa data berhasil dihapus. Jika ID tidak ditemukan, akan muncul pesan peringatan.

![alt text](image-4.png)

Untuk melihat apakah data sudah terhapus, pilih menu 2 (Lihat Wahana).

![alt text](image-5.png)
### 5. Cari Penyewaan

Menu ini digunakan untuk mencari data penyewaan berdasarkan nama penyewa. Program akan meminta pengguna memasukkan kata kunci nama, lalu menampilkan semua data penyewaan yang cocok dalam format tabel. Jika tidak ada data yang cocok, program akan memberi tahu bahwa data tidak ditemukan.

![alt text](image-6.png)

### 6. Keluar

Jika pengguna memilih menu ini, program akan menampilkan pesan “Terima kasih, silahkan datang kembali!” kemudian menghentikan seluruh proses program.

![alt text](image-7.png)

## =============================================

![alt text](image-8.png)

1. com.mycompany.sistempenyewaangedung

     Berisi file SistemPenyewaanGedung.java. :
    -Menampilkan menu utama kepada pengguna
    -Menerima input dari pengguna
    -Mengarahkan proses ke bagian yang sesuai (menambah, melihat, mengubah, menghapus, mencari penyewaan)


2. models

    Berisi class yang menyimpan data.
    -Admin.java : Menyimpan data admin (username, password, dsb.)
    -Gedung.java : Menyimpan data gedung (nama, kapasitas, harga sewa)
    -Penyewa.java : Menyimpan data penyewa (nama penyewa, jenis kegiatan,  tanggal sewa, lama sewa)

    Package ini hanya untuk menyimpan data, tidak ada proses perhitungan di sini.

3. services

    Berisi proses atau logika utama program.
    -PenyewaanService.java → Mengatur semua proses seperti menambah penyewaan, menampilkan daftar, mengubah data, menghapus data, dan mencari data.
