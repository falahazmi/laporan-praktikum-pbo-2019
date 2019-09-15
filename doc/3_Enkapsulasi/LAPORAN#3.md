# Laporan Praktikum #3 - Enkapsulasi

## Kompetensi

Setelah melakukan percobaan pada modul ini, mahasiswa memahami konsep:

1. Konstruktor 
2. Akses Modifier
3. Atribut/method pada class 
4. Intansiasi atribut/method  
5. Setter dan getter
6. Memahami notasi pada UML Class Diagram 

## Ringkasan Materi

## Percobaan 

### Percobaan 1 - Enkapsulasi 

Didalam percobaan enkapsulasi, buatlah class Motor yang memiliki atribut kecepatan dan kontakOn, dan memiliki method printStatus() untuk menampilkan status motor. Seperti berikut 

1. Buka Netbeans, buat project MotorEncapsulation. 

2. Buat class Motor. Klik kanan pada package motorencapsulation – New – Java Class. 

3. Ketikkan kode class Motor dibawah ini. 

![test6](img/test6.PNG)

4. Kemudian buat class MotorDemo, ketikkan kode berikut ini

![test7](img/test7.PNG)

5. Hasilnya adalah sebagai berikut:

![percobaan1](img/percobaan1.PNG)

Link code class Motor : [Klik di sini](../../src/3_Enkapsulasi/Motor1841720085Falaah)

Link code class Motor Demo : [Klik di sini](../../src/3_Enkapsulasi/MotorDemo1841720085Falaah)

Dari percobaan 1 - enkapsulasi, menurut anda, adakah yang janggal?  
Yaitu, kecepatan motor tiba-tiba saja berubah dari 0 ke 50. Lebih janggal lagi, posisi kontak motor masih dalam kondisi OFF. Bagaimana mungkin sebuah motor bisa sekejap berkecepatan dari nol ke 50, dan itupun kunci kontaknya OFF?  

Nah dalam hal ini, akses ke atribut motor ternyata tidak terkontrol. Padahal, objek di dunia nyata selalu memiliki batasan dan mekanisme bagaimana objek tersebut dapat digunakan. Lalu, bagaimana kita bisa memperbaiki class Motor diatas agar dapat digunakan dengan baik? Kita bisa pertimbangkan beberapa hal berikut ini:  

1. Menyembunyikan atribut internal (kecepatan, kontakOn) dari pengguna  (class lain)  

2. Menyediakan method khusus untuk mengakses atribut.  
Untuk itu mari kita lanjutkan percobaan berikutknya tentang Access Modifier

### Percobaan 2 - Access Modifier 


Pada percobaan ini akan digunakan access modifier untuk memperbaiki cara kerja class Motor pada percobaan ke-1. 

1. Ubah cara kerja class motor sesuai dengan UML class diagram berikut. 

    ![test](img/test1.PNG)

2. Berdasarkan UML class diagram tersebut maka class Motor terdapat perubahan, yaitu: 

    a. Ubah access modifier kecepatan dan kontakOn menjadi private 

    b. Tambahkan method nyalakanMesin, matikanMesin, tambahKecepatan, kurangiKecepatan. 

Implementasi class Motor adalah sebagai berikut:

![test8](img/test8.PNG)

3. Kemudian pada class MotorDemo, ubah code menjadi seperti berikut:

![test9](img/test9.PNG)


4. Hasilnya dari class MotorDemo adalah sebagai berikut: 

![percobaan2](img/percobaan2.PNG)

Link code class Motor : [Klik di sini](../../src/3_Enkapsulasi/Motor1841720085FalaahP2.java)

Link code class Test Motor Demo : [Kllik disini](../../src/3_Enkapsulasi/MotorDemo1841720085FalaahP2.java)

Dari percobaan diatas, dapat kita amati sekarang atribut kecepatan tidak bisa diakses oleh pengguna dan diganti nilainya secara sembarangan. Bahkan ketika mencoba menambah kecepatan saat posisi kontak masih OFF, maka akan muncul notifikasi bahwa mesin OFF. Untuk mendapatkan kecepatan 
Page 8 of 15 
 
yang diinginkan, maka harus dilakukan secara gradual, yaitu dengan memanggil method tambahKecepatan() beberapa kali. Hal ini mirip seperti saat kita mengendarai motor.  

#### Pertanyaan

1. Pada class TestMobil, saat kita menambah kecepatan untuk pertama kalinya, mengapa muncul peringatan “Kecepatan tidak bisa bertambah karena Mesin Off!”?  

2. Mengapat atribut kecepatan dan kontakOn diset private?  

3. Ubah class Motor sehingga kecepatan maksimalnya adalah 100! 

#### Jawab

1. Sebab, pada class Motor Demo saat pertama kali pemanggilan method yang belum memanggil method nyalakanMesin namun hanya memanggil method cetakStatus dan tambahKecepatan. Maka dari itu mesin masih dinyatakan Off.

2. Sebab,modifier private membuat kontakOn hanya bisa diakses oleh dari dalam class itu sendiri.

3. lakukan pemanggilan method tambahKecepatan dan cetakStatus 5 kali dan ubahlah dalam class tambahKecepatan bila kontaOn menjadi 20 (sebelumnya 5).

![test4](img/test4.PNG)

![test5](img/test5.PNG)

Link code class Test Motor : [Kllik disini](../../src/3_Enkapsulasi/Motor1841720085FalaahPertanyaan.java)

Link code class Test Motor Demo : [Kllik disini](../../src/3_Enkapsulasi/MotorDemo1841720085FalaahPertanyaan.java)


### Percobaan 3 - Getter dan Setter

Misalkan di sebuah sistem informasi koperasi, terdapat class Anggota. Anggota memiliki atribut nama, alamat dan simpanan, dan method setter, getter dan setor dan pinjam. Semua atribut pada anggota tidak boleh diubah sembarangan, melainkan hanya dapat diubah melalui method setter, getter, setor dan tarik. Khusus untuk atribut simpanan tidak terdapat setter karena simpanan akan bertambah ketika melakukan transaksi setor dan akan berkurang ketika melakukan peminjaman/tarik. 

1. Berikut ini UML class buatlah class Mahasiswa pada program: 

![test2](img/test2.PNG)

2. Sama dengan percobaan 1 untuk membuat project baru 

    a. Buka Netbeans, buat project KoperasiGetterSetter. 

    b. Buat class Anggota. Klik kanan pada package koperasigettersetter – New – Java Class. 

    c. Ketikkan kode class Anggota dibawah ini. 

![a1](img/a1.PNG)

Jika diperhatikan pada class Anggota, atribut nama dan alamat memili masing-masing 1 getter dan setter. Sedangkan atribut simpanan hanya memiliki getSimpanan() saja, karena seperti tujuan awal, atribut simpanan akan berubah nilainya jika melakukan transaksi setor() dan pinjam/tarik().

3. Selanjutnya buatlah class KoperasiDemo untuk mencoba class Anggota.

![a2](img/a2.PNG)


4. Hasil dari main method pada langkah ketiga adalah 

![percobaan3](img/percobaan3.PNG)

Link code class Test Anggota : [Kllik disini](../../src/3_Enkapsulasi/Anggota1841720085Falaah.java)

Link code class Test Koperasi Demo : [Kllik disini](../../src/3_Enkapsulasi/KoperasiDemo1841720085Falaah.java)

Dapat dilihat pada hasil percobaan diatas, untuk mengubah simpanan tidak dilakukan secara langsung dengan mengubah atribut simpanan, melainkan melalui method setor() dan pinjam(). Untuk menampilkan nama pun harus melalui method getNama(), dan untuk menampilkan simpanan melalui getSimpanan().  

### Percobaan 4 -  Konstruktor, Instansiasi 

1. Langkah pertama percobaan 4 adalah ubah class KoperasiDemo seperti berikut

![a3](img/a3.PNG)

2. Hasil dari program tersebut adalah sebagai berikut 

![percobaan4](img/percobaan4.PNG)

Link code class Test Anggota : [Kllik disini](../../src/3_Enkapsulasi/Anggota1841720085FalaahP4.java)

Link code class Test Anggota : [Kllik disini](../../src/3_Enkapsulasi/KoperasiDemo1841720085FalaahP4.java)

Dapat dilihat hasil running program, ketika dilakukan pemanggilan method getNama() hasilnya hal ini terjadi  karena atribut nama belum diset nilai defaultnya. Hal ini dapat ditangani dengan membuat kontruktor. 

## Kesimpulan

Dari ke dua percobaan tersebut saya menyimpulkan bahwa return dimana kita tidak dapat menggunakannya sebagai pengidentifikasi. Ini digunakan untuk keluar dari suatu metode, dengan atau tanpa nilai.

## Tugas

1. Suatu toko persewaan video game salah satu yang diolah adalah peminjaman, dimana data yang dicatat ketika ada orang yang melakukan peminjaman adalah id, nama member, nama game, dan harga yang harus dibayar. Setiap peminjaman bisa menampilkan data hasil peminjaman dan harga yang harus dibayar. Buatlah class diagram pada studi kasus diatas! 
 
    Penjelasan:
  
    a. Harga yang harus dibayar diperoleh dari lama sewa x harga.

    b. Diasumsikan 1x transaksi peminjaman game yang dipinjam hanya 1 game saja.

    ![Tugas1](img/Tugas1.PNG)

2. Buatlah program dari class diagram yang sudah anda buat di no 1! 

    ![Tugas2](img/TUgas2.PNG)

    Link code class Sewa : [Kllik disini](../../src/3_Enkapsulasi/Sewa1841720085Falaah.java) 

    Link code class Demo Sewa : [Kllik disini](../../src/3_Enkapsulasi/DemoSewa1841720085Falaah.java) 

3. Program dari Class diagram Lingkaran

   ![Tugas3](img/Tugas3.PNG)

   Link code class Lingkaran : [Kllik disini](../../src/2_Class_dan_Object/Lingkran184172085Falaah.java) 

   Link code class Test Lingkaran : [Kllik disini](../../src/2_Class_dan_Object/TestLingkaran1841720085Falaah.java) 


4. Program Class diagram Barang

   Deskripsi / Penjelasan :
    
    a. Nilai atribut hargaDasar dalam Rupiah dan atribut diskon dalam %
    
    b. Method hitungHargaJual() digunakan untuk menghitung harga jual dengan perhitungan berikut ini: 
    
    **harga jual = harga dasar – (diskon x harga dasar)**

    ![Tugas4](img/Tugas4.PNG)

    Link code class Barangn : [Kllik disini](../../src/2_Class_dan_Object/TugasBarang1841720085Falaah.java) 

    Link code class Demo : [Kllik disini](../../src/2_Class_dan_Object/DemoTugasBarang1841720085Falaah.java) 

## Kesimpulan

 Hal dapat disimpulkan dari praktikum dan juga tugas yang telah dilakukan, berupa  bahwa suatu class diagram  adalah rancangan dasar pada suatu pembuatan program. Selain pada praktikum dan juga tugas terdapat method yang dapat mengembalikan nilai yang gunanya sendiri adalah 'return' dimana kita tidak dapat menggunakannya sebagai pengidentifikasi. 'return' digunakan untuk keluar dari suatu metode, dengan atau tanpa nilai. 'return' dapat digunakan dengan metode dalam dua cara

 1. Methods returning a value: Untuk metode yang menentukan jenis return, yang pernyataan return-nya harus diikuti oleh nilai return.
 2. Methods not returning a value : Untuk metode yang tidak mengembalikan nilai, pernyataan return dapat dilewati.

Serta bagaimana kita harus benar-benar teliti mengenai penulisan dan penggunaan fungsi yang sudah dipraktikan.



## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

(**Muhammad Falaah Azmi**)

