# PROGRAM APLIKASI MANAJEMEN KARYAWAN PERUSAHAAN

KELOMPOK 5 
1. Muthmainnah Aisyah (2209116001)
2. Vera Santi Wijaya (2209116007)

## Latar Belakang
MuVista Glow Company adalah perusahaan yang berfokus pada industri kecantikan. Perusahaan ini mengalami pertumbuhan yang sangat pesat dalam beberapa tahun terakhir, yang menyebabkan terjadinya peningkatan yang signifikan pada jumlah karyawan perusahaan. Dengan bertambahnya jumlah karyawan menjadi sebuah tantangan bagi perusahaan dalam memanajemen data para karyawan di perusahaannya. MuVista Glow Company menyadari bahwa pengelolaan data karyawan tidak lagi dapat dilakukan secara manual sehingga perusahaan berusaha mengambil langkah proaktif dalam pengelolaan data karyawan. Dari permasalahan tersebut MuVista Glow Company membuat sebuah sistem aplikasi yang dapat memudahkan perusahaan dalam memanajemen data para karyawannya.

## 📌 Deskripsi Project
- Program aplikasi manajemen karyawan perusahaan dibuat dengan tujuan mengelola data para karyawan yang ada dalam perusahaan tersebut, dengan mengkategorikan dengan jabatan dari karyawan tersebut.
- Dalam menjalankan aplikasi ini memakai local phpMyAdmin sebagai database untuk menyimpan data yang telah diolah
- aa

## 📊 Flowchart

## 🛢ERD
![PA-VER-6 1](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122006658/2274403a-843e-49c5-980c-5143b4608e31)

![PA-VER-6 2](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122006658/b5f14786-4842-4541-8ff8-809cd1d87a1c)

## Hierarki Kelas
Hierarki kelas dibuat berdasarkan program aplikasi yang telah dibuat, yang dimana pada program tersebut menerapkan materi inheritance atau bisa disebut dengan turunan. Berikut adalah hierarki kelas dari program aplikasi yang telah dibuat:

![PA_PBO_FLOWCHART-hc drawio](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122006658/c7ad231a-f2fb-4dea-b29c-bbd0d3cf3dee)
  
## Source Code dan Penjelasan
### package controler
#### admin.java
mengimpor paket java.sql.SQLException dan menggunakan kelas model.databaseConnection untuk mengelola koneksi ke database. 

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/b5039993-08e4-45b9-8bb1-dd627b43fe31)

Kelas Java admin adalah kelas final yang memiliki atribut username dan password untuk menyimpan informasi administrasi. Kelas ini juga memiliki atribut db yang merupakan instance dari kelas databaseConnection untuk mengelola koneksi ke database. 

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/2139537b-8dd2-4664-9917-5ba98cbc1ace)

Metode `login` ini digunakan untuk mencoba login ke database dengan memeriksa kesesuaian username dan password di tabel `admin`. Ini adalah metode publik dan final yang mengembalikan `true` jika login berhasil dan `false` jika gagal. Dalam metode ini:
- Terdapat variabel `isOperationSuccess` yang awalnya diatur sebagai `false` untuk menandai keberhasilan operasi login.
- Dilakukan koneksi ke database melalui `this.db.openConnection()`.
- Kemudian, pernyataan SQL untuk memeriksa username dan password disiapkan dan dieksekusi.
- Jika hasil query mengembalikan setidaknya satu baris, `isOperationSuccess` diubah menjadi `true` menandakan login berhasil.
- Kesalahan SQL ditangani dalam blok catch dan pesan kesalahan ditampilkan dengan menggunakan `this.db.displayErrors(ex)`.
- Blok finally selalu menutup koneksi ke database.
- Akhirnya, metode `login` mengembalikan nilai `isOperationSuccess` yang menunjukkan apakah login berhasil atau tidak.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/f5a4d1ef-ff96-4f84-bebf-6312532a7a7f)

Kode tersebut mengimpor kelas databaseConnection dan beberapa kelas Java SQL terkait, seperti SQLException, Statement, dan ResultSet, yang digunakan untuk mengelola koneksi dan operasi database.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/fb090369-4a41-4264-8ffb-ed593732e782)

- Kelas ini memiliki sebuah atribut db yang merupakan instance dari kelas databaseConnection. Ini mungkin digunakan untuk berinteraksi dengan database atau melakukan operasi pengelolaan data terkait karyawan.
- Terdapat beberapa atribut publik yang mewakili informasi tentang seorang karyawan, seperti NIP (Nomor Induk Pegawai), nama, email, nomor telepon, status, durasi kerja, dan gaji.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/0a539648-7c59-4094-bc8b-23d7f3d8adc2)

- `private final int getId()`: Ini adalah metode `getId` yang bersifat pribadi (private) dan mengembalikan nilai integer. Metode ini digunakan untuk mengambil nilai NIP (Nomor Induk Pegawai) dari seorang karyawan dan mengembalikannya. Karena metode ini bersifat private, hanya dapat diakses dari dalam kelas `karyawan` itu sendiri.
- `public final void setStatus(String statuskaryawan)`: Ini adalah metode `setStatus` yang bersifat publik dan tidak mengembalikan nilai (void). Metode ini digunakan untuk mengatur nilai atribut `status` dari seorang karyawan berdasarkan nilai yang diberikan sebagai parameter.
- `public final String getStatus()`: Ini adalah metode `getStatus` yang bersifat publik dan mengembalikan nilai dalam bentuk string. Metode ini digunakan untuk mengambil nilai atribut `status` dari seorang karyawan dan mengembalikannya sebagai string.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/9fce4b45-1881-4037-ac10-7c75f7187726)

Kode yang Anda bagikan adalah metode `find` dalam kelas `karyawan`. Metode ini digunakan untuk mencari informasi seorang karyawan berdasarkan NIP (Nomor Induk Pegawai) yang diberikan. Berikut penjelasan langkah-langkah dalam metode `find` ini:
- `public final boolean find(int nip_karyawan) {`: Metode `find` adalah metode publik yang mengembalikan nilai boolean (true atau false) dan menerima parameter NIP karyawan yang akan dicari.
- Variabel `isOperationSuccess` dideklarasikan dengan nilai awal false. Ini akan digunakan untuk menandai apakah operasi pencarian berhasil.
- Dalam blok try, Anda membuka koneksi ke database menggunakan `this.db.openConnection()`.
- Kemudian, Anda membuat pernyataan SQL untuk mencari karyawan dengan NIP yang sesuai.
- Anda mengisi parameter dalam pernyataan SQL dengan NIP yang diberikan.
- Perintah SQL dieksekusi, dan hasilnya disimpan dalam objek `this.db.resultSet`.
- Jika ada hasil (baris yang sesuai), Anda mengisi atribut-atribut karyawan (NIP, nama, email, nomor telepon, dan status) dengan data dari hasil pencarian. Kemudian, `isOperationSuccess` diatur menjadi `true` untuk menandakan bahwa pencarian berhasil.
- Jika terjadi kesalahan SQL, pengecualian ditangani dalam blok catch dan pesan kesalahan ditampilkan menggunakan `this.db.displayErrors(ex)`.
- Blok finally selalu menutup koneksi ke database dengan `this.db.closeConnection()`.
- Terakhir, metode `find` mengembalikan nilai `isOperationSuccess`, yang akan menjadi `true` jika pencarian berhasil dan `false` jika tidak.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/012ec1c5-58e8-40e1-a43e-bf362cf5f3d8)

Kode yang Anda bagikan adalah metode `create` dalam kelas `karyawan`. Metode ini digunakan untuk membuat entri karyawan baru dalam database. Berikut adalah penjelasan langkah-langkah dalam metode `create` ini:
1. `public final boolean create() {`: Metode `create` adalah metode publik yang mengembalikan nilai boolean (true atau false).
2. Variabel `isOperationSuccess` dideklarasikan dengan nilai awal false. Ini akan digunakan untuk menandai apakah operasi penciptaan karyawan berhasil.
3. Dalam blok try, Anda membuka koneksi ke database menggunakan `this.db.openConnection()`.
4. Anda memeriksa apakah data karyawan yang akan dibuat valid dengan memanggil metode `isDataValid()` dan juga memeriksa apakah NIP yang akan digunakan belum ada dalam database dengan memanggil metode `isIdExists(this.nip_karyawan)`.
5. Jika data valid dan NIP belum ada dalam database, Anda menyiapkan pernyataan SQL untuk menyimpan data karyawan baru ke dalam tabel.
6. Anda mengisi parameter dalam pernyataan SQL dengan informasi karyawan yang akan dibuat, seperti NIP, nama, email, nomor telepon, gaji, durasi kerja, dan status.
7. Pernyataan SQL dieksekusi dengan `this.db.preparedStatement.executeUpdate()`, dan hasil eksekusi disimpan dalam variabel `result`.
8. Jika hasil eksekusi mengembalikan nilai lebih besar dari 0, ini menandakan bahwa operasi pembuatan karyawan berhasil. NIP karyawan baru diperoleh dari database dengan `this.db.generateLastId()` dan diatur sebagai NIP karyawan yang telah dibuat.
9. Jika ada kesalahan SQL, pengecualian ditangani dalam blok catch dan pesan kesalahan ditampilkan menggunakan `this.db.displayErrors(ex)`.
10. Blok finally selalu menutup koneksi ke database dengan `this.db.closeConnection()`.
11. Terakhir, metode `create` mengembalikan nilai `isOperationSuccess`, yang akan menjadi `true` jika pembuatan karyawan berhasil dan `false` jika tidak.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/f43f9274-9954-4dff-a24e-6de32d4b2b59)

Kode yang Anda bagikan adalah metode `update` dalam kelas `karyawan`. Metode ini digunakan untuk memperbarui informasi seorang karyawan dalam database. Berikut adalah penjelasan langkah-langkah dalam metode `update` ini:
- `public final boolean update() {`: Metode `update` adalah metode publik yang mengembalikan nilai boolean (true atau false).
- Variabel `isOperationSuccess` dideklarasikan dengan nilai awal false. Ini akan digunakan untuk menandai apakah operasi pembaruan karyawan berhasil.
- Dalam blok try, Anda membuka koneksi ke database menggunakan `this.db.openConnection()`.
- Anda memeriksa apakah data karyawan yang akan diupdate adalah valid dengan memanggil metode `isDataValid()`.
- Jika data valid, Anda menyiapkan pernyataan SQL untuk mengupdate data karyawan dalam tabel. Pernyataan SQL ini mencakup pembaruan nama, email, nomor telepon, gaji, dan durasi kerja berdasarkan NIP karyawan.
- Anda mengisi parameter dalam pernyataan SQL dengan nilai-nilai yang sesuai dengan atribut karyawan yang ingin diperbarui.
- Pernyataan SQL dieksekusi dengan `this.db.preparedStatement.executeUpdate()`, dan hasil eksekusi disimpan dalam variabel `result`.
- Jika hasil eksekusi mengembalikan nilai lebih besar dari 0, ini menandakan bahwa operasi pembaruan berhasil. `isOperationSuccess` diatur menjadi `true`.
- Jika ada kesalahan SQL, pengecualian ditangani dalam blok catch dan pesan kesalahan ditampilkan menggunakan `this.db.displayErrors(ex)`.
- Blok finally selalu menutup koneksi ke database dengan `this.db.closeConnection()`.
- Terakhir, metode `update` mengembalikan nilai `isOperationSuccess`, yang akan menjadi `true` jika pembaruan berhasil dan `false` jika tidak.
  
![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/7fc920cb-2dcd-48e5-b815-5797af80baad)

Kode di atas adalah metode `delete` dalam kelas `karyawan`, yang digunakan untuk menghapus data seorang karyawan dari database. Berikut adalah penjelasan langkah-langkah dalam metode `delete` ini:
- `public final boolean delete() {`: Metode `delete` adalah metode publik yang mengembalikan nilai boolean (true atau false).
- Variabel `isOperationSuccess` dideklarasikan dengan nilai awal false. Ini akan digunakan untuk menandai apakah operasi penghapusan data karyawan berhasil.
- Dalam blok try, Anda membuka koneksi ke database menggunakan `this.db.openConnection()`.
- Anda menyusun pernyataan SQL yang berisi perintah DELETE untuk menghapus data karyawan dari tabel berdasarkan NIP karyawan.
- Anda mengisi parameter dalam pernyataan SQL dengan NIP karyawan yang akan dihapus.
- Pernyataan SQL dieksekusi dengan `this.db.preparedStatement.executeUpdate()`, dan hasil eksekusi disimpan dalam variabel `result`.
- Jika hasil eksekusi mengembalikan nilai lebih besar dari 0, ini menandakan bahwa operasi penghapusan berhasil. `isOperationSuccess` diatur menjadi `true`.
- Jika ada kesalahan SQL, pengecualian ditangani dalam blok catch dan pesan kesalahan ditampilkan menggunakan `this.db.displayErrors(ex)`.
- Blok finally selalu menutup koneksi ke database dengan `this.db.closeConnection()`.
- Terakhir, metode `delete` mengembalikan nilai `isOperationSuccess`, yang akan menjadi `true` jika penghapusan berhasil dan `false` jika tidak.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/fffd73ae-ea5f-4f8f-9fae-09d04ed1b21a)

Metode `isIdExists` dalam kelas `karyawan` digunakan untuk memeriksa apakah NIP (Nomor Induk Pegawai) yang diberikan sudah ada dalam database. Berikut penjelasan langkah-langkah dalam metode `isIdExists` ini:
- `private final boolean isIdExists(int nip) {`: Metode `isIdExists` adalah metode pribadi (private) yang mengembalikan nilai boolean (true atau false) dan menerima NIP sebagai parameter.
- Dalam blok try, Anda menyusun pernyataan SQL untuk menghitung jumlah baris yang memiliki NIP yang sama dengan yang diberikan.
- Anda mengisi parameter dalam pernyataan SQL dengan NIP yang akan diperiksa.
- Pernyataan SQL dieksekusi dengan `this.db.preparedStatement.executeQuery()`, dan hasilnya disimpan dalam objek `resultSet`.
- Jika hasil query mengembalikan setidaknya satu baris (diwakili oleh `resultSet.next()`) dan nilai yang diambil dari hasil query (`resultSet.getInt(1)`) lebih besar dari 0, ini menandakan bahwa NIP tersebut sudah ada dalam database, dan metode mengembalikan `true`.
- Jika ada kesalahan SQL, pengecualian ditangani dalam blok catch dan pesan kesalahan ditampilkan menggunakan `this.db.displayErrors(ex)`.
- Jika tidak ada baris yang sesuai dengan NIP tersebut dalam database, maka metode mengembalikan `false`.
- Metode `isIdExists` digunakan untuk mencegah penambahan data karyawan dengan NIP yang sudah ada dalam database, sehingga memastikan bahwa NIP karyawan adalah unik.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/df95023a-c527-4d53-9328-ac3fe3f1967d)

Metode `isDataValid` dalam kelas `karyawan` digunakan untuk memeriksa apakah data yang akan dimasukkan atau diperbarui (seperti nama, email, nomor telepon, dan status karyawan) tidak kosong (empty). Berikut penjelasan singkat tentang metode `isDataValid`:
- `private final boolean isDataValid() {`: Metode `isDataValid` adalah metode pribadi (private) yang mengembalikan nilai boolean (true atau false).
- Metode ini menggunakan operasi logika untuk memeriksa apakah semua atribut data karyawan yang akan dimasukkan atau diperbarui (`nama_karyawan`, `email_karyawan`, `nomor_telpon`, dan `status`) tidak kosong (empty).
- Jika semua atribut tidak kosong (yaitu, tidak mengembalikan nilai `true` saat dipanggil `isEmpty()`), metode `isDataValid` mengembalikan `true`, menunjukkan bahwa data yang diisi adalah valid.
- Jika salah satu atau lebih atribut kosong, maka metode `isDataValid` mengembalikan `false`, menunjukkan bahwa data yang diisi tidak valid.
- Metode `isDataValid` membantu memastikan bahwa data karyawan yang dimasukkan atau diperbarui tidak mengandung nilai yang kosong, sehingga memungkinkan validasi data sebelum melakukan operasi di database.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/ef3bbec8-2de6-4bd0-a336-52a6c494fa78)

Metode `hitungKaryawan` dalam kelas `karyawan` digunakan untuk menghitung jumlah data karyawan dalam database. Berikut penjelasan singkat tentang metode ini:
- `public final static int hitungKaryawan() {`: Metode `hitungKaryawan` adalah metode statis (static) yang mengembalikan nilai integer (jumlah data karyawan) dan tidak memerlukan instance dari kelas `karyawan` untuk dipanggil.
- Variabel `jumlahData` dideklarasikan dengan nilai awal 0. Ini akan digunakan untuk menyimpan jumlah data karyawan.
- Dalam blok try, Anda membuat instance baru dari `databaseConnection` (objek `db`) untuk mengelola koneksi database.
- Anda membuka koneksi ke database menggunakan `db.openConnection()`.
- Anda menyusun pernyataan SQL untuk menghitung jumlah data karyawan dalam tabel.
- Pernyataan SQL dieksekusi dengan `db.preparedStatement.executeQuery()`, dan hasilnya disimpan dalam objek `db.resultSet`.
- Jika hasil query mengembalikan setidaknya satu baris (diwakili oleh `db.resultSet.next()`), Anda mengambil jumlah data dari hasil query (`db.resultSet.getInt(1)`) dan menyimpannya dalam variabel `jumlahData`.
- Setelah selesai, Anda menutup koneksi ke database dengan `db.closeConnection()`.
- Jika terjadi kesalahan SQL, pengecualian ditangani dalam blok catch dan pesan kesalahan dicetak dengan `e.printStackTrace()`.
- Terakhir, metode `hitungKaryawan` mengembalikan nilai `jumlahData`, yang merupakan jumlah data karyawan dalam database.
Metode ini berguna untuk mendapatkan informasi tentang berapa banyak data karyawan yang ada dalam database tanpa harus membuat instance dari kelas `karyawan`.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/4277d555-ad1f-49ec-b101-74a16bf46a2a)

Metode `hitungGaji` dalam kelas `karyawan` adalah metode yang menghitung gaji karyawan. Dalam implementasi saat ini, metode ini selalu mengembalikan nilai 0.0, yang berarti bahwa gaji yang dihitung adalah 0, metode `hitungGaji` ini mungkin direncanakan untuk diimplementasikan ulang (override) dalam kelas yang turunan (subclasses) dari `karyawan`. seperti `staff`, `staff magang`, dan `manager` maka masing-masing jenis karyawan dapat memiliki implementasi yang berbeda untuk menghitung gaji sesuai dengan peraturan atau perhitungan yang berlaku bagi jenis karyawan tersebut.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/08e77533-593b-4301-9372-9bdf6183f587)

overloading metode `setjamKerja` dalam kelas `karyawan` untuk menangani beberapa situasi berbeda, tergantung pada jenis karyawan yang bersangkutan. Overloading adalah ketika mendefinisikan beberapa versi dari metode dengan nama yang sama tetapi dengan parameter yang berbeda. Berikut adalah penjelasan untuk masing-masing versi dari metode `setjamKerja`:
1. `setjamKerja(int durasi_kerja, boolean isManager)`: Metode ini digunakan untuk mengatur durasi kerja karyawan, tetapi dengan tambahan parameter boolean `isManager`. Jika karyawan adalah seorang manajer (`isManager` true), maka durasi kerja akan ditambah 2 jam. Jika bukan seorang manajer, maka durasi kerja akan diatur sesuai dengan nilai `durasi_kerja` yang diberikan.
2. `setjamKerja(int durasi_kerja)`: Metode ini digunakan untuk mengatur durasi kerja karyawan tanpa pertimbangan jenis karyawan. Ini adalah metode overloading yang berbeda dari yang pertama, karena parameter `isManager` tidak diperlukan.
3. `setjamKerja(int durasi_kerja, boolean isMagang, int jamLembur)`: Metode ini digunakan untuk mengatur durasi kerja karyawan, dengan tambahan parameter `isMagang` dan `jamLembur`. Jika karyawan adalah seorang magang (`isMagang` true), maka durasi kerja akan ditambah dengan jumlah jam lembur. Jika bukan seorang magang, durasi kerja akan diatur sesuai dengan `durasi_kerja` yang diberikan.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/246121c0-3fca-4b6e-8aab-2207400ded4d)

### manager.java 

Kode di atas adalah definisi kelas `manager` yang merupakan turunan dari kelas `karyawan`. Kelas `manager` memiliki beberapa atribut tambahan yang khusus untuk jenis karyawan manajer. Berikut penjelasan singkat tentang kelas `manager`:
- Kelas `manager` memiliki dua atribut tambahan:
  1. `bonus`: Atribut ini digunakan untuk menyimpan nilai bonus yang diberikan kepada manajer.
  2. `kelipatan`: Atribut ini digunakan untuk menyimpan kelipatan tambahan dalam durasi kerja manajer (mungkin mengacu pada jam kerja tambahan yang dimiliki oleh manajer).
- Konstruktor `manager` digunakan untuk membuat objek `manager`. Konstruktor ini menerima beberapa parameter yang digunakan untuk menginisialisasi atribut-atribut dalam kelas `manager`. Parameter yang diterima meliputi NIP, nama, email, nomor telepon, kelipatan, bonus, gaji, dan status.
- Dalam konstruktor, Anda menginisialisasi atribut-atribut kelas `manager` menggunakan nilai-nilai yang diterima dari parameter konstruktor. Beberapa atribut diwarisi dari kelas `karyawan`, seperti NIP, nama, email, nomor telepon, gaji, dan status. Sementara itu, atribut tambahan kelas `manager`, yaitu `bonus` dan `kelipatan`, diinisialisasi dengan nilai dari parameter konstruktor.
Ini adalah contoh pewarisan (inheritance) di mana kelas `manager` adalah turunan dari kelas `karyawan`, dan kelas `manager` memiliki atribut tambahan dan konstruktor khusus yang memungkinkan Anda menginisialisasi atribut tambahan tersebut saat membuat objek `manager`.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/14eabde3-5a1e-4630-8735-78b8d0a2386e)

Dalam metode `hitungGaji` yang di-overide dalam kelas `manager`, perhitungan gaji karyawan manajer diimplementasikan. Metode ini mengambil gaji dasar dari kelas `karyawan` (yang diwarisi), dan kemudian menambahkannya dengan bonus dan faktor kelipatan tertentu yang merupakan atribut khusus karyawan manajer.
Perhitungannya adalah sebagai berikut:
- Gaji dasar (dari kelas `karyawan`) dikalikan dengan faktor kelipatan (`kelipatan`).
- Bonus manajer (`bonus`) ditambahkan ke total gaji.
Hasil dari perhitungan ini adalah total gaji karyawan manajer. Dengan meng-override metode `hitungGaji`, Anda dapat memastikan bahwa perhitungan gaji sesuai dengan aturan atau kebijakan yang berlaku untuk karyawan manajer, yang mungkin berbeda dari karyawan biasa atau jenis karyawan lainnya.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/572c84bd-fd6d-44ac-a0ef-44ecaca613a3)



## Output Program
1. Tampilan Menu Login
2. Tampilan Menu Utama
3. Tampilan Create Data Karyawan
4. Tampilan Update Data Karyawan
5. Tampilan Hapus Data Karyawan
6. Tampilan Lihat Data Karyawan
