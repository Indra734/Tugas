//Dan kita membuat class baru sebagai Main Class dari class Buku
class DemoBuku {

    //Disini kita memasukkan fungsi main karenan merupakan titik awal pengeksekusian program, maka program nya harus menggunakan main. Dan jika tidak menggunakan fungsi main program ini tidak bisa dijalankan
    public static void main(String[] args) {

        //Disini kita memanggil file class yang sudah terisi beberapa tipe data, variable, constructor dan method sebelumnya. Dengan memasukkan nama class yang sebelumnya lalu diikuti variabel dan kata kunci new, serta nama class sebelumnya
        Buku buku = new Buku();

        //Kita memanggil method yang sudah kita deklarasikan sebelumnya pada class Buku, dengan memasukkan variabel ketika memanggil class sebelumnya lalu titik "." dan diikuti dengan nama method serta inputan parameternya.
        buku.setInfoBuku("SEBUAH SENI UNTUK BERSIKAP BODO AMAT", "The Subtle Art Of Not Giving A F*ck", "Mark Manson",  246, "PT Gramedia", 2018);
        buku.sinopsisBuku();
        buku.peminjaman(3);
    }
}
