public class Tayo {

    void a(String mobilType){
        System.out.println("Merek Mobil \t: "+mobilType);
    }

    void a(String warna, int jumlahRoda, String noPlat){
        System.out.println("Warna Mobil \t: "+warna);
        System.out.println("Jumlah Roda \t: "+jumlahRoda);
        System.out.println("Nomor Plat   \t: "+noPlat);
    }

    void a(int kecepatan, int waktu){
        System.out.println("Kecepatan Mobil : "+kecepatan+" km/jam");
        System.out.println("Waktu Tempuh \t: "+waktu+" jam");
        System.out.println("Jarak Tempuh \t: "+(kecepatan*waktu)+" km");
    }


}