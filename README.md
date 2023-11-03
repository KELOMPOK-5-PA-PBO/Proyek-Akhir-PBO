# PROGRAM APLIKASI MANAJEMEN KARYAWAN PERUSAHAAN

KELOMPOK 5 
1. Muthmainnah Aisyah (2209116001)
2. Vera Santi Wijaya (2209116007)

## 📌 Latar Belakang
MuVista Glow Company adalah perusahaan yang berfokus pada industri kecantikan. Perusahaan ini mengalami pertumbuhan yang sangat pesat dalam beberapa tahun terakhir, yang menyebabkan terjadinya peningkatan yang signifikan pada jumlah karyawan perusahaan. Dengan bertambahnya jumlah karyawan menjadi sebuah tantangan bagi perusahaan dalam memanajemen data para karyawan di perusahaannya. MuVista Glow Company menyadari bahwa pengelolaan data karyawan tidak lagi dapat dilakukan secara manual sehingga perusahaan berusaha mengambil langkah proaktif dalam pengelolaan data karyawan. Dari permasalahan tersebut MuVista Glow Company membuat sebuah sistem aplikasi yang dapat memudahkan perusahaan dalam memanajemen data para karyawannya.

## 📌 Deskripsi Project
Aplikasi manajemen karyawan perusahaan adalah sebuah perangkat lunak yang dirancang untuk membantu perusahaan dalam mengelola data dan informasi yang berkaitan dengan karyawan yang bekerja di dalamnya. Aplikasi ini memungkinkan perusahaan untuk menyimpan, mengelola, dan mengakses data karyawan dengan mudah, terutama dengan klasifikasi berdasarkan jabatan masing-masing karyawan. Berikut adalah beberapa poin yang dapat memperjelas deskripsi aplikasi ini:
1. **Manajemen Data Karyawan:** Aplikasi ini memiliki fitur utama untuk mengelola informasi karyawan. Data karyawan yang dapat diatur mencakup NIP (Nomor Induk Pegawai), nama, alamat email, nomor telepon, gaji, jam kerja, status karyawan, dan lainnya.
2. **Klasifikasi Berdasarkan Jabatan:** Aplikasi ini memungkinkan perusahaan untuk mengkategorikan karyawan berdasarkan jabatan atau peran mereka dalam organisasi. Dalam contoh kode yang Anda berikan, karyawan dapat dibagi menjadi tiga kategori: "manager," "staff," dan "staff magang." Setiap kategori memiliki atribut dan perhitungan gaji yang berbeda sesuai dengan jabatan tersebut.
3. **Basis Data dengan phpMyAdmin:** Aplikasi ini menggunakan lokal phpMyAdmin sebagai basis data untuk menyimpan semua informasi karyawan. phpMyAdmin adalah alat manajemen basis data yang umum digunakan untuk mengelola basis data MySQL, dan dalam konteks ini, digunakan untuk menyimpan data karyawan. Data ini dapat mencakup seluruh detil karyawan, sehingga mudah diakses dan dikelola.
4. **Fungsionalitas CRUD:** Aplikasi ini memungkinkan pengguna untuk melakukan berbagai tindakan terhadap data karyawan, seperti membuat (create), membaca (read), memperbarui (update), dan menghapus (delete) data. Ini memungkinkan perusahaan untuk mengelola data karyawan mereka dengan lebih efisien.
5. **Otentikasi Admin:** Aplikasi ini memiliki lapisan otentikasi untuk memastikan hanya admin yang sah yang dapat mengakses dan mengelola data karyawan. Admin harus memasukkan username dan password untuk mengakses aplikasi, dan jika berhasil, mereka dapat mengelola data karyawan.
6. **Perhitungan Gaji Otomatis:** Aplikasi ini juga dilengkapi dengan perhitungan gaji otomatis berdasarkan jabatan dan jam kerja karyawan. Ini membantu perusahaan dalam menghitung gaji karyawan dengan cepat dan akurat.
7. **Monitoring Jumlah Karyawan:** Aplikasi ini juga menyediakan fungsionalitas untuk memantau jumlah karyawan dalam perusahaan. Sebagai contoh, ada metode `hitungKaryawan()` yang digunakan untuk mengambil jumlah total karyawan dalam database.
Aplikasi ini memberikan manfaat besar bagi perusahaan, karena memungkinkan mereka untuk mengelola dan mengakses informasi karyawan dengan lebih efisien. Dengan pengkategorian berdasarkan jabatan, perusahaan dapat mengelola gaji, jam kerja, dan atribut lainnya sesuai dengan kebutuhan masing-masing karyawan. Ini juga membantu dalam pemantauan karyawan dan pengambilan keputusan yang lebih baik terkait sumber daya manusia.

## 📌 Flowchart
Dari sebuah Aplikasi Manajemen Karyawan Perusahaan, dibuatkanlah sebuah alur diagram atau yang dibasa dikenal dengan sebutan flowchart. Flowchart digunakan untuk menjelaskan alur dari sebuah program. Berikut adalah flowchart dari Aplikasi Manajemen Karyawan Perusahaan:
![PA_PBO_FLOWCHART-flowchart-full drawio](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122006658/8877c8b9-9040-49a3-9e99-af2febb96581)

## 📌 ERD
ERD atau biasa disebut dengan Entity Relationship Diagram adalah suatu diagram yang digunakan untuk merancang sebuah basis data, yang dipergunakan untuk memperlihatkan relasi atau hubungan antar objek atau entitas. Dalam Aplikasi Manajemen Karyawan Perusahaan ini menggunakan sebuah basis data, sehingga dirancanglah sebuah basis data yang dapat dilihat sebagai berikut:
1. Logical ERD
![PA-VER-6 1](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122006658/2274403a-843e-49c5-980c-5143b4608e31)
2. Relational ERD
![PA-VER-6 2](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122006658/b5f14786-4842-4541-8ff8-809cd1d87a1c)

## 📌 Hierarki Kelas
Hierarki kelas dibuat berdasarkan program aplikasi yang telah dibuat, yang dimana pada program tersebut menerapkan materi inheritance atau bisa disebut dengan turunan. Berikut adalah hierarki kelas dari program Aplikasi Manajemen Karyawan Perusahaan yang telah dibuat:

![PA_PBO_FLOWCHART-hc drawio (1)](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122006658/6a357cc0-af73-41cb-b06a-3eb391109fed)
  
## 📌 Source Code dan Penjelasan
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

Metode `getjamKerja` dalam kelas `manager` mengembalikan nilai dari atribut `durasi_kerja`, yang merupakan durasi kerja karyawan manajer. Metode ini merupakan metode getter yang memungkinkan akses ke nilai `durasi_kerja` dari luar kelas.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/8f079526-0190-49fe-a94c-d56347eb723f)

### staff.java

Kode di atas adalah definisi kelas `staff` yang merupakan turunan dari kelas `karyawan`. Kelas `staff` tidak memiliki atribut tambahan dibandingkan dengan kelas `karyawan`, dan konstruktor `staff` digunakan untuk membuat objek `staff` dengan menginisialisasi atribut-atribut kelas `karyawan`. Berikut penjelasan singkat tentang kelas `staff`:
- Kelas `staff` mewarisi atribut-atribut dasar dari kelas `karyawan`, seperti NIP, nama, email, nomor telepon, gaji, dan status.
- Konstruktor `staff` digunakan untuk membuat objek `staff`. Konstruktor ini menerima beberapa parameter yang digunakan untuk menginisialisasi atribut-atribut dalam kelas `staff`. Parameter yang diterima meliputi NIP, nama, email, nomor telepon, gaji, dan status.
- Dalam konstruktor, Anda menginisialisasi atribut-atribut kelas `staff` menggunakan nilai-nilai yang diterima dari parameter konstruktor. Beberapa atribut diwarisi dari kelas `karyawan`, seperti NIP, nama, email, nomor telepon, gaji, dan status.
- Ini adalah contoh pewarisan (inheritance) di mana kelas `staff` adalah turunan dari kelas `karyawan`, dan kelas `staff` tidak memiliki atribut tambahan. Kelas `staff` dapat digunakan untuk mewakili karyawan dengan jenis "staff" yang memiliki atribut dasar yang sama dengan karyawan lainnya.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/3b5cf65d-150b-4e5a-8d62-eeed2635adfe)

Dalam metode `hitungGaji` yang di-overide dalam kelas `staff`, perhitungan gaji karyawan staf diimplementasikan. Dalam hal ini, gaji staf adalah gaji dasar (yang diwarisi dari kelas `karyawan`) tanpa penambahan apapun. Dengan meng-overide metode `hitungGaji`, Anda dapat menentukan cara perhitungan gaji yang berbeda sesuai dengan jenis karyawan. Dalam hal ini, metode `hitungGaji` untuk karyawan staf mengembalikan nilai `gaji` yang merupakan gaji dasar staf tanpa tambahan apapun.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/2b21ad66-eed9-4dce-a74f-fc751f0f6d57)

Metode `getjamKerja` dalam kelas `staff` mengembalikan nilai dari atribut `durasi_kerja`, yang merupakan durasi kerja karyawan manajer. Metode ini merupakan metode getter yang memungkinkan akses ke nilai `durasi_kerja` dari luar kelas.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/b6e7a808-7a06-4468-9671-7d1d11bfe233)

### staff_magang.java

Kode di atas adalah definisi kelas `staff_magang` yang merupakan turunan dari kelas `karyawan`. Kelas `staff_magang` memiliki atribut tambahan `shift` yang mewakili shift kerja karyawan magang. Konstruktor `staff_magang` digunakan untuk membuat objek `staff_magang` dengan menginisialisasi atribut-atribut kelas `karyawan` dan atribut tambahan `shift`. Berikut penjelasan singkat tentang kelas `staff_magang`:
- Kelas `staff_magang` mewarisi atribut-atribut dasar dari kelas `karyawan`, seperti NIP, nama, email, nomor telepon, gaji, dan status.
- Kelas `staff_magang` memiliki atribut tambahan:
  1. `shift`: Atribut ini digunakan untuk menyimpan informasi tentang shift kerja karyawan magang (misalnya, shift pagi, siang, atau malam).
- Konstruktor `staff_magang` digunakan untuk membuat objek `staff_magang`. Konstruktor ini menerima beberapa parameter yang digunakan untuk menginisialisasi atribut-atribut dalam kelas `staff_magang`. Parameter yang diterima meliputi NIP, nama, email, nomor telepon, shift, gaji, dan status.
- Dalam konstruktor, Anda menginisialisasi atribut-atribut kelas `staff_magang` menggunakan nilai-nilai yang diterima dari parameter konstruktor. Beberapa atribut diwarisi dari kelas `karyawan`, seperti NIP, nama, email, nomor telepon, gaji, dan status. Sementara itu, atribut tambahan kelas `staff_magang`, yaitu `shift`, diinisialisasi dengan nilai dari parameter konstruktor.
Ini adalah contoh pewarisan (inheritance) di mana kelas `staff_magang` adalah turunan dari kelas `karyawan`, dan kelas `staff_magang` memiliki atribut tambahan yang relevan dengan jenis karyawan "staff magang".

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/e97b018e-9cfd-4211-85b5-120eaf4889ff)

Dalam metode `hitungGaji` yang di-overide dalam kelas `staff_magang`, perhitungan gaji karyawan staf magang diimplementasikan. Dalam hal ini, gaji staf magang adalah gaji dasar (yang diwarisi dari kelas `karyawan`) dibagi dengan atribut `shift`, yang mungkin merepresentasikan shift kerja. Dengan meng-overide metode `hitungGaji`, Anda dapat menentukan cara perhitungan gaji yang berbeda sesuai dengan jenis karyawan. Dalam hal ini, metode `hitungGaji` untuk karyawan staf magang mengembalikan hasil bagi antara gaji dan shift kerja, yang mungkin mencerminkan perhitungan gaji berdasarkan jumlah shift kerja yang dilakukan.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/6239fb86-2b62-43b9-9c4b-2fa4a611cf38)

Metode `getjamKerja` dalam kelas `staff_magang` mengembalikan nilai dari atribut `durasi_kerja`, yang merupakan durasi kerja karyawan manajer. Metode ini merupakan metode getter yang memungkinkan akses ke nilai `durasi_kerja` dari luar kelas.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/b6e7a808-7a06-4468-9671-7d1d11bfe233)


## Package model
### databaseConnection.java

Kode di atas adalah import statement yang mengimpor berbagai kelas dan pustaka yang diperlukan dalam paket `model` untuk mengelola database. Berikut penjelasan singkat tentang setiap import statement:
1. `import java.sql.DriverManager;`: Ini mengimpor kelas `DriverManager` dari paket `java.sql`. `DriverManager` digunakan untuk mengelola daftar pengemudi JDBC dan mendapatkan koneksi ke database.
2. `import java.sql.Connection;`: Ini mengimpor kelas `Connection` dari paket `java.sql`. `Connection` digunakan untuk mewakili koneksi ke database.
3. `import java.sql.Statement;`: Ini mengimpor kelas `Statement` dari paket `java.sql`. `Statement` digunakan untuk mengeksekusi pernyataan SQL ke database.
4. `import java.sql.PreparedStatement;`: Ini mengimpor kelas `PreparedStatement` dari paket `java.sql`. `PreparedStatement` digunakan untuk mengeksekusi pernyataan SQL yang telah diprepare sebelumnya, yang memungkinkan penggunaan parameter.
5. `import java.sql.ResultSet;`: Ini mengimpor kelas `ResultSet` dari paket `java.sql`. `ResultSet` digunakan untuk menangani hasil dari pernyataan SQL yang mengembalikan data dari database.
6. `import java.sql.ResultSetMetaData;`: Ini mengimpor kelas `ResultSetMetaData` dari paket `java.sql`. `ResultSetMetaData` digunakan untuk mengambil informasi tentang metadata (seperti nama kolom) dari hasil query dalam `ResultSet`.
7. `import java.sql.SQLException;`: Ini mengimpor kelas `SQLException` dari paket `java.sql`. `SQLException` digunakan untuk menangani kesalahan yang terkait dengan database, seperti kesalahan SQL.
8. `import java.util.ArrayList;`: Ini mengimpor kelas `ArrayList` dari paket `java.util`. `ArrayList` adalah struktur data yang digunakan untuk menyimpan koleksi data yang dinamis. Dalam konteks pengembangan aplikasi dengan database, `ArrayList` sering digunakan untuk menyimpan dan mengelola data yang diambil dari database.
9. Semua import statement ini dibutuhkan dalam konteks pengembangan aplikasi yang berinteraksi dengan database menggunakan JDBC (Java Database Connectivity).

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/11485507-dfd0-452d-aeeb-f8e900a67b8b)

Kode di atas mendefinisikan kelas `databaseConnection`, yang digunakan untuk mengelola koneksi database menggunakan JDBC (Java Database Connectivity). Berikut adalah penjelasan singkat tentang kelas `databaseConnection` dan metodenya:
- `private final static String dbhost`: Variabel ini mengandung nama host atau alamat server database.
- `private final static String dbname`: Variabel ini berisi nama database yang digunakan.
- `private final static String username`: Variabel ini berisi username untuk mengakses database.
- `private final static String password`: Variabel ini berisi password untuk mengakses database.
- `public Connection connection = null;`: Variabel `connection` adalah objek yang digunakan untuk mewakili koneksi ke database. Ini adalah bagian penting untuk berinteraksi dengan database.
- `public Statement statement;`, `public PreparedStatement preparedStatement;`, dan `public ResultSet resultSet;`: Variabel ini digunakan untuk menyimpan objek Statement, PreparedStatement, dan ResultSet yang digunakan dalam operasi SQL. Ini memungkinkan Anda untuk menjalankan pernyataan SQL dan mengelola hasilnya.
- `public final void openConnection()`: Ini adalah metode yang digunakan untuk membuka koneksi ke database. Dalam metode ini:
  - Anda mencoba membuat koneksi ke database menggunakan `DriverManager.getConnection()`. Detail koneksi seperti host, nama database, username, dan password diambil dari variabel yang telah didefinisikan sebelumnya.
  - Jika koneksi berhasil dibuat, pesan "successfully" akan dicetak ke konsol.
  - Jika terjadi kesalahan SQL saat mencoba membuat koneksi, metode `displayErrors(ex)` akan dipanggil untuk menampilkan pesan kesalahan.
Kelas `databaseConnection` dan metodenya adalah komponen yang penting dalam pengembangan aplikasi yang berinteraksi dengan database. Dengan menggunakan kelas ini, Anda dapat membuat dan mengelola koneksi ke database MySQL dan menjalankan pernyataan SQL untuk mengambil, menyimpan, atau memperbarui data dalam database.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/48a8fa58-601e-4e4a-8e7e-4ab357977523)

Metode `closeConnection` dalam kelas `databaseConnection` digunakan untuk menutup semua objek yang terkait dengan koneksi database, seperti `ResultSet`, `Statement`, `PreparedStatement`, dan koneksi itu sendiri. Ini adalah praktik yang baik untuk selalu menutup objek-objek ini setelah selesai menggunakan koneksi database untuk mencegah kebocoran sumber daya dan menghindari masalah dalam manajemen sumber daya. Berikut adalah penjelasan singkat tentang apa yang dilakukan oleh metode `closeConnection`:
- Metode ini mengelola penutupan objek-objek terkait dengan koneksi database dalam blok `try-catch`. Blok `try` digunakan untuk mencoba mengeksekusi kode penutupan, dan jika terjadi pengecualian, blok `catch` akan menangani kesalahan.
- Dalam blok `try`, metode ini melakukan penutupan berurutan untuk objek-objek seperti `ResultSet`, `Statement`, `PreparedStatement`, dan koneksi `Connection`. Dalam hal ini, penggunaan `if (objek != null)` digunakan untuk memeriksa apakah objek ada sebelum mencoba menutupnya, sehingga tidak akan terjadi pengecualian jika objek tersebut null.
- Setelah menutup objek-objek tersebut, metode ini juga mengatur semua objek tersebut menjadi null. Ini bertujuan untuk memastikan bahwa objek-objek tersebut tidak dapat digunakan kembali setelah ditutup.
- Jika terjadi kesalahan SQL saat menutup objek-objek, metode `displayErrors(ex)` dipanggil untuk menampilkan pesan kesalahan.
Dengan metode `closeConnection`, Anda dapat memastikan bahwa sumber daya yang digunakan dalam koneksi database dibersihkan dengan benar dan aman setelah selesai digunakan, yang merupakan praktik terbaik dalam pengembangan aplikasi yang berinteraksi dengan database.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/3f87d48d-4dcc-469d-aab6-801b737bd824)

Metode `all` dalam kelas `databaseConnection` digunakan untuk menjalankan sebuah query SQL ke database dan mengambil semua hasil query dalam bentuk daftar ArrayList. Metode ini menerima sebuah parameter `query`, yang adalah pernyataan SQL yang akan dieksekusi untuk mengambil data dari database. Berikut adalah penjelasan singkat tentang apa yang dilakukan oleh metode `all`:
- Metode ini membuat sebuah objek `Statement` menggunakan koneksi yang sudah terbuka dan menjalankan query SQL dengan `executeQuery(query)`.
- Selanjutnya, metode ini mengambil hasil query satu per satu menggunakan perulangan `while (this.resultSet.next())`. Dalam setiap iterasi, metode ini melakukan hal berikut:
  - Mengambil metadata (informasi tentang struktur hasil query) menggunakan `ResultSetMetaData`.
  - Menghitung jumlah kolom (columnCount) dalam hasil query.
  - Membuat ArrayList `columns` untuk menyimpan nilai-nilai dari setiap kolom dalam baris hasil query.
  - Mengambil nilai-nilai setiap kolom dalam baris hasil query menggunakan perulangan `for`.
  - Menambahkan ArrayList `columns` ke ArrayList `rows`, yang akan berisi semua baris hasil query.
- Jika terjadi kesalahan SQL saat menjalankan query, metode `displayErrors(ex)` dipanggil untuk menampilkan pesan kesalahan.
- Akhirnya, metode mengembalikan ArrayList `rows`, yang berisi semua data hasil query dalam bentuk ArrayList<ArrayList>. Setiap elemen dalam ArrayList `rows` merupakan ArrayList yang mewakili satu baris data dari hasil query.
Dengan metode `all`, Anda dapat dengan mudah mengambil data dari database dan mengembalikannya dalam bentuk ArrayList yang dapat diolah lebih lanjut dalam aplikasi Anda.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/d63b3a5c-1554-45a0-9f80-b42f33f28919)

Metode `generateLastId` dalam kelas `databaseConnection` digunakan untuk mengambil nilai ID terakhir yang di-generate oleh operasi penambahan data ke database (misalnya, saat menggunakan pernyataan SQL `INSERT` dengan kolom ID yang di-generate secara otomatis).
Berikut adalah penjelasan singkat tentang apa yang dilakukan oleh metode `generateLastId`:
- Metode ini mencoba mengambil hasil ID terakhir yang di-generate setelah melakukan operasi penambahan data ke database. Ini berguna jika Anda memiliki kolom ID yang di-generate otomatis dalam tabel database, seperti ID yang merupakan kunci utama dan di-generate secara otomatis saat menambahkan data baru.
- Pertama, metode ini mencoba mendapatkan hasil ID terakhir dari objek `Statement` jika objek tersebut ada (tidak null). Jika objek `Statement` tidak null, maka metode ini mencoba mendapatkan hasil ID terakhir dari objek `Statement` menggunakan `getGeneratedKeys()`.
- Selanjutnya, metode ini mencoba mendapatkan hasil ID terakhir dari objek `PreparedStatement` jika objek tersebut ada (tidak null). Jika objek `PreparedStatement` tidak null, maka metode ini mencoba mendapatkan hasil ID terakhir dari objek `PreparedStatement` menggunakan `getGeneratedKeys()`.
- Jika hasil ID terakhir berhasil ditemukan dengan baik dari salah satu objek (Statement atau PreparedStatement), maka metode mengambil ID tersebut dengan `resultSet.getInt(1)` dan mengembalikannya sebagai hasil.
- Jika terjadi kesalahan SQL saat mencoba mendapatkan hasil ID terakhir, metode `displayErrors(ex)` dipanggil untuk menampilkan pesan kesalahan.
- Jika tidak ada hasil ID terakhir yang berhasil ditemukan, maka metode mengembalikan nilai 0.
Dengan metode `generateLastId`, Anda dapat mengambil nilai ID terakhir yang di-generate setelah operasi penambahan data ke database, yang sering digunakan dalam skenario di mana Anda perlu mengakses ID dari data yang baru saja ditambahkan ke database.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/c7437770-8d2a-495a-8a0c-82263b184ba3)

Metode `displayErrors` dalam kelas `databaseConnection` digunakan untuk menampilkan informasi tentang kesalahan SQL yang terjadi. Metode ini membantu dalam pemecahan masalah dan pemantauan ketika ada kesalahan dalam operasi database. Berikut adalah penjelasan singkat tentang apa yang dilakukan oleh metode `displayErrors`:
- Metode ini menerima parameter `ex` yang merupakan objek `SQLException`. Objek ini berisi informasi tentang kesalahan SQL yang terjadi.
- Dalam metode ini, tiga informasi utama ditampilkan dalam pesan kesalahan:
  1. `"SQLException: " + ex.getMessage()`: Ini menampilkan pesan kesalahan yang menjelaskan kesalahan SQL yang terjadi. Pesan ini dapat memberikan petunjuk tentang penyebab kesalahan.
  2. `"SQLState: " + ex.getSQLState()`: Ini menampilkan kode SQLState yang mengidentifikasi kategori kesalahan. Kode ini dapat membantu dalam memahami jenis kesalahan yang terjadi.
  3. `"VendorError: " + ex.getErrorCode()`: Ini menampilkan kode kesalahan yang diberikan oleh vendor database. Kode ini dapat memberikan informasi lebih lanjut tentang kesalahan tertentu.
- Dengan informasi-informasi di atas, Anda dapat mengidentifikasi dan memecahkan masalah ketika ada kesalahan dalam operasi database. Pesan kesalahan tersebut dapat membantu Anda dalam menentukan langkah-langkah perbaikan yang diperlukan.
- 
![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/c812a560-71d2-4f6f-969d-791820d62d9f)

## Package view (pemanggilan method-method lain didalam kelas entitas)
### show data untuk menu memperlihatkan data dalam tabel
Metode `show_data` nampaknya digunakan untuk mengambil data dari tabel "karyawan" dalam database dan menampilkannya dalam sebuah tabel. Metode ini berisi beberapa langkah yang dilakukan dalam proses tersebut:
- `databaseConnection db = new databaseConnection();`: Anda membuat objek `databaseConnection` dengan nama `db` untuk mengelola koneksi ke database.
- `db.openConnection();`: Metode `openConnection` dipanggil untuk membuka koneksi ke database sebelum mengambil data.
- `ArrayList<ArrayList> members = db.all("SELECT * FROM karyawan");`: Anda menggunakan objek `db` untuk menjalankan query SQL "SELECT * FROM karyawan" ke database. Hasil query tersebut disimpan dalam `ArrayList<ArrayList>` dengan nama `members`. Setiap elemen dalam `members` merupakan ArrayList yang mewakili satu baris data dari hasil query.
- `DefaultTableModel model = new DefaultTableModel();`: Anda membuat objek `DefaultTableModel` dengan nama `model` untuk digunakan dalam tabel. Ini adalah model yang akan digunakan untuk menampilkan data dalam tabel.
- Anda menambahkan kolom-kolom ke model sesuai dengan data yang akan ditampilkan, yaitu "NIP", "Nama", "Email", "No Telpon", "Gaji", "Jam Kerja", dan "Status".
- Menggunakan loop `for` Anda menambahkan data dari `members` ke model menggunakan `model.addRow(rowData.toArray())`. Dalam loop ini, setiap `rowData` (ArrayList yang mewakili satu baris data) diubah menjadi array dan ditambahkan ke model sebagai baris baru dalam tabel.
- `db.closeConnection();`: Setelah selesai mengambil dan menampilkan data, Anda menutup koneksi ke database dengan memanggil `closeConnection` untuk membersihkan sumber daya.
- Terakhir, Anda menetapkan model yang telah dibuat ke tabel dengan `tabeltambah.setModel(model)`, sehingga data yang diambil dari database akan ditampilkan dalam tabel pada antarmuka pengguna.
Metode `show_data` ini berguna untuk menampilkan data dari database ke dalam antarmuka pengguna Anda, seperti dalam sebuah tabel. Hal ini memungkinkan pengguna untuk melihat data dengan mudah dan memantau informasi dalam aplikasi Anda.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/e8238a93-0a78-4bfe-a7bb-84929b288aae)

### create untuk menu tambah data

Kode di atas adalah bagian dari sebuah blok `try-catch` yang digunakan untuk menangani penginputan data dan menambahkannya ke dalam database. Berikut adalah penjelasan singkat tentang apa yang terjadi dalam kode tersebut:
 `int intValue = Integer.parseInt(txtnip.getText());`: Ini mencoba mengambil nilai dari inputan `txtnip` (sebuah teks) dan mengubahnya menjadi tipe data integer. Jika inputan tidak valid sebagai integer, maka akan menghasilkan pengecualian `NumberFormatException`.
- Objek `k` dari kelas `karyawan` dibuat, dan statusnya diatur menjadi "Aktif".
- Inputan status kemudian disimpan dalam variabel `statusnya`.
- Anda mengambil nilai yang dipilih dari combo box `cbjabatan` dan menyimpannya dalam variabel `pilih`.
- Kemudian, Anda menggunakan percabangan `if-else` untuk memeriksa pilihan yang dipilih oleh pengguna:
   - Jika pilihan adalah "manager", maka Anda membuat objek `manager` (dari kelas yang sesuai) dengan parameter yang sesuai, seperti `intValue`, `txtnama.getText()`, dan sebagainya. Kemudian, Anda menghitung gaji dengan `m.hitungGaji()` dan mengatur jam kerja dengan `m.setjamKerja(10, true)`. Kemudian, Anda mengisi properti-properti objek `m` dengan data yang diambil dari inputan.
   - Jika pilihan adalah "staff", maka Anda melakukan hal yang serupa untuk objek `staff`.
   - Jika pilihan adalah "staff magang", maka Anda melakukan hal yang serupa untuk objek `staff_magang`.
- Kemudian, Anda memanggil metode `create` pada objek yang sesuai (misalnya, `m.create()`) untuk mencoba menambahkan data ke database. Jika operasi berhasil, Anda menampilkan pesan "Data Berhasil Ditambahkan!" dan memanggil metode `show_data()` untuk menampilkan data yang baru ditambahkan. Jika gagal, Anda menampilkan pesan "Data Gagal Ditambahkan!".
- Di dalam blok `catch (NumberFormatException e)`, Anda menangani pengecualian jika pengubahan teks menjadi integer (`parseInt`) gagal. Ini terjadi jika NIP yang dimasukkan tidak valid sebagai bilangan bulat. Anda menampilkan pesan kesalahan "Periksa NIP Anda Kembali!" dan menghentikan proses lebih lanjut dengan `return`.
- Kode ini digunakan untuk mengambil data inputan, menghitung gaji dan jam kerja berdasarkan jabatan yang dipilih, dan menambahkan data tersebut ke dalam database. Jika ada kesalahan dalam inputan NIP, maka akan ditangani dengan pengecualian `NumberFormatException`.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/949a9cd7-5ccf-4fb6-9c9a-ee21ff85547a)

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/b7db8c1f-95b0-482a-b71b-ad1db53e1692)

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/bc84d7c0-cdeb-48e0-a8cc-78b5ddfaf6dc)

### delete untuk menu delete karyawan
Kode di atas nampaknya digunakan untuk menghapus data karyawan dari database berdasarkan NIP (Nomor Induk Pegawai) yang dimasukkan oleh pengguna. Berikut adalah penjelasan singkat tentang apa yang terjadi dalam kode tersebut:
- Anda membuat objek `karyawan` dari kelas `karyawan`.
- `int intValue = Integer.parseInt(txtnip.getText());`: Anda mencoba mengambil nilai dari inputan `txtnip` (sebuah teks) dan mengubahnya menjadi tipe data integer. Ini adalah NIP yang akan digunakan untuk mencari dan menghapus data karyawan.
   Anda menggunakan metode `find(intValue)` pada objek `karyawan` untuk mencari data karyawan berdasarkan NIP yang dimasukkan. Metode ini akan mencoba menemukan data karyawan dengan NIP yang sesuai di dalam database.
- Setelah data karyawan ditemukan, Anda menggunakan kondisi `if` untuk memeriksa apakah operasi `delete` berhasil atau tidak. Jika berhasil (mengembalikan `true`), Anda menampilkan pesan "Data Berhasil Dihapus!", memanggil `show_data()` untuk menampilkan data yang telah diperbarui, dan membersihkan formulir inputan dengan `kosongkanform()`. Jika gagal (mengembalikan `false`), Anda menampilkan pesan "Data Gagal Dihapus!".
- Di dalam blok `catch (NumberFormatException e)`, Anda menangani pengecualian jika pengubahan teks menjadi integer (`parseInt`) gagal. Ini terjadi jika NIP yang dimasukkan tidak valid sebagai bilangan bulat. Anda menampilkan pesan kesalahan "Periksa NIP Anda Kembali!" dan menghentikan proses lebih lanjut dengan `return`.
- Kode ini digunakan untuk menghapus data karyawan dari database berdasarkan NIP yang dimasukkan oleh pengguna. Jika NIP tidak valid sebagai bilangan bulat, kesalahan akan ditangani dengan pengecualian `NumberFormatException`.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/20a4631d-2df4-4b1d-97fa-ed0ecf91a520)

### static untuk menu hitung jumlah karyawan
Kode di atas digunakan untuk menghitung total jumlah karyawan dalam database dan menampilkan hasilnya dalam suatu elemen antarmuka pengguna. Berikut penjelasan singkat tentang apa yang terjadi dalam kode tersebut:
- `int totalkaryawan = karyawan.hitungKaryawan();`: Anda menggunakan metode statis `hitungKaryawan()` dari kelas `karyawan` untuk menghitung jumlah total karyawan dalam database. Metode ini akan mengembalikan jumlah karyawan.
- `lbhasil.setText(Integer.toString(totalkaryawan));`: Anda mengambil nilai integer `totalkaryawan` dan mengubahnya menjadi teks dengan `Integer.toString()`. Kemudian, Anda mengatur teks ini ke elemen dengan nama `lbhasil`. Ini digunakan untuk menampilkan jumlah total karyawan dalam antarmuka pengguna, misalnya, dalam sebuah label atau elemen teks.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/d791ab98-a9d2-4351-99aa-da1748f7521b)

### update untuk menu update data karyawan

Kode di atas digunakan untuk memperbarui data karyawan dalam database berdasarkan NIP (Nomor Induk Pegawai) yang dimasukkan oleh pengguna. Berikut adalah penjelasan singkat tentang apa yang terjadi dalam kode tersebut:
- Anda membuat objek `karyawan` dari kelas `karyawan`.
- `int intValue = Integer.parseInt(txtnip.getText());`: Anda mencoba mengambil nilai dari inputan `txtnip` (sebuah teks) dan mengubahnya menjadi tipe data integer. Ini adalah NIP yang akan digunakan untuk mencari dan memperbarui data karyawan.
- Anda menggunakan metode `setStatus("Aktif")` pada objek `karyawan` untuk mengatur statusnya menjadi "Aktif". Kemudian, Anda mengambil status tersebut dan menyimpannya dalam variabel `statusnya`.
- Anda mengambil nilai yang dipilih dari combo box `cbjabatan` dan menyimpannya dalam variabel `pilih`.
- Kemudian, Anda menggunakan percabangan `if-else` untuk memeriksa pilihan yang dipilih oleh pengguna:
   - Jika pilihan adalah "manager", maka Anda membuat objek `manager` (dari kelas yang sesuai) dengan parameter yang sesuai, seperti `intValue`, `txtnama.getText()`, dan sebagainya. Kemudian, Anda menghitung gaji dengan `m.hitungGaji()` dan mengatur jam kerja dengan `m.setjamKerja(10, true)`. Kemudian, Anda mengisi properti-properti objek `m` dengan data yang diambil dari inputan.
   - Jika pilihan adalah "staff", maka Anda melakukan hal yang serupa untuk objek `staff`.
   - Jika pilihan adalah "staff magang", maka Anda melakukan hal yang serupa untuk objek `staff_magang`.
- Setelah mengisi objek karyawan yang sesuai (misalnya, `m`, `s`, atau `sm`), Anda memanggil metode `update()` pada objek tersebut untuk mencoba memperbarui data karyawan di database. Jika operasi berhasil (mengembalikan `true`), Anda menampilkan pesan "Data Berhasil Diperbarui!", memanggil `show_data()` untuk menampilkan data yang telah diperbarui, dan membersihkan formulir inputan dengan `kosongkanform()`. Jika gagal (mengembalikan `false`), Anda menampilkan pesan "Data Gagal Diperbarui!".
- Di dalam blok `catch (NumberFormatException e)`, Anda menangani pengecualian jika pengubahan teks menjadi integer (`parseInt`) gagal. Ini terjadi jika NIP yang dimasukkan tidak valid sebagai bilangan bulat. Anda menampilkan pesan kesalahan "Periksa NIP Anda Kembali!" dan menghentikan proses lebih lanjut dengan `return`.
- Kode ini digunakan untuk memperbarui data karyawan dalam database berdasarkan NIP yang dimasukkan oleh pengguna. Jika NIP tidak valid sebagai bilangan bulat, kesalahan akan ditangani dengan pengecualian `NumberFormatException`.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/d4ae2923-a241-46c1-a9ad-acf57e02f971)

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/957c5a09-8435-43c6-910a-9653af0287b7)

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/9956dbe7-dd2c-4636-b263-0078aac00493)

### login admin
Kode di atas digunakan untuk melakukan proses otentikasi atau login sebagai admin ke dalam suatu aplikasi. Berikut penjelasan singkat tentang apa yang terjadi dalam kode tersebut:
- Anda membuat objek `admin` dari kelas `admin`.
- `admin.username = txtuser.getText();` dan `admin.password = txtpass.getText();`: Anda mengambil nilai yang dimasukkan oleh pengguna dalam inputan `txtuser` dan `txtpass` dan menyimpannya dalam properti `username` dan `password` objek `admin`. Ini adalah data login yang akan digunakan untuk memeriksa kecocokan dengan data admin yang ada dalam database.
- Anda menggunakan metode `login()` pada objek `admin` untuk mencoba login. Metode ini akan memeriksa apakah ada admin dengan username dan password yang sesuai dalam database.
- Anda menggunakan kondisi `if` untuk memeriksa hasil dari metode `login()`:
   - Jika login berhasil (mengembalikan `true`), Anda menampilkan pesan "Right Username or Password!" dan membuka jendela `menuUtama` (mnu), kemudian menutup jendela login saat ini dengan `this.dispose()`.
   - Jika login gagal (mengembalikan `false`), Anda menampilkan pesan "Wrong Username or Password!", menyalakan kursor ke inputan `txtpass` dengan `txtpass.requestFocus()`, dan membersihkan formulir inputan dengan `kosongkanform()`.
Dengan demikian, kode ini digunakan untuk memeriksa apakah username dan password yang dimasukkan oleh pengguna sesuai dengan data admin yang ada dalam database. Jika sesuai, pengguna diarahkan ke jendela utama (menuUtama), jika tidak, mereka diberi kesempatan untuk mencoba lagi.

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/19044ae3-8bc5-4f03-832d-968075f1fadc)



## 📌 Output Program
1. Tampilan Menu Login
   
![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/63209e9b-926e-49f5-a61d-2fe98cbf5509)

2. Tampilan Menu Utama

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/e7efa5a0-809f-44b1-877e-d50c3a4cd021)

3. Tampilan Create Data Karyawan

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/7e67bc8a-c94a-40b5-967e-daf496a5a038)

4. Tampilan Update Data Karyawan

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/bf9da0f9-09a5-4265-a7f1-39633edcf4c4)

5. Tampilan Hapus Data Karyawan

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/4e9d4787-12f5-4dbf-83f0-00e8f3955a91)

6. Tampilan Lihat Data Karyawan

![image](https://github.com/KELOMPOK-5-PA-PBO/Proyek-Akhir-PBO/assets/122012870/5270a8f9-b162-4b14-969a-1b851946b971)

