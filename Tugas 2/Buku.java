//Membuat sebuah class dengan nama Buku dan masukkan beberapa tipe data beserta variabelnya
class Buku {
    String judul;
    String pengarang;
    int jumlahHalaman;
    String penerbit;
    String judulAsli;
    int tahunTerbit;
    int jangkaPinjam;

    //Selanjutnya kita membuat tiga constructor. Tanpa parameter, dengan satu parameter, dan dengan 6 parameter.
    Buku(){
    }

    Buku(int jangkaPinjam){
    }

    Buku(String judul, String judulAsli, String pengarang, int jumlahHalaman, String penerbit, int tahunTerbit){
    }

    //Membuat tiga method dengan dengan dua method void dan dua method non-void
    //Disini kita akan membuat beberapa info Buku yang menjadi target kita kali ini seperti beberapa identitas buku seperti Judul Buku, Pengarang, dan beberapa identitas lainnya
    void setInfoBuku (String judul, String judulAsli, String pengarang, int jumlahHalaman, String penerbit, int tahunTerbit){
        System.out.println("Judul Buku  \t: "+ judul +
                "\nJudul Asli     \t: "+judulAsli+
                "\nPengarang      \t: "+ pengarang +
                "\nJumlah Halaman \t: "+ jumlahHalaman +
                "\nPenerbit       \t: "+ penerbit +
                "\nTahun Terbit   \t: "+ tahunTerbit);
    }

    //Selanjutnya method non-void kita disini tidak menggunakan parameter tapi berbeda dengan method void, method non-void harus menggunakan kata kunci result karena method non-void mengembalikan nilai
    String sinopsisBuku (){
        var infoBuku = "Sinopsis     \t: Novel yang berjudul Sebuah Seni Untuk Bersikap Bodo Amat merupakan kisah nyata tentang seseorang yang bernama Charles Bukowski yang mempunyai masa lalu yang kelam, suka mabuk-mabukan, berjudi, mempermainkan wanita, tukang utang, kasar dan seorang penyair.";
        System.out.println(infoBuku);
        return infoBuku;
    }

    //Dan pada method ketiga cukup sederhana karena method void tidak mengembalikan nilai apapun tidak usah menggunakan kata kunci result.
    void peminjaman (int jangkaPinjam){
        System.out.println("Lama peminjaman Buku : \t"+jangkaPinjam+" hari");
    }
}
